package com.aj.APItesting;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
public class CreateUser {

	@Test
	public  void createUser() {
		// TODO Auto-generated method stub

    RestAssured.baseURI="https://petstore.swagger.io/";
    
    Map header =new HashMap();
    header.put("content-type", "application/json");
    header.put("api-key", "special-key");
    
    String str1=given().headers(header).body("[\r\n" + 
    		"  {\r\n" + 
    		"    \"id\": 1,\r\n" + 
    		"    \"username\": \"vj\",\r\n" + 
    		"    \"firstName\": \"maa\",\r\n" + 
    		"    \"lastName\": \"kuu\",\r\n" + 
    		"    \"email\": \"aj1@gmail.com\",\r\n" + 
    		"    \"password\": \"aj@1234\",\r\n" + 
    		"    \"phone\": \"88\",\r\n" + 
    		"    \"userStatus\": 0\r\n" + 
    		"  }\r\n" + 
    		"]").when().post("v2/user/createWithList").then().extract().response().asString();
		
		System.out.println(str1);
	}

}
