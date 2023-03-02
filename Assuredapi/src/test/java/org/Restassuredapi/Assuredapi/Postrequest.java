package org.Restassuredapi.Assuredapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Postrequest {
	

	@Test

	public void postrequest() {
		JSONobject jsonobject = new JSONObject();
		jsonobject.put("name", "ram");
		jsonobject.put("job", "kumar");
		System.out.println(jsonobject.toString());

		RestAssured.baseURI = "https//localhost:30000";
		RestAssured.given().header("", "").body(jsonobject.toJSONString()).post("/posts").then().statusCode(201);
	}

	@Test

	public void Getrequest() {
		RestAssured.given().get("https://localhost:3000/posts")
		.getBody()
		.asPrettyString();
        System.out.println(asPrettyString);	
	} 
	
}
