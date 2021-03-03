package com.aws.codestar.mobile.app.controller;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Basic Spring web service controller that handles all GET requests.
 */
//@RestController
//@RequestMapping("/")
@Controller("/")
public class HelloWorldController {

	/*
	 * private static final String MESSAGE_FORMAT = "Mobile e %s!";
	 * 
	 * @RequestMapping(method = RequestMethod.GET, produces = "application/json")
	 * public ResponseEntity helloWorldGet(@RequestParam(value = "name",
	 * defaultValue = "Web-Serive") String name) { return
	 * ResponseEntity.ok(createResponse(name)); }
	 * 
	 * @RequestMapping(method = RequestMethod.POST, produces = "application/json")
	 * public ResponseEntity helloWorldPost(@RequestParam(value = "name",
	 * defaultValue = "Web-Serive") String name) { return
	 * ResponseEntity.ok(createResponse(name)); }
	 * 
	 * private String createResponse(String name) { return new
	 * JSONObject().put("Output", String.format(MESSAGE_FORMAT, name)).toString(); }
	 */
    @GetMapping
	public String indexPage(Model model) {
    	//model.addAllAttributes(null)
		return "index";
	}
}