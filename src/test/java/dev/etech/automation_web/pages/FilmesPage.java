package dev.etech.automation_web.pages;

import org.openqa.selenium.By;

public class FilmesPage {

    By filmesSubmenu = By.xpath("//a[@data-v-77f2d1d7 and child:: span[text()='Filmes']]");

    By nomeFilmesSubmenu = By.xpath("//h2[@data-v-965abeb2]");

    By pesquisaFilmes = By.xpath("//input[@class='input']");

    public By getFilmesSubmenu() {
        return filmesSubmenu;
    }

    public By getNomeFilmesSubmenu() {
        return nomeFilmesSubmenu;
    }

    public By getPesquisaFilmes() {
        return pesquisaFilmes;
    }
}
