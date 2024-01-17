package api.test;

import api.step.UserSteps;
import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.st;


public class GenerateUserTest {

    private final UserSteps steps = new UserSteps();


    @Test
    void shouldBeCreateUser() {

      steps.createUser();
      steps.getUser();
      steps.deleteUser();
      steps.getEmptyUser();

        var responseUser1 = steps.getEmptyUser();

        Assertions.assertThat(responseUser1.getType()).isEqualTo("error");

    }

    @Test
    void shouldBeDeleteUser() {

        steps.createUser();
        steps.getUser();
        steps.deleteUser();
        steps.deleteEmptyUser();

        var responseUser1 = RestAssured.delete("https://petstore.swagger.io/v2/user/Test888");
        int statusCode = responseUser1.getStatusCode();

        Assert.assertEquals(statusCode, 404);

    }


}
