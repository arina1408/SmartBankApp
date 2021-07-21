package com.example.smartbank.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.smartbank.model.*;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> 
  {
	// Write your Custom query

  }