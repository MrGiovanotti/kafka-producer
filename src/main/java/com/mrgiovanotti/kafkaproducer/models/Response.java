package com.mrgiovanotti.kafkaproducer.models;

import org.springframework.http.HttpStatus;

public class Response {

	private HttpStatus status;
	private String title;
	private String detail;

	public Response(HttpStatus status, String title, String detail) {
		this.status = status;
		this.title = title;
		this.detail = detail;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

}
