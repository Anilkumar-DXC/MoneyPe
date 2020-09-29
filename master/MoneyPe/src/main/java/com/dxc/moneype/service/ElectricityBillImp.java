


package com.dxc.moneype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dxc.moneype.entities.ElectricityBill;
import com.dxc.moneype.exception.ElectricityBillException;
import com.dxc.moneype.repository.ElectricityBillRepository;

@Service
public class ElectricityBillImp implements IElectricityBillService {
	@Autowired
	ElectricityBillRepository repo;

	

	@Override
	public ElectricityBill add(ElectricityBill electric)throws ElectricityBillException {
		
	    ElectricityBill isValid = validateElectricityBill(electric);
	    
	    if(isValid != null) {
	    	
	    	
	   	 return repo.save(electric);
			
	    }else {
	    	throw new ElectricityBillException("Transfer Failed....");
	    }
	
	    
}

 private ElectricityBill validateElectricityBill(ElectricityBill electric) {
	

	
	if((electric.getServiceNumber()>= 1000000000l)) {
		
		
	 return electric;
		
	}
	
	return null;
	
	
	
		
			}


}

