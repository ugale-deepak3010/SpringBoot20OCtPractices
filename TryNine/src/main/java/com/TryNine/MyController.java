package com.TryNine;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/create")
	public String createStudent() {
		return "Createing";
	}
}
