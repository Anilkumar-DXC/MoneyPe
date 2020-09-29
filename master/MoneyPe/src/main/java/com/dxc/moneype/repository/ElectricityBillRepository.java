package com.dxc.moneype.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.dxc.moneype.entities.ElectricityBill;
@Service
public interface ElectricityBillRepository extends JpaRepository<ElectricityBill, String> {

}
