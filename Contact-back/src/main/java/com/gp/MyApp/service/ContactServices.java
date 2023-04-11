package com.gp.MyApp.service;


import java.util.List;

import com.gp.MyApp.ent.Contacts;


public interface ContactServices {
	
        public Contacts getContact(String email);
        public Contacts addContact(Contacts customer);
        public List<Contacts> getallCustomer();



}
