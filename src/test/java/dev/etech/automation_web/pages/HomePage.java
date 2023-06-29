package dev.etech.automation_web.pages;

import dev.etech.automation_web.commons.BaseTest;
import org.openqa.selenium.By;

public class HomePage {

    By tittleUsusario = By.xpath("//p[@class='logged-user']");
    By adicionarFilme = By.xpath("//button [@class='button']");
    By filmeCriadoSucesso = By.xpath("//div[@class='Vue-Toastification__toast-body']");
    By homeSubmenu = By.xpath("//li[@data-v-77f2d1d7 and descendant:: span[text()='Home']]");
    By filmesSubmenu = By.xpath("//a[@data-v-77f2d1d7 and child:: span[text()='Filmes']]");
    By seriesSubmenu = By.xpath("//li[@data-v-77f2d1d7 and descendant:: span[text()='Séries']]");
    By opcaoSubmenu = By.xpath("// span[@data-v-77f2d1d7]");
    By nomeHomeSubmenu = By.xpath("//h3 [@data-v-33933adf and ancestor:: div[@class='d-flex justify-between align-items-center']]");
    By nomeFilmesSubmenu = By.xpath("//h2[@data-v-965abeb2]");
    By nomeSeriesSubmenu = By.xpath("//h2[@data-v-362558b1]");
    By pesquisaHome = By.xpath("//input[@class='input']");
    By pesquisaFilmes = By.xpath("//input[@class='input']");
    By pesquisaSeries = By.xpath("//input[@class='input']");
    By textoTituloPesquisa = By.xpath("//img[@alt='Vingadores: Ultimato']");
    By pesquisaButon = By.xpath("//img[@src='/img/search-icon.74722805.svg']");
    By loading = By.xpath("//div[@aria-busy='true']");

    public By getTittleUsusario() {
        return tittleUsusario;
    }

    public By getAdicionarFilme() {
        return adicionarFilme;
    }

    public By getFilmeCriadoSucesso() {
        return filmeCriadoSucesso;
    }

    public By getSeriesSubmenu() {
        return seriesSubmenu;
    }

    public By getNomeHomeSubmenu() {
        return nomeHomeSubmenu;
    }

    public By getOpcaoSubmenu() {
        return opcaoSubmenu;
    }

    public By getHomeSubmenu() {
        return homeSubmenu;
    }

    public By getFilmesSubmenu() {
        return filmesSubmenu;
    }

    public By getNomeFilmesSubmenu() {
        return nomeFilmesSubmenu;
    }

    public By getNomeSeriesSubmenu() {
        return nomeSeriesSubmenu;
    }

    public By getPesquisaHome() {
        return pesquisaHome;
    }

    public By getPesquisaFilmes() {
        return pesquisaFilmes;
    }

    public By getPesquisaSeries() {
        return pesquisaSeries;
    }

    public By getTextoTituloPesquisa() {
        return textoTituloPesquisa;
    }

    public By getPesquisaButon() {
        return pesquisaButon;
    }

    public By getLoading() {
        return loading;
    }
}
