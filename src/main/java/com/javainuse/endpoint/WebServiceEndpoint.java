package com.javainuse.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.javainuse.InputSOATest;

import com.javainuse.ObjectFactory;
import com.javainuse.OutputSOATest;


@Endpoint
public class WebServiceEndpoint {

	private static final String NAMESPACE_URI = "http://javainuse.com";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "inputSOATest")
	@ResponsePayload
	public OutputSOATest hello(@RequestPayload InputSOATest request) {

		String outputString = "First Name: " + request.getNom() + "!";
		String outputString1 = "Last Name : " + request.getPrenom() + "!";
		ObjectFactory factory = new ObjectFactory();
		OutputSOATest response = factory.createOutputSOATest();
		response.setResult2(outputString1);
		response.setResult1(outputString);
		return response;
	}

	
}