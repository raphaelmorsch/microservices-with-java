package com.redhat.examples.hellomicroprofile.rest;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/api")
public class HelloRestController {

	@GET
	@Produces("text/plain")
	@Path("/hello")
	public String hello() {

		String hostname = null;
		try {
			hostname = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			hostname = "unknown";
		}
		return "Hello Microprofile from " + hostname;

	}

}
