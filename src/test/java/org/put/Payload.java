package org.put;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Payload {
	
	

		
	
	public static String addplace() {
	
		RestAssured.baseURI = "https://rahulshettyacademy.com ";
		
		String s = "given().log().all().queryParam(\"key\" , \"qaclick123\").header(\"Content-Type\" , \"application/json\").body(\"{\\r\\n\"\r\n"
				+ "						+ \"  \\\"location\\\": {\\r\\n\"\r\n"
				+ "						+ \"    \\\"lat\\\": -38.383494,\\r\\n\"\r\n"
				+ "						+ \"    \\\"lng\\\": 33.78654\\r\\n\"\r\n"
				+ "						+ \"  },\\r\\n\"\r\n"
				+ "						+ \"  \\\"accuracy\\\": 50,\\r\\n\"\r\n"
				+ "						+ \"  \\\"name\\\": \\\"AVB Technologies\\\",\\r\\n\"\r\n"
				+ "						+ \"  \\\"phone_number\\\": \\\"(+91) 123 456 7890\\\",\\r\\n\"\r\n"
				+ "						+ \"  \\\"address\\\": \\\"29, side mumbai, cohen 09\\\",\\r\\n\"\r\n"
				+ "						+ \"  \\\"types\\\": [\\r\\n\"\r\n"
				+ "						+ \"    \\\"herbal park\\\",\\r\\n\"\r\n"
				+ "						+ \"    \\\"shop\\\"\\r\\n\"\r\n"
				+ "						+ \"  ],\\r\\n\"\r\n"
				+ "						+ \"  \\\"website\\\": \\\"http://google.com\\\",\\r\\n\"\r\n"
				+ "						+ \"  \\\"language\\\": \\\"French-IN\\\"\\r\\n\"\r\n"
				+ "						+ \"}\\r\\n\"\r\n"
				+ "						+ \"\").\r\n"
				+ "		when().post(\"/maps/api/place/add/json\").\r\n"
				+ "		then().log().all().assertThat().statusCode(200);\r\n"
				+ "				\r\n"
				+ "";
 return s;
	}
	}
	


