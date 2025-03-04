package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.Sign_in_POM;
import utils.DriverManager;

public class SignInSteps {
    WebDriver driver;
    Sign_in_POM SignIn;

    public void launch() {
        DriverManager.initializeDriver();
        driver = DriverManager.getDriver();
        SignIn = new Sign_in_POM();
    }

    @When("User enters {string} and {string}")
    public void user_enters_credentials(String username, String password) {
        SignIn.enterUsername(username);
        SignIn.enterPassword(password);
        SignIn.tapSubmitButton();
    }

    @Then("User should see the homepage")
    public void user_should_see_the_homepage() {
        SignIn.verifyHomePage();
        driver.quit();
    }
}
