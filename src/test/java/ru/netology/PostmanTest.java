package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanTest {
    @Test
    void shouldTestPostBody(){
        given()
                .baseUri("https://postman-echo.com")
                .body("postman echo")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("postman echo"))
        ;
    }
}
