package com.nanosoft.OrderService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class OrderControler {

	@GetMapping("/orders")
	public String getOrder()
	{
		return ("Your order list is ready !!!");
	}
	
}
