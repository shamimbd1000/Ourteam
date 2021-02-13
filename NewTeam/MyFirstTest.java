package com.rest.ApplicationBasic;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class MyFirstTest {
	
	
	public void styles() {
	      RestAssured.given()
	                 .queryParam("", "")
	                 .when()
	                 .get("https://www.google.com/")
	                 .then();
	                  
	    
	  RestAssured.given() 
	             .expect() 
	               .when(); 
	  
	  
	  }
	 

	

	@Test
	public void getAllStudents() {
		
		RequestSpecification requestSpec=RestAssured.given();
		Response response = requestSpec.get("http://localhost:8080/student/list");
		response.prettyPrint();
		ValidatableResponse validatableResponse = response.then();
		validatableResponse.statusCode(200);
		
	}
	
	
}
  
	


