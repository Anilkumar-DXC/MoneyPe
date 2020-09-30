package com.dxc.moneype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.CreditCard;
import com.dxc.moneype.exception.CreditCardException;
import com.dxc.moneype.repository.CreditCardRepository;

@Service
public class CreditCardImp implements ICreditCardService {
	
	@Autowired
	CreditCardRepository repo;

	@Override
	public CreditCard add(CreditCard card) throws CreditCardException {
		
CreditCard isValid = validateCreditCard(card);
	    
	    if(isValid != null) {
	    	
	    	
	   	 return repo.save(card);
			
	    }else {
	    	throw new CreditCardException("Transfer Failed....");
	    }
	
	    
}

 private CreditCard validateCreditCard(CreditCard card) {
	

	
	if((card.getCreditcardNumber()>= 100000000000000l)) {
		
		
	 return card;
		
	}
	
	return null;
	
	
	
		
			}
}
