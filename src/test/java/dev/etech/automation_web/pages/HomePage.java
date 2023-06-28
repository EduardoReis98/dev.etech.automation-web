package dev.etech.automation_web.pages;

import org.openqa.selenium.By;

public class HomePage {

    By tittleUsusario = By.xpath("//p[@class='logged-user']");
    By adicionarFilme = By.xpath("//button [@class='button']");

    public By getTittleUsusario() {
        return tittleUsusario;
    }

    public By getAdicionarFilme() {
        return adicionarFilme;
    }
}
