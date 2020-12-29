package com.jsonpath.examples;

import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;

public class SearchJsonPathExample {
	
	static final String APIKEY = "75e3u4sgb2khg673cbv2gjup";
	
	@BeforeClass
	public static void init(){
		RestAssured.baseURI ="http://api.walmartlabs.com";
		RestAssured.basePath ="/v1";
	}
 @Test
 public void test001(){
	 
	 
	 System.out.println("-----------start of test001------------");
	 System.out.println("The total number of items");
	 System.out.println("-----------End of test----------");
	 
 }
 
 @Test
 public void test002(){
	 
	 
	 System.out.println("-----------start of test002------------");
	 System.out.println("The total number of items");
	 System.out.println("-----------End of test----------");
	 
	 
 }
 
}
