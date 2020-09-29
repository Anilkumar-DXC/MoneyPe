package com.dxc.moneype.service;

import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.CreditCard;

@Service
public interface ICreditCardService {
	
	 public CreditCard add(CreditCard card);

}
