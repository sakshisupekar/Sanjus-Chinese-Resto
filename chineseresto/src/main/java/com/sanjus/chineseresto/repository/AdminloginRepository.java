package com.sanjus.chineseresto.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanjus.chineseresto.model.Adminlogin;

@Repository
@Qualifier("admimRepo")
public interface AdminloginRepository  extends JpaRepository<Adminlogin, Integer>{
	 List<Adminlogin>findByEmailidAndPassword(String emailid, String password);

}
