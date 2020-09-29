package com.dxc.moneype.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.moneype.entities.UserKyc;


@Repository
public interface UserKycRepository extends JpaRepository<UserKyc, String>{
	

	 

}
