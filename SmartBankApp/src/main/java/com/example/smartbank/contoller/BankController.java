package com.example.smartbank.contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.smartbank.dao.AccountRepo;
import com.example.smartbank.model.Account;

@Controller
public class BankController {

	@Autowired
	AccountRepo repo;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/add")
	public String addAccount(Account account) {
		repo.save(account);
		return "home";
	}

	@GetMapping(path = "/accounts", produces = { "application/json" })
	@ResponseBody
	public List<Account> getAccount() {
		return repo.findAll();

	}

	@GetMapping(path = "/accounts/{accountnumber}", produces = { "application/json" })
	@ResponseBody
	public Optional<Account> getAccountRest(@PathVariable("accountnumber") int accountnumber) {

		return repo.findById(accountnumber);
	}

	@PostMapping(path = "/accounts", consumes = { "application/json" })
	@ResponseBody
	public Account addAccountPost(@RequestBody Account account) {
		repo.save(account);
		return account;
	}

	@GetMapping("/view")
	public String viewAccount(Model model) {
		List<Account> listaccount = repo.findAll();
		model.addAttribute("listaccount", listaccount);
		return "viewAccount";
	}

	@GetMapping("/close")
	public String closeAccount(Model model) {
		List<Account> listaccount = repo.findAll();
		model.addAttribute("listaccount", listaccount);
		return "closeAccount";
	}

	@RequestMapping("/delete/{accountnumber}")
	public String deleteAccount(@PathVariable(name = "accountnumber") int accountnumber) {
		repo.deleteById(accountnumber);
		return "redirect:/close";
	}

}
