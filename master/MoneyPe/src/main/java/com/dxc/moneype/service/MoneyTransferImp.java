package com.dxc.moneype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.MoneyTransfer;
import com.dxc.moneype.exception.MoneyTransferException;
import com.dxc.moneype.repository.MoneyTransferRepository;

@Service
public class MoneyTransferImp implements IMoneyTransfer {
	
	@Autowired
	MoneyTransferRepository repo;

	@Override
	public MoneyTransfer add(MoneyTransfer transfer) throws MoneyTransferException{
		
		MoneyTransfer isValid=ValidateMoneyTransfer(transfer);
		
		if(isValid !=null) {
			
			return repo.save(transfer);
		}else {
			
			throw new MoneyTransferException("Transcation Failed....");
		}
		
		
	}
	
	private MoneyTransfer ValidateMoneyTransfer(MoneyTransfer transfer) {
		
		if((transfer.getAccountNo()>=100000000000l) && (transfer.getBankIFSC().length()>=11) &&(transfer.getAmount()>0)) {
			
			return transfer;
		}
		
		return null;
	}
	

}
