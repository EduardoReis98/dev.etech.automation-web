package dev.etech.automation_web.commons;

import dev.etech.automation_web.interfaces.AplicacaoWeb;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    public static WebDriver driver;

    protected void iniciaciarDriver(AplicacaoWeb aplicacaoWeb){
        driver = aplicacaoWeb.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);




    }
}
