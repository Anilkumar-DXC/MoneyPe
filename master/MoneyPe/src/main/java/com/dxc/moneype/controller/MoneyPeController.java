package com.dxc.moneype.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.moneype.entities.CreditCard;
import com.dxc.moneype.entities.Deposit;
import com.dxc.moneype.entities.ElectricityBill;
import com.dxc.moneype.entities.LifeInsurance;
import com.dxc.moneype.entities.MiniStatement;
import com.dxc.moneype.entities.MobileRecharge;
import com.dxc.moneype.entities.MoneyTransfer;
import com.dxc.moneype.entities.UserKyc;
import com.dxc.moneype.entities.UserRegistration;
import com.dxc.moneype.entities.WaterBill;
import com.dxc.moneype.entities.Withdraw;
import com.dxc.moneype.service.ICreditCardService;
import com.dxc.moneype.service.IDepositService;
import com.dxc.moneype.service.IElectricityBillService;
import com.dxc.moneype.service.ILifeInsurance;
import com.dxc.moneype.service.IMiniStatement;
import com.dxc.moneype.service.IMobileRecharge;
import com.dxc.moneype.service.IMoneyTransfer;
import com.dxc.moneype.service.IUserKycService;
import com.dxc.moneype.service.IUserRegistrationService;
import com.dxc.moneype.service.IWaterBill;
import com.dxc.moneype.service.IWithdrawService;

@RestController
@RequestMapping("/MoneyPe")
@CrossOrigin("http://localhost:4200")
public class MoneyPeController{
	
	@Autowired
	UserRegistration register;
	
	@Autowired
	IUserRegistrationService service;
	

	@Autowired
    UserKyc kyc;

	@Autowired
     IUserKycService service1;
	
	@Autowired
	CreditCard credit;
	
	@Autowired
	ICreditCardService service2;
	
	@Autowired
	ElectricityBill electric;
	
	@Autowired
	IElectricityBillService service3;
	
	@Autowired
	LifeInsurance insurance;
	
	@Autowired
	ILifeInsurance service4;
	
	@Autowired
	MobileRecharge recharge;
	
	@Autowired
	IMobileRecharge service5;
	
	@Autowired
	MoneyTransfer transfer;
	
	@Autowired
	IMoneyTransfer service6;
	
	@Autowired
	WaterBill water;
	
	@Autowired
	IWaterBill service7;
	
	@Autowired
	Deposit deposit;
	
	@Autowired
	IDepositService service8;
	
	@Autowired
	Withdraw withdraw;
	
	@Autowired
	IWithdrawService service9;
	
	@Autowired
	MiniStatement mini;
	
	@Autowired
	IMiniStatement service10;
	
	
	
	
	
	
	@PostMapping(path = "/add")
	public UserRegistration add(@RequestBody UserRegistration register) {
		
		return service.add(register);
	}
	


	@PostMapping("/addkyc")
   public UserKyc add(@RequestBody UserKyc kyc) 
	{
		
      return service1.add(kyc);

	}
	
	
	@PostMapping("/creditcard")
	public CreditCard add(@RequestBody CreditCard card) {
		
		return service2.add(card);
	}
	
	
	
	@PostMapping("/electric")
	public ElectricityBill add(@RequestBody ElectricityBill electric) {
		
		return service3.add(electric);
	}
	
	
	
	@PostMapping("/lifeinsurance")
	public LifeInsurance add(@RequestBody LifeInsurance insurance) {
		
		return service4.add(insurance);
	}
	
	
	@PostMapping("/recharge")
	public MobileRecharge add(@RequestBody MobileRecharge recharge) {
		
		
		return service5.add(recharge);
	}
	
	
	
	@PostMapping("/moneytransfer")
	public MoneyTransfer add(@RequestBody MoneyTransfer transfer) {
		
		return service6.add(transfer);
	}
	
	
	@PostMapping("/waterbill")
	public WaterBill add(@RequestBody WaterBill water) {
		
		return service7.add(water);
	}
	
	@PostMapping("/deposit")
	public Deposit add(@RequestBody Deposit deposit) {
		
		return service8.add(deposit);
	}
	
	@PostMapping("/withdraw")
	public Withdraw add(@RequestBody Withdraw withdraw) {
		
		return service9.add(withdraw);
	}
	
	@GetMapping("/getministatement")
	public List<MiniStatement> getOne(){
		
		return service10.getMini();
	}
	
	@GetMapping("/balance")
	public List<Deposit> balance(){
		
		return service8.getBalance();
	}
	
	
	
	
	

}
