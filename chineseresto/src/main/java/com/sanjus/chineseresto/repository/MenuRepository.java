package com.sanjus.chineseresto.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sanjus.chineseresto.model.Menu;

@Repository
@Qualifier("menuRepo")
public interface MenuRepository extends JpaRepository<Menu, Integer> {

}
