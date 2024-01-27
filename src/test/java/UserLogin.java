import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserLogin {

    @Test
    public void successfulRegistration() {
        String email = "alex2@gmail.com";
        String password = "Password100_";
        String endPoint = "https://www.apicademy.dev/api/auth/signup";

        String requestBody = String.format("{\n" +
                "  \"email\": \"%s\",\n" +
                "  \"password\": \"%s\"\n" +
                "}", email, password);


        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .post(endPoint);


        int statusCode = response.statusCode();
        String userEMail = response.jsonPath().get("data.user.email");
        String role = response.jsonPath().get("data.user.role");
        String access_token = response.jsonPath().get("data.user.access_token");


        Assert.assertEquals(statusCode, 201);
    }
}
