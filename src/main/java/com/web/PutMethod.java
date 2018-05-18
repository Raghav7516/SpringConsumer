package com.web;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class PutMethod {
	public static void main(String[] args) {
		Client client=Client.create();
		String url="http://localhost:2022/edit";
		String data="{\"truckDriverId\":\"6\",\"truckDriverName\": \"jagan\",\"truckDriverAddress\":\"gwl\",\"truckDriverContact\": \"236\"}";
		WebResource web=client.resource(url);
		ClientResponse response=web.type(MediaType.APPLICATION_JSON_TYPE).put(ClientResponse.class, data);
		String message=response.getEntity(String.class);
		System.out.println(message);
	}

}
