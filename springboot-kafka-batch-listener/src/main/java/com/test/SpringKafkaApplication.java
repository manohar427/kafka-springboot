package com.test;

import com.test.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringKafkaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaApplication.class, args);
	}

	@Autowired
	private Sender sender;

	@Override
	public void run(String... strings) throws Exception {
		for (int i = 1; i < 100; i++) {
			sender.send("Sample Sender Message::::::" + i);
		}
	}
}