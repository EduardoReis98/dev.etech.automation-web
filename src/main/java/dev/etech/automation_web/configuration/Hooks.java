package dev.etech.automation_web.configuration;

import dev.etech.automation_web.commons.BaseTest;
import dev.etech.automation_web.enums.Web;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends BaseTest {

    @Before
    public void beforeTest(){
        super.iniciaciarDriver(Web.CHOROME);
    }

    @After

    public void afterTest(Scenario scenario){
        byte[] screnenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screnenshot, "image/png", scenario.getName());
        super.driver.quit();
    }
}
