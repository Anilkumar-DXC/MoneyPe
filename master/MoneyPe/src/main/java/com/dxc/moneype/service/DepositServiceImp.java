package com.dxc.moneype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.Deposit;
import com.dxc.moneype.repository.DepositRepository;

@Service
public class DepositServiceImp implements IDepositService{
	
	@Autowired
	DepositRepository repo;
	
	/*
	 * @Autowired Deposit emptyDeposit;
	 */

	@Override
	public Deposit add(Deposit deposit) {
		
		return repo.save(deposit);
	}

	/*@Override
	public Deposit balance(long accountNumber) {
		
		
	//	return repo.findById(accountNumber).orElse(emptyDeposit);
*/	}
	
