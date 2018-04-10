package com.example.demo.Controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cuscontroller {

	 	@Autowired
	    CustomerRepository customerRepository;
	 	
	 	@Autowired
	    DataSource dataSource;


	 	@RequestMapping(value = "/taril", method = RequestMethod.POST, produces = "application/json")
	 	
	    public CustomerEntity addTrail()  {
			
	 		CustomerEntity cust = new CustomerEntity(1L,"Rajesh","Majunu@gmail.com"); 
	 		customerRepository.save(cust);
	 		return null;
	    	
	    	
	    	
	    	

}
}