package com.test.springbootkafka1;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MyResource {

	@Autowired
	KafkaTemplate<String, User> kafkaTemplate;
	
	String topic = "zest-topic";

	public String pushMessage(String abc) {

		User user = new User();
		user.setName(abc);
		user.setSalary(12052);
		kafkaTemplate.send(topic, user);
		return "ok:" + new Date().toString();
	}
}
