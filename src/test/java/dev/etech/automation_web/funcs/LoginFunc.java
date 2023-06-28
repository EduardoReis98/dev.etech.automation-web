package dev.etech.automation_web.funcs;

import dev.etech.automation_web.commons.BaseTest;
import dev.etech.automation_web.pages.HomePage;
import dev.etech.automation_web.pages.LoginPage;
import org.junit.Assert;

public class LoginFunc extends BaseTest {

    LoginPage loginPage = new LoginPage();

    public String validarCadastro(){
        return driver.findElement(loginPage.getQueroCriarConta()).getText();
    }

    public void acessarLogin(){
        driver.get("https://automation-web.etech.dev/login");
    }

    public void realizarLogin(String email, String senha){
        driver.findElement(loginPage.getEmail()).sendKeys(email);
        driver.findElement(loginPage.getPassaword()).sendKeys(senha);
        driver.findElement(loginPage.getEntrarLogin()).click();
    }


}
