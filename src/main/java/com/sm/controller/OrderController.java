package com.sm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sm.config.PropertiesConfig;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class OrderController {
	@Autowired
	PropertiesConfig propertiesConfig;


	@GetMapping("/order")
	public String getOrders() {
		log.info("<<<<OrderController>>>>>>>>>" + propertiesConfig.getDbUser());
		return "db name from k8s config map:{"+propertiesConfig.getDbName()+"}, user name from secret: {"+propertiesConfig.getDbUser()+"}";
	}
	

	
}
