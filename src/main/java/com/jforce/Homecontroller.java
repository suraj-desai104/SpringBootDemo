package com.jforce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

	@GetMapping({"/","home"})
	public String Home() {
		return "Applixcation running on server";
	}
}
