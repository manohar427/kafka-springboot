package com.test.springbootkafka1;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MyResource {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	String topic = "zest-topic";

	public String pushMessage(String abc) {

		kafkaTemplate.send(topic, abc);
		return "ok" + new Date().toString();
	}
}
