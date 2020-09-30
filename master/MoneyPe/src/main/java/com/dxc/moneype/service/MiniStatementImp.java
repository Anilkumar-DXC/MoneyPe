package com.dxc.moneype.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.MiniStatement;
import com.dxc.moneype.repository.MiniStatementRepository;


@Service
public class MiniStatementImp implements IMiniStatement {
	
	@Autowired
	MiniStatementRepository repo;

	@Override
	public List <MiniStatement> getMini() {
		
		return repo.findAll();
	}

}
