package com.dxc.moneype.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Entity
@Component
public class WaterBill {
	@Id
	private long canNumber;
	private int amount;

	public long getCanNumber() {
		return canNumber;
	}

	public void setCanNumber(long canNumber) {
		this.canNumber = canNumber;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	

}
