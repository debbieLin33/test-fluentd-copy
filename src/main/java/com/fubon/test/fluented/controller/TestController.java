package com.fubon.test.fluented.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class TestController {
	
	Logger log = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String show(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		log.info("Hello World!!!");
		
		
		return "show enable";
		
		
	}

}
