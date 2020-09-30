package com.dxc.moneype.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.MiniStatement;

@Service
public interface IMiniStatement {
	
	public List<MiniStatement> getMini();

}
