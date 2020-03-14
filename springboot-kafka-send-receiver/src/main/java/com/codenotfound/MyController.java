package com.codenotfound;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codenotfound.kafka.producer.Sender;
import com.codenotfound.model.Car;

@RestController
@RequestMapping("/kafka")
public class MyController {

	@Autowired
	Sender myResource;

	@GetMapping("/test")
	public String test(@RequestParam("abc") String abc) {
		
		Car c = new Car();
		c.setMake(abc);
		c.setManufacturer(new Date().toString());
		c.setId("MH896");

		myResource.send(c);
		return "Submitted Successfully :" + new Date().toString();
	}
}
