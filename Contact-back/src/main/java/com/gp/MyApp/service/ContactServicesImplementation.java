package com.gp.MyApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gp.MyApp.dao.ContactDAO;
import com.gp.MyApp.ent.Contacts;

@Service
public class ContactServicesImplementation implements ContactServices {

	@Autowired
	private ContactDAO cdao;
	
	@Override
	public Contacts getContact(String name) {
		
		
		return cdao.findById(name).orElse(null);
	}

	@Override
	public Contacts addContact(Contacts cus) {
		// TODO Auto-generated method stub
		
		
		cdao.save(cus);
		return cus;
	}

	@Override
	public List<Contacts> getallCustomer() {
		
		return cdao.findAll();
	}

}
