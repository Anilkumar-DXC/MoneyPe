package com.dxc.moneype.service;

import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.WaterBill;

@Service
public interface IWaterBill {
	
	public WaterBill add(WaterBill water);

}
