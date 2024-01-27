package client;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserClient {
    public Response createUser(String email, String password) {
        String endPoint = "https://www.apicademy.dev/api/auth/signup";

        String requestBody = String.format("{\n" +
                "  \"email\": \"%s\",\n" +
                "  \"password\": \"%s\"\n" +
                "}", email, password);

        return RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post(endPoint);
    }
}
