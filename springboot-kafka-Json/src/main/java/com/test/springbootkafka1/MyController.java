package com.test.springbootkafka1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class MyController {

	@Autowired
	MyResource myResource;

	@GetMapping("/test")
	public String test(@RequestParam("abc") String abc) {
		System.out.println(abc);
		return myResource.pushMessage(abc);
	}
}
