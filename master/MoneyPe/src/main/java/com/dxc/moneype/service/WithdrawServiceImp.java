package com.dxc.moneype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dxc.moneype.entities.Withdraw;

import com.dxc.moneype.exception.WithdrawException;
import com.dxc.moneype.repository.WithdrawRepository;

@Service
public class WithdrawServiceImp implements IWithdrawService{
	
	@Autowired
	WithdrawRepository repo;

	@Override
	public Withdraw add(Withdraw withdraw) throws WithdrawException{
		
         Withdraw isValid=ValidateWithdraw(withdraw);
		
		if(isValid !=null) {
		
		return repo.save(withdraw);
		}else {
			
			throw new WithdrawException("withdraw failed");
		}
	}
	
	private Withdraw ValidateWithdraw(Withdraw withdraw) {
		
		if((withdraw.getAccountNumber()>=100000000000l) &&(withdraw.getAmount()>0)) {
			
			return withdraw;
		}
		
		return null;
	}{
		
		//return repo.save(withdraw);
	}
	

}
