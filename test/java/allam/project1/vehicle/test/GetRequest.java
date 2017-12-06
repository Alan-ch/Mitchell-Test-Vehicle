package allam.project1.vehicle.test;




import org.junit.Test;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetRequest {
	@Test
	public void testResponseCode(){
		Response resp =RestAssured.get("http://localhost:8080/vehicle/webapi/vehicles?make=Toyota");
		int code = resp.getStatusCode();
		System.out.println("status code is:" + code);
		Assert.assertEquals(code, 200);
	}

}
