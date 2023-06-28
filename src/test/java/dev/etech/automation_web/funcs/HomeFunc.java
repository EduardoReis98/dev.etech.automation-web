package dev.etech.automation_web.funcs;

import dev.etech.automation_web.commons.BaseTest;
import dev.etech.automation_web.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeFunc extends BaseTest {

    HomePage homePage = new HomePage();

    public String validarLogin(){
        return driver.findElement(homePage.getTittleUsusario()).getText();
    }

    public void selecionarAdicionarFilme(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(homePage.getAdicionarFilme()));
        driver.findElement(homePage.getAdicionarFilme()).click();
    }

    public void acessarCadastroFilme(){
        this.selecionarAdicionarFilme();
    }
}
