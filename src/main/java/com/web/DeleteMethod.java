package com.web;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class DeleteMethod {
	public static void main(String[] args) {
		Client client=Client.create();
		String url="http://localhost:2022/clear?driverId=4";
		WebResource web=client.resource(url);
		ClientResponse response=web.delete(ClientResponse.class);
		String message=response.getEntity(String.class);
		System.out.println(message);
	}

}
