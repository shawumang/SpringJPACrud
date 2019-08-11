package com.project.Crud.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Crud.domain.Account;
import com.project.Crud.repository.AccountRepository;
import com.project.Crud.service.AccountService;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountRepository repository;
	
	@Override
	public List<Account> fetch() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Account save(Account account) {
		// TODO Auto-generated method stub
		return repository.save(account);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Account update(Account account) {
		// TODO Auto-generated method stub
		return repository.save(account);
	}

}
