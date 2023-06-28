package dev.etech.automation_web.enums;

import dev.etech.automation_web.interfaces.AplicacaoWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public enum Web implements AplicacaoWeb {

    CHOROME {
        @Override
        public WebDriver getDriver() {
            return new ChromeDriver();
        }
    },

    FIREFOX {
        @Override
        public WebDriver getDriver() {
            return new FirefoxDriver();
        }
    }
    ;
}
