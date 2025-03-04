package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverManager;

public class Hooks {

    @Before
    public void setUp() {
        DriverManager.initializeDriver("Android");
    }

    @After
    public void tearDown() {
        if (DriverManager.getDriver() != null) {
            DriverManager.getDriver().quit();
        }
    }
}
