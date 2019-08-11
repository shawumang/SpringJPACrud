package com.project.Crud.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="account")
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotNull
	@Column(unique=true)
	private Long accno;
	private Double balance;
	private Double transactionAmount;
	private String transactionType;
	private LocalDateTime trannsactionTime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAccno() {
		return accno;
	}
	public void setAccno(Long accno) {
		this.accno = accno;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public LocalDateTime getTrannsactionTime() {
		return trannsactionTime;
	}
	public void setTrannsactionTime(LocalDateTime trannsactionTime) {
		this.trannsactionTime = trannsactionTime;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", accno=" + accno + ", balance=" + balance + ", transactionAmount="
				+ transactionAmount + ", transactionType=" + transactionType + ", trannsactionTime=" + trannsactionTime
				+ "]";
	}
	
	
	
}
