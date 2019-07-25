package com.Get;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class BaseclassAuthentication {
	
	@BeforeClass
   public void setup() {
	   RestAssured.authentication= RestAssured.preemptive().basic("ToolsQA","TestPassword");
   }
}
