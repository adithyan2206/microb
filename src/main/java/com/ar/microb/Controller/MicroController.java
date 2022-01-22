package com.ar.microb.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@RequestMapping("arController")
public class MicroController {
	
	Gson gson = new Gson();
	
	Logger l = LoggerFactory.getLogger(MicroController.class);
	
	@GetMapping(value="/getMessage")
	public String getMessage() {
		
		l.debug("Invoked getMessage method");
		l.info("Invoked getMessage method");
		
		return gson.toJson("Welcome to this controller !! ");
	}

}
