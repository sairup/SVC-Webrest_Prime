package com.sanorganics.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienController {
	
	@GetMapping("/Alien")
	public String getAlien()
	{
		return "Loading data for Aliens in progress";
	}

}
