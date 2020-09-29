package com.dxc.moneype.service;

import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.UserRegistration;

@Service
public interface IUserRegistrationService {
	
	public UserRegistration add(UserRegistration register);

}
