package com.dxc.moneype.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class CreditCard {
	
	@Id
	private long creditcardNumber;
	private int amount;

	public long getCreditcardNumber() {
		return creditcardNumber;
	}

	public void setCreditcardNumber(long creditcardNumber) {
		this.creditcardNumber = creditcardNumber;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	

	



}
