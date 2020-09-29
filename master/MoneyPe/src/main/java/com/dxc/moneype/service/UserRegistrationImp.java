package com.dxc.moneype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.UserRegistration;
import com.dxc.moneype.exception.UserRegistrationException;
import com.dxc.moneype.repository.UserRegistrationRepository;

@Service
public class UserRegistrationImp implements IUserRegistrationService {
	
	@Autowired
	UserRegistrationRepository repo;

	@Override
	public UserRegistration add( UserRegistration register) {
		
		return repo.save(register);
		/*throws UserRegistrationException{
		
		UserRegistration isValid=ValidateUserRegistration(register);
		
		if(isValid !=null) {
		
		return repo.save(register);
		}else {
			
			throw new UserRegistrationException("Registration Failed");
		}
	}
	
	private UserRegistration ValidateUserRegistration(UserRegistration register) {
		
		if((register.getPhoneNumber()>=1000000000l) && (register.getPostalCode()>=100000l)) {
			
			return register;
		}
		
		return null;*/
	}

	
}
