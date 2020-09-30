package com.dxc.moneype.service;

import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.Withdraw;

@Service
public interface IWithdrawService {
	
	
	public Withdraw add(Withdraw withdraw);

}
