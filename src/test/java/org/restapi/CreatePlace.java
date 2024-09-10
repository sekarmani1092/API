package org.restapi;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*; 


public class CreatePlace  {

	public static void main(String[] args) {
		
		
		RestAssured.baseURI ="https://rahulshettyacademy.com";
				given().log().all().queryParam("key" , "qaclick123").header("Content-Type" , "application/json").body("{\r\n"
						+ "  \"location\": {\r\n"
						+ "    \"lat\": -38.383494,\r\n"
						+ "    \"lng\": 33.78654\r\n"
						+ "  },\r\n"
						+ "  \"accuracy\": 50,\r\n"
						+ "  \"name\": \"AVB Technologies\",\r\n"
						+ "  \"phone_number\": \"(+91) 123 456 7890\",\r\n"
						+ "  \"address\": \"29, side mumbai, cohen 09\",\r\n"
						+ "  \"types\": [\r\n"
						+ "    \"herbal park\",\r\n"
						+ "    \"shop\"\r\n"
						+ "  ],\r\n"
						+ "  \"website\": \"http://google.com\",\r\n"
						+ "  \"language\": \"French-IN\"\r\n"
						+ "}\r\n"
						+ "").
		when().post("/maps/api/place/add/json").
		then().log().all().assertThat().statusCode(200);
				
		System.out.println("End...");
					}
}