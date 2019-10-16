package com.springrest.DXCSpringrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restdemo {

	@GetMapping(value="/test")
	public String getReq() {
		return "this is get request";
	}
}
