package com.dxc.moneype.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.moneype.entities.UserRegistration;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistration, String> {

}
