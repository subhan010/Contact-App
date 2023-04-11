package com.gp.MyApp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gp.MyApp.ent.Contacts;
import com.gp.MyApp.service.ContactServices;


@RestController
public class AppController {
	///get customer information
		
		
		
		@Autowired
		private ContactServices csi;
		
		
	
		
		
		@GetMapping("/contact/{name}")
		public Contacts getContact(@PathVariable String name)
		{
		
			return  csi.getContact(name);
		}
		///add customer information to database
		@PostMapping("/contact")
		public Contacts addCustomer(@RequestBody Contacts cus)
		{
			
			return csi.addContact(cus);
		}
		
		

		
		@GetMapping("/allcustomer")
		public List<Contacts> getallcus()
		{
		
			return csi.getallCustomer();
		}
		
		

	
	

}
