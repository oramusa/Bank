package com.scholas.Bank;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@RequestMapping("/hello")
	public String test() {
		return "Spring boot running";
	}
	
}
