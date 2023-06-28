package dev.etech.automation_web.pages;

import org.openqa.selenium.By;

public class CadastroFilmePage {

    By filme = By.xpath("//input[@class='input' and following-sibling:: label[text()=' Nome do filme ']]");
    By anoLancamento = By.xpath("//input[@class='input' and following-sibling:: label[text()=' Ano de lançamento ']]");
    By linkTrailerYoutube = By.xpath("//input[@class='input' and following-sibling:: label[text()=' Link do trailer no youtube ']]");
    By capaFilme = By.id("file");
    By selectGenero = By.xpath("//option[@value and preceding-sibling:: option[@disabled]]");
    By duracao = By.xpath("//input[@class='input' and following-sibling:: label[text()=' Duração ']]");
    By direcao = By.xpath("//input[@class='input' and following-sibling:: label[text()=' Direção ']]");
    By comentario = By.xpath("//textarea[@placeholder='O que você achou?']");
    By estrela = By.xpath("//span[@class='vue-star-rating-pointer vue-star-rating-star']");
    By adicionarFilme = By.xpath("//button[@class='button btn-filled']");

    public By getFilme() {
        return filme;
    }

    public By getAnoLancamento() {
        return anoLancamento;
    }

    public By getLinkTrailerYoutube() {
        return linkTrailerYoutube;
    }

    public By getCapaFilme() {
        return capaFilme;
    }

    public By getSelectGenero() {
        return selectGenero;
    }

    public By getDuracao() {
        return duracao;
    }

    public By getDirecao() {
        return direcao;
    }

    public By getComentario() {
        return comentario;
    }

    public By getEstrela() {
        return estrela;
    }

    public By getAdicionarFilme() {
        return adicionarFilme;
    }
}
