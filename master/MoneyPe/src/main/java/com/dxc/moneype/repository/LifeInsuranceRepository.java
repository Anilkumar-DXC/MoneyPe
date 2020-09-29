package com.dxc.moneype.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.moneype.entities.LifeInsurance;

@Repository
public interface LifeInsuranceRepository extends JpaRepository<LifeInsurance, String> {

}
