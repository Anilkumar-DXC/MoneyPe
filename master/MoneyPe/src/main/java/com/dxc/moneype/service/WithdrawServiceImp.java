package com.dxc.moneype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.Withdraw;
import com.dxc.moneype.repository.WithdrawRepository;

@Service
public class WithdrawServiceImp implements IWithdrawService{
	
	@Autowired
	WithdrawRepository repo;

	@Override
	public Withdraw add(Withdraw withdraw) {
		
		return repo.save(withdraw);
	}
	

}
