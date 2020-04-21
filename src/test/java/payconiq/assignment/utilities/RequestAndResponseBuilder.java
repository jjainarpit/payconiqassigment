package payconiq.assignment.utilities;

import org.testng.annotations.BeforeClass;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class RequestAndResponseBuilder {
	String logdetail;
	public RequestSpecification requestSpec;
	public ResponseSpecification responseSpec;
	
	
	@BeforeClass
	public void setup() {
		
		RequestSpecBuilder req_Builder = new RequestSpecBuilder();
		
		req_Builder.setBaseUri("https://api.github.com");
		req_Builder.setContentType(ContentType.JSON);
		requestSpec = req_Builder.build();
		
		ResponseSpecBuilder res_Builder = new ResponseSpecBuilder();
		res_Builder.expectStatusCode(200);
		res_Builder.expectHeader("server", "GitHub.com");
		res_Builder.expectHeader("Content-Type", "application/json; charset=utf-8");
		responseSpec = res_Builder.build();
		
	}

}
