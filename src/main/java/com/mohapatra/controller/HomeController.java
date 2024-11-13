package com.mohapatra.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohapatra.response.ApiResponse;

@RestController
public class HomeController {

	@GetMapping
	public ApiResponse HomeControllerHandler() {
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage("Welcome to Mohapatra Grocery Store");
		return apiResponse;
	}
	
}
