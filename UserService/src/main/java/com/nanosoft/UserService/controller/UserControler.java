package com.nanosoft.UserService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserControler {

	@GetMapping("/users")
	public String getOrder()
	{
		return ("you will get  *********   User Information  !!! *********** ");
	}
	
}
