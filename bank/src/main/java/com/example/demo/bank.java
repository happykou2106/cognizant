package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class bank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int accNo;
	int deposit;
	int balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public bank(int id, int accNo, int deposit, int balance) {
		super();
		this.id = id;
		this.accNo = accNo;
		this.deposit = deposit;
		this.balance = balance;
	}
	public bank() {
		
		// TODO Auto-generated constructor stub
	}
	
	
}
