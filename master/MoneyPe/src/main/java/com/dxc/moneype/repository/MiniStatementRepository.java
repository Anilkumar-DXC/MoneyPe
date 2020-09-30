package com.dxc.moneype.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.moneype.entities.MiniStatement;

@Repository
public interface MiniStatementRepository extends JpaRepository<MiniStatement, String> {

}
