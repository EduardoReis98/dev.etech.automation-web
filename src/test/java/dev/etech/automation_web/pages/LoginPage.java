package dev.etech.automation_web.pages;

import org.openqa.selenium.By;

public class LoginPage {

    By queroCriarConta = By.xpath("//a[@class='link' and text()='Quero criar uma conta']");
    By email = By.id("email");
    By passaword = By.id("password");
    By entrarLogin = By.xpath("//button[@class='button btn-filled']");


    public By getQueroCriarConta() {
        return queroCriarConta;
    }

    public By getEmail() {
        return email;
    }

    public By getPassaword() {
        return passaword;
    }

    public By getEntrarLogin() {
        return entrarLogin;
    }
}
