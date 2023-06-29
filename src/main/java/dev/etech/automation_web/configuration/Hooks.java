package dev.etech.automation_web.configuration;

import dev.etech.automation_web.commons.BaseTest;
import dev.etech.automation_web.enums.Web;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {

    @Before
    public void beforeTest(){
        super.iniciaciarDriver(Web.CHOROME);
    }

    @After
    public void afterTest(){
        super.driver.quit();
    }
}
