package com.project.Crud.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Crud.domain.Account;
import com.project.Crud.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	AccountService accountService;

	Account account;

	static Logger logger = Logger.getLogger(AccountController.class);

	/**
	 * used to insert into database
	 * 
	 * @param account
	 * @return
	 * @throws Exception
	 */

	@PostMapping("/insert")
	public void save(@RequestBody Account account) throws Exception {
		logger.info("Inserting data into database account");
		if (account.getAccno()!= null) {
			accountService.save(account);
			logger.info("1 row inserted successfully");
		} else {

			throw new Exception("Please enter accno in Account table");
		}
	}

	/**
	 * used to update the database
	 * 
	 * @param account
	 * @return
	 * @throws Exception
	 */
	@PutMapping("/update")
	public void update(@RequestBody Account account) throws Exception {
		logger.info("Updating data in database account");
		if (account.getId() != null) {
			accountService.save(account);
			logger.info("1 record updated successfully");
//	return new ResponseEntity<Account>(a,HttpStatus.CREATED);
		} else {
			throw new Exception("Please provide the id of the record to be updated");
		}
	}

	@GetMapping("/list")
	public ResponseEntity<Account> findall() {
		logger.info("Searching for all records from database account");
		List<Account> a = accountService.fetch();
		return new ResponseEntity(a, HttpStatus.CREATED);

	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) throws Exception {
		logger.info("deleting records from database account");

		if (id != null) {

			 accountService.deleteById(id);
			 logger.info("deleted 1 row successfully");

		} else {
			throw new Exception("Please enter the row id to be deleted");
		}
	}

}
