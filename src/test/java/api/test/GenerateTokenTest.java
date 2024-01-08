package api.test;

import api.step.UserSteps;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GenerateTokenTest {

    @Test
    void generateToken() {
        var responseGenerateToken = new UserSteps().generateToken();

        assertThat(responseGenerateToken.getResult()).isEqualTo("User authorized successfully.");
    }
}
