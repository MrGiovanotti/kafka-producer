package com.mrgiovanotti.kafkaproducer.models;

public class Message {

	private String text;

	public Message() {

	}

	public Message(String message) {
		text = message;
	}

	public String getText() {
		return text;
	}

	public void setText(String message) {
		text = message;
	}

}
