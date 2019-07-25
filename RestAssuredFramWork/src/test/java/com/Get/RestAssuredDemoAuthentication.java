package com.Get;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAssuredDemoAuthentication extends BaseclassAuthentication {
    @Test
	public void test() {
	int	code=RestAssured.given() 
		.get("http://restapi.demoqa.com/authentication/CheckForAuthentication")
		.getStatusCode();
	     System.out.println("response code of server is"+code);
	}
	
	
}
