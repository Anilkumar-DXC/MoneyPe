package com.dxc.moneype.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.moneype.entities.CreditCard;
import com.dxc.moneype.entities.ElectricityBill;
import com.dxc.moneype.entities.LifeInsurance;
import com.dxc.moneype.entities.MobileRecharge;
import com.dxc.moneype.entities.MoneyTransfer;
import com.dxc.moneype.entities.UserKyc;
import com.dxc.moneype.entities.UserRegistration;
import com.dxc.moneype.entities.WaterBill;
import com.dxc.moneype.service.ICreditCardService;
import com.dxc.moneype.service.IElectricityBillService;
import com.dxc.moneype.service.ILifeInsurance;
import com.dxc.moneype.service.IMobileRecharge;
import com.dxc.moneype.service.IMoneyTransfer;
import com.dxc.moneype.service.IUserKycService;
import com.dxc.moneype.service.IUserRegistrationService;
import com.dxc.moneype.service.IWaterBill;

@RestController
@RequestMapping("/MoneyPe")
@CrossOrigin("http://localhost:4200")
public class MoneyPeController{
	
	@Autowired
	UserRegistration register;
	
	@Autowired
	IUserRegistrationService service;
	
	
	
	@PostMapping(path = "/add")
	public UserRegistration add(@RequestBody UserRegistration register) {
		
		return service.add(register);
	}
	
	@Autowired
    UserKyc kyc;

	@Autowired
     IUserKycService service1;


	@PostMapping("/addkyc")
   public UserKyc add(@RequestBody UserKyc kyc) 
	{
		
      return service1.add(kyc);

	}
	
	@Autowired
	CreditCard credit;
	
	@Autowired
	ICreditCardService service2;
	
	@PostMapping("/creditcard")
	public CreditCard add(@RequestBody CreditCard card) {
		
		return service2.add(card);
	}
	
	@Autowired
	ElectricityBill electric;
	
	@Autowired
	IElectricityBillService service3;
	
	@PostMapping("/electric")
	public ElectricityBill add(@RequestBody ElectricityBill electric) {
		
		return service3.add(electric);
	}
	
	@Autowired
	LifeInsurance insurance;
	
	@Autowired
	ILifeInsurance service4;
	
	@PostMapping("/lifeinsurance")
	public LifeInsurance add(@RequestBody LifeInsurance insurance) {
		
		return service4.add(insurance);
	}
	
	@Autowired
	MobileRecharge recharge;
	
	@Autowired
	IMobileRecharge service5;
	@PostMapping("/recharge")
	public MobileRecharge add(@RequestBody MobileRecharge recharge) {
		
		
		return service5.add(recharge);
	}
	
	@Autowired
	MoneyTransfer transfer;
	
	@Autowired
	IMoneyTransfer service6;
	
	@PostMapping("/moneytransfer")
	public MoneyTransfer add(@RequestBody MoneyTransfer transfer) {
		
		return service6.add(transfer);
	}
	
	@Autowired
	WaterBill water;
	
	@Autowired
	IWaterBill service7;
	@PostMapping("/waterbill")
	public WaterBill add(@RequestBody WaterBill water) {
		
		return service7.add(water);
	}
	
	
	
	
	

}
