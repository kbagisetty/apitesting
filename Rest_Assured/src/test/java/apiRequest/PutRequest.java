package apiRequest;

import org.json.simple.JSONObject;
import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequest {
	
	@Test
	public void putData() {
		
	RequestSpecification req = RestAssured.given();		
	req.header("Content-Type", "application/json");
	
	JSONObject jsono = new JSONObject();
	jsono.put("id", "26");
	jsono.put("title", "Selenium-server");
	jsono.put("author", "api-automation-using-restAssured");
	
	req.body(jsono.toJSONString());
	Response resp = req.put("http://localhost:3000/posts/25");
	int code = resp.getStatusCode();
	Assert.assertEquals(code, 200);
	}

}
