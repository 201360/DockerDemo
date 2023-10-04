package com.amdocs.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class keerthana {
	@GetMapping("/get")
	public String show() {
		String s="Welcome to Amdocs";
		return "Hello Keerthana"+s;
	}
}
