package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String testMethod()
	{
		return "This is a test method";
	}
	
	@RequestMapping(value="/test1",method=RequestMethod.GET)
	public String testMethod1()
	{
		return "This is a test method1";
	}
}
