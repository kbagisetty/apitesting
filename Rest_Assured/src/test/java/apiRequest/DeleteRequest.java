package apiRequest;


import org.testng.annotations.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;



public class DeleteRequest{
	
	@Test
	public void postTest(){
		
		RequestSpecification req = RestAssured.given();
		Response resp = req.delete("http://localhost:3000/posts/25");
		int code = resp.getStatusCode();
		Assert.assertEquals(code, 200);
		
		
	}

}
