package com.dxc.moneype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.LifeInsurance;
import com.dxc.moneype.exception.LifeInsuranceException;
import com.dxc.moneype.repository.LifeInsuranceRepository;

@Service
public class LifeInsuranceImp implements ILifeInsurance {
	
	@Autowired
	LifeInsuranceRepository repo;

	@Override
	public LifeInsurance add(LifeInsurance insurance) throws LifeInsuranceException{
		
		LifeInsurance isValid=ValidateLifeInsurance(insurance);
		
		if(isValid !=null) {
		
		return repo.save(insurance);
		}else {
			
			throw new LifeInsuranceException("Transcation failed");
		}
	}
	
	private LifeInsurance ValidateLifeInsurance(LifeInsurance insurance) {
		
		if((insurance.getPolicyNumber()>=1000000000l)) {
			
			return insurance;
		}
		
		return null;
	}

}
