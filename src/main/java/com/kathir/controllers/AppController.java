package com.kathir.controllers;

import com.kathir.request.TestRequestContainer;
import com.kathir.request.TestResponseContainer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/testing")
public class AppController {
	
	@RequestMapping(method = RequestMethod.GET, produces = {"application/json"})
	public @ResponseBody String helloWorld() {
		
		return "Hello World!!!"; 
	}

	@PostMapping("/helloworld")
	public ResponseEntity<TestResponseContainer> processHelloWorld(@RequestBody TestRequestContainer testRequestContainer) {
		TestResponseContainer testResponseContainer=new TestResponseContainer();
		testResponseContainer.response="Hello "+testRequestContainer.fname+"!!!";
		testResponseContainer.transactionCode="2001";
		return ResponseEntity.ok().body(testResponseContainer);
	}
}
