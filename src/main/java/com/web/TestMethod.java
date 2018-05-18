package com.web;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TestMethod {
	public static void main(String[] args) {
		Client client=Client.create();
		String url="http://localhost:2022/";
		WebResource resource=client.resource(url);
		ClientResponse clientResponse=(ClientResponse) resource.get(ClientResponse.class);
		String msg=(String) clientResponse.getEntity(String.class);
		System.out.println(msg);
	}

}
