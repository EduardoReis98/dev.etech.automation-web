package dev.etech.automation_web.pages;

import org.openqa.selenium.By;

public class HomePage {

    By tittleUsusario = By.xpath("//p[@class='logged-user']");
    By adicionarFilme = By.xpath("//button [@class='button']");
    By filmeCriadoSucesso = By.xpath("//div[@class='Vue-Toastification__toast-body']");
    public By getTittleUsusario() {
        return tittleUsusario;
    }

    public By getAdicionarFilme() {
        return adicionarFilme;
    }

    public By getFilmeCriadoSucesso() {
        return filmeCriadoSucesso;
    }
}
