package com.dxc.moneype.service;

import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.LifeInsurance;

@Service
public interface ILifeInsurance {
	
	public LifeInsurance add(LifeInsurance insurance);

}
