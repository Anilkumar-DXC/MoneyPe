		package com.dxc.moneype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.WaterBill;
import com.dxc.moneype.exception.WaterBillException;
import com.dxc.moneype.repository.WaterBillRepository;
@Service
public class WaterBillImp implements IWaterBill {
	
	@Autowired
	WaterBillRepository repo;

	@Override
	public WaterBill add(WaterBill water)throws WaterBillException {
		
		WaterBill isValid=ValidateWaterBill(water);
		if(isValid !=null) {
			
			return repo.save(water);
		}else {
			
			throw new WaterBillException("WaterBill Payment Failed");
		}
		
		
	}
	
	private WaterBill ValidateWaterBill(WaterBill water) {
		
		if((water.getCanNumber()>=100000000l) && (water.getAmount()>0)) {
			
			return water;
		}
		
		return null;
	}

}
