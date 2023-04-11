package com.gp.MyApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gp.MyApp.ent.Contacts;

public interface ContactDAO extends JpaRepository<Contacts,String> {

}
