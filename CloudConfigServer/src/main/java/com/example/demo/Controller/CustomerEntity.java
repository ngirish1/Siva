package com.example.demo.Controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerEntity {



	 	@Id
	    Long id;

	    String name;

		String email;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public CustomerEntity(Long id, String name, String email) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
		}

	   





}
