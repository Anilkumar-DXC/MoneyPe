package com.dxc.moneype.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.moneype.entities.CreditCard;

@Repository
public interface CreditCardRepository extends JpaRepository<CreditCard, String> {

}
