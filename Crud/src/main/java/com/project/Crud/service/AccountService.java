package com.project.Crud.service;

import java.util.List;

import com.project.Crud.domain.Account;

public interface AccountService {

	List<Account> fetch();
	
	Account save(Account account);
	
	void deleteById(Long id);
	
	Account update(Account account);
	
	
}
