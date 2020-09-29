package com.dxc.moneype.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.moneype.entities.MobileRecharge;


@Repository
public interface MobileRechargeRepository extends JpaRepository<MobileRecharge,String>{

}
