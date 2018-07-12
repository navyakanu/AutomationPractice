package tests.api_tests;


import org.testng.annotations.Test;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by navyab on 7/12/18.
 */
public class APITests {

    @Test
    public void sampleRestAssured() {
        given().
                when().
                get("https://reqres.in/api/users?page=2").then().
                statusCode(200).
                contentType("application/json").
                body("page",equalTo(2));



    }
}
