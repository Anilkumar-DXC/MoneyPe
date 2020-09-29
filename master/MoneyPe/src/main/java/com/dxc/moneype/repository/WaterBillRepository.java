package com.dxc.moneype.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.moneype.entities.WaterBill;

@Repository
public interface WaterBillRepository extends JpaRepository<WaterBill, String> {

}
