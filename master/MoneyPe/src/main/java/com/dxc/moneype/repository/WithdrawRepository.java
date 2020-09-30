package com.dxc.moneype.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.moneype.entities.Withdraw;

@Repository
public interface WithdrawRepository extends JpaRepository<Withdraw, String> {

}
