package org.Restassuredapi.Assuredapi;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

public class Getrequest {
	@Test
	public void get() {

		Response response = RestAssured.get("https://localhost:3000/posts");
		int statuscode = response.getStatusCode();
        String statusLine = response.getStatusLine();
		System.out.println(statuscode);
		String contentType = response.getContentType();
		System.out.println(contentType);
		ResponseBody body = response.getBody();
		System.out.println(body.asPrettyString());

	}

	@Test

	public void anotherGetRequest() {
		RestAssured.baseURI = "https://localhost:3000/posts";// basr urp
		ValidatableResponse statuscode = RestAssured.given()

				.get()// hitting
				.then().statusCode(200);
		System.out.println(statuscode);
	}
}
