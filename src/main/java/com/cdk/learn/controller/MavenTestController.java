package com.cdk.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdk.learn.entity.Associate;
import com.cdk.learn.entity.Customer;
import com.cdk.learn.repo.AssociateDAO;
import com.cdk.learn.test.AppService;


@RestController

public class MavenTestController {
		
	@Autowired
	private AppService appService;
	
	
	
	public AppService getAppService() {
		return appService;
	}

	public void setAppService(AppService appService) {
		this.appService = appService;
	}

	@RequestMapping(method=RequestMethod.GET, value =("/hello"))
	@ResponseBody
	public String sayHello(){
		return "should work";
		
		
	}
	
	@RequestMapping("/getAll")
//	public List<Customer> getAll(){
	public String getAll(){
		//System.out.println("Hello WOrld");
		return appService.getCustomers().toString();
	}
	
	@RequestMapping("/get/{id}")
	public String get(@PathVariable("id") int id){
		return appService.getCustomer(id).toString();
	}
	
	
}