package com.web;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class GetMethod {
	public static void main(String[] args) {
		Client client=Client.create();
		String url="http://10.10.0.98:2022/truck/1";
		WebResource web=client.resource(url);
		ClientResponse response=web.get(ClientResponse.class);
		String message=response.getEntity(String.class);
		System.out.println(message);
	}

}
