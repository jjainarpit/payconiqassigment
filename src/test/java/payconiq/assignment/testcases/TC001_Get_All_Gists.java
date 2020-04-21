package payconiq.assignment.testcases;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import payconiq.assignment.utilities.RequestAndResponseBuilder;

public class TC001_Get_All_Gists  extends RequestAndResponseBuilder{
	
	
	@Test(priority=1)
	public void getAllGistsForUser(){
		
	  	given()
	  	    .spec(requestSpec)
		.when()
			.get("/users/jjainarpit/gists")
		.then()
			.spec(responseSpec);
			
	}

	@Test(priority=2)
	public void getAllStarredGistsForUser(){
		
	  	given()
	  	    .spec(requestSpec)
		.when()
			.get("/users/jjainarpit/gists")
		.then()
			.spec(responseSpec);
			
	}

}
