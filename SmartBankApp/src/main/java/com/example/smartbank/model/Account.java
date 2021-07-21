package com.example.smartbank.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	private int accountnumber;
	private String accountname;
	private String branch;
	private String currency;
	private double availablebalance;

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getAccountname() {
		return accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getAvailablebalance() {
		return availablebalance;
	}

	public void setAvailablebalance(double availablebalance) {
		this.availablebalance = availablebalance;
	}

	@Override
	public String toString() {
		return "Account [accountnumber=" + accountnumber + ", accountname=" + accountname + ", branch=" + branch
				+ ", currency=" + currency + ", availablebalance=" + availablebalance + "]";
	}

}
