import client.UserClient;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class UserLogin {

    @Test
    public void successfulRegistration() {

        String email = String.format("%s@gmail.com", UUID.randomUUID().toString());
        String password = "password!_";

        Response response = new UserClient().createUser(email, password);

        int statusCode = response.statusCode();
        String userEMail = response.jsonPath().get("data.user.email");
        String role = response.jsonPath().get("data.user.role");

        Assert.assertEquals(statusCode, 201);
        Assert.assertEquals(email, userEMail);
        Assert.assertEquals(role, "authenticated");
    }
}
