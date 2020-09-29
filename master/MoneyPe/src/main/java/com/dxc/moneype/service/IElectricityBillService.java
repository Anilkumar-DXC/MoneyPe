package com.dxc.moneype.service;

import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.ElectricityBill;

@Service
public interface IElectricityBillService {
	
	public ElectricityBill add(ElectricityBill electric);

}
