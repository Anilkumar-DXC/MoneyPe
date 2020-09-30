package com.dxc.moneype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.UserKyc;
import com.dxc.moneype.exception.UserKycException;
import com.dxc.moneype.repository.UserKycRepository;

@Service
public class UserKycImp implements IUserKycService {
	
	@Autowired
	UserKycRepository repo;

	@Override
	public UserKyc add(UserKyc kyc)// {
		
	//	return repo.save(kyc);
			
			throws UserKycException {
		
		UserKyc isValid=ValidateUserKyc(kyc);
		
		if(isValid !=null) {
		
		return repo.save(kyc);
		}else {
			
			throw new UserKycException("Kyc upadte is failed");
		}
	}
	
	private UserKyc ValidateUserKyc(UserKyc kyc) {
		
		if((kyc.getAadharNumber()>=100000000000l) 
				
				&& (kyc.getAccountNumber()>=1000000000l)
				
				&& (kyc.getPanNumber().length()>=10)
				
				&& (kyc.getPhoneNumber()>=1000000000l) 
				
				&& (kyc.getPostalCode()>=100000l)) {
			
			return kyc;
			
			
		}
		
		return null;
	}

}
