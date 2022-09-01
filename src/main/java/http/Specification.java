
package http;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specification {
    private static final String baseUrl = "https://petstore.swagger.io/";

    public static RequestSpecification requestSpecification(){
        return new RequestSpecBuilder()
                .setBaseUri(baseUrl)
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                .setRelaxedHTTPSValidation()
                .build();
    }

    public static ResponseSpecification responseSpecification(){
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }

    public Specification() {
        RestAssured.requestSpecification = Specification.requestSpecification();
        RestAssured.responseSpecification = Specification.responseSpecification();
    }

}
