package com.project.Crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.Crud.domain.Account;

//@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}
