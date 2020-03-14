package com.codenotfound.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.codenotfound.model.Car;

@Service
public class Receiver {

	private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

	@KafkaListener(topics = "${app.topic.example}")
	public void receive(Car car) {
		LOGGER.info("received car='{}'", car.toString());
	}
}
