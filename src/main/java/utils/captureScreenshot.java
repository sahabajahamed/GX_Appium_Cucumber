package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;

import io.appium.java_client.AppiumDriver;

public class captureScreenshot {

    AppiumDriver driver;
    public void captureScreen(String fileName) {
        File scrFile = driver.getScreenshotAs(OutputType.FILE);
        File destFile = new File("screenshots/" + fileName + ".png");
        try {
            FileUtils.copyFile(scrFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
