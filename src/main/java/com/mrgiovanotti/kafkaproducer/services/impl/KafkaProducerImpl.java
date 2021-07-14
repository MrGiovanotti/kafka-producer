package com.mrgiovanotti.kafkaproducer.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.mrgiovanotti.kafkaproducer.AppProperties;
import com.mrgiovanotti.kafkaproducer.services.KafkaProducer;

@Service
public class KafkaProducerImpl implements KafkaProducer {

	@Autowired
	AppProperties properties;

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	@Override
	public void sendMessage(String message) {
		kafkaTemplate.send(properties.getTopic(), message);
	}

}
