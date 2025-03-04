package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.Sign_in_POM;
import utils.DriverManager;

public class SignInSteps {
    WebDriver driver;
    Sign_in_POM SignIn;

    @Given("User launches the app on {string}")
    public void user_launches_the_app(String platform) {
        DriverManager.initializeDriver(platform);
        this.driver = DriverManager.getDriver();
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
