package com.dxc.moneype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.Deposit;

import com.dxc.moneype.exception.DepositException;

import com.dxc.moneype.repository.DepositRepository;

@Service
public class DepositServiceImp implements IDepositService{
	
	@Autowired
	DepositRepository repo;
	
	/*
	 * @Autowired Deposit emptyDeposit;
	 */

	@Override
	public Deposit add(Deposit deposit) throws DepositException{
		
Deposit isValid=ValidateDeposit(deposit);
		
		if(isValid !=null) {
		
		return repo.save(deposit);
		}else {
			
			throw new DepositException("deposit failed");
		}
	}
	
	private Deposit ValidateDeposit(Deposit deposit) {
		
		if((deposit.getAccountNumber()>=100000000000l) &&(deposit.getAmount()>0)) {
			
			return deposit;
		}
		
		return null;
	}
		
		//return repo.save(deposit);
	}

	/*@Override
	public Deposit balance(long accountNumber) {
		
		
	//	return repo.findById(accountNumber).orElse(emptyDeposit);
*/	
	
