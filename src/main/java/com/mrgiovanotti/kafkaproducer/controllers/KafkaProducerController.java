package com.mrgiovanotti.kafkaproducer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrgiovanotti.kafkaproducer.models.Message;
import com.mrgiovanotti.kafkaproducer.models.Response;
import com.mrgiovanotti.kafkaproducer.services.KafkaProducer;

@RestController
@RequestMapping("/kafka")
public class KafkaProducerController {

	@Autowired
	KafkaProducer kafkaProducer;

	@PostMapping("/produce")
	public Response produce(@RequestBody Message message) {
		try {
			kafkaProducer.sendMessage(message.getText());
			return new Response(HttpStatus.OK, "Successful", "You've sent your message successfuly");
		} catch (Exception e) {
			return new Response(HttpStatus.INTERNAL_SERVER_ERROR, "fail", e.getMessage());
		}
	}

}
