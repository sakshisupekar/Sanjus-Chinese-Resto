package com.sanjus.chineseresto.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanjus.chineseresto.model.Registration;


@Repository
@Qualifier("regRepo")
public interface RegistrationRepository extends JpaRepository <Registration, Integer> {

	List<Registration> findByEmailidAndPassword(String emailid, String password);
}
