package com.dxc.moneype.service;

import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.Deposit;

@Service
public interface IDepositService {
	
	public Deposit add(Deposit deposit);
	
	//public Deposit balance(long accountNumber);

}
