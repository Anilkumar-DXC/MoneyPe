package com.dxc.moneype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.MobileRecharge;
import com.dxc.moneype.exception.MobileRechargeException;
import com.dxc.moneype.repository.MobileRechargeRepository;
@Service
public class MobileRechargeImp implements IMobileRecharge {
	
	@Autowired
	MobileRechargeRepository repo;
	

	@Override
	public MobileRecharge add(MobileRecharge recharge)  throws MobileRechargeException {
		
	    MobileRecharge isValid = validateMobileRecharge(recharge);
	    
	    if(isValid != null) {
	    	
	    	
	   	 return repo.save(recharge);
			
	    }else {
	    	throw new MobileRechargeException("Transfer Failed....");
	    }
	
	    
}

private MobileRecharge validateMobileRecharge(MobileRecharge recharge) {
	

	
	if((recharge.getMobileNumber() >= 1000000000l) && (recharge.getAmount()>0)) {
		
		
	 return recharge;
		
	}
	
	return null;
	
	
	
		
			}

}
