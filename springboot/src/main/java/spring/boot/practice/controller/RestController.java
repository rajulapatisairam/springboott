package spring.boot.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.boot.practice.dao.SpringDAO;
import spring.boot.practice.model.Customer;

@org.springframework.web.bind.annotation.RestController
public class RestController {
 
	@Autowired
	private SpringDAO dao;
	@RequestMapping("/rest")
	 public String welcome() {
	 return "Welcome to Spring Boot Tutorials";
	 }
	 
	 @RequestMapping("/hello")
	 public String myData() {
	 return "Hello Spring Boot";
	 }
	
	 
	 @RequestMapping("/getcustInfo")
	    public List<Customer> customerInformation() {
	        List<Customer> customers = dao.isData(); 
	        return customers;
	    }
}
