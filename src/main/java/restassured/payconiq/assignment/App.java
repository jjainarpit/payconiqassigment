package restassured.payconiq.assignment;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;


/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args ) {
    	  
//  //Create request - CREATE operation on Github gist API.
//  {  
//  	RestAssured.baseURI  = "https://api.github.com/";
//  	given()
//  	.header("Authorization", "Bearer " + "b7279b281a07d2ec29ee4e59de8e8e3460c4530a")
//  	.header("Content-Type", "text/plain")
//  	.body("{\n" + 
//  			"  \"description\": \"Hello World Examples\",\n" + 
//  			"  \"public\": true,\n" + 
//  			"  \"files\": {\n" + 
//  			"    \"hello_world.text\": {\n" + 
//  			"      \"content\": \"This is the hello world file created using the restAssured API\"\n" + 
//  			"    }\n" + 
//  			"  }\n" + 
//  			"}")
//  	.log().all()
//  	.when().post("gists")
//  	.then().log().all().assertThat().statusCode(201);
//  }
    
//    Get request - READ operation on Github gist API.
//    {  
//    	RestAssured.baseURI  = "https://api.github.com/";
//    	given()
//    	.header("Authorization", "Bearer " + "b7279b281a07d2ec29ee4e59de8e8e3460c4530a")
//    	.log().all()
//    	.when().get("gists/63059a55fe7122031055dff835663853")
//    	.then().log().all().assertThat().statusCode(200);
//    }
//    

    
//    
//  //Update request - UPDATE operation on Github gist API.
//    {  
//    	RestAssured.baseURI  = "https://api.github.com/";
//    	given()
//    	.header("Authorization", "Bearer " + "b7279b281a07d2ec29ee4e59de8e8e3460c4530a")
//    	.body("{\n" + 
//    			"  \"description\": \"Hello World Examples\",\n" + 
//    			"  \"files\": {\n" + 
//    			"    \"file1\": {\n" + 
//    			"      \"content\": \"This is update from restAssured framework\",\n" + 
//    			"      \"filename\": \"hello_world_new.md\"\n" + 
//    			"    },\n" + 
//    			"    \"file2\": {\n" + 
//    			"      \"content\": \"This is update from restAssured framework by file2\",\n" + 
//    			"      \"filename\": \"hello_world_new1.md\"\n" + 
//    			"    }\n" + 
//    			"  }\n" + 
//    			"}")
//    	.log().all()
//    	.when().patch("gists/b3539e9cd99efe43ffbddead8b4b9266")
//    	.then().log().all().assertThat().statusCode(200);
//    }
//}



	RestAssured.baseURI  = "https://api.github.com/";
	given()
	.header("Authorization", "Bearer " + "b7279b281a07d2ec29ee4e59de8e8e3460c4530a")
	.log().all()
	.when().delete("gists/63059a55fe7122031055dff835663853")
	.then().log().all().assertThat().statusCode(204);
	
    }
  }
    














