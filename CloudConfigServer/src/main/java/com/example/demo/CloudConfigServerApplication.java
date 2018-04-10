package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.CustomerRepository;

@SpringBootApplication
//@EnableConfigServer
public class CloudConfigServerApplication {
	 @Autowired
	 DataSource dataSource;
	 
	 
	 
	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServerApplication.class, args);
	}
}





/*@RefreshScope
@RestController
class MessageRestController{
	
	@Value("${message:Hello default}")
	private String message;
	
	@RequestMapping("/message")
	String getMessage(){
		return this.message;
	}

}*/
