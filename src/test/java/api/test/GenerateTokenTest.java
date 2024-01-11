package api.test;

import api.step.BookSteps;
import api.step.UserSteps;
import org.testng.annotations.Test;


public class GenerateTokenTest {

    private final UserSteps steps = new UserSteps();
    private final BookSteps bookSteps = new BookSteps();

    @Test
    void generateToken() {
        bookSteps.addBookToUser();
        System.out.println(steps.getUser());
    }
}
