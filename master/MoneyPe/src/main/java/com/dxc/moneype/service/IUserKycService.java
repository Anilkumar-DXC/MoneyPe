package com.dxc.moneype.service;

import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.UserKyc;


@Service
public interface IUserKycService {
	
	public UserKyc add(UserKyc kyc);

}
