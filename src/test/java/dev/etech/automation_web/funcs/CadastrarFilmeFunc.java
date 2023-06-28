package dev.etech.automation_web.funcs;

import com.github.javafaker.Faker;
import dev.etech.automation_web.commons.BaseTest;
import dev.etech.automation_web.pages.CadastroFilmePage;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CadastrarFilmeFunc extends BaseTest {

    CadastroFilmePage cadastroFilmePage = new CadastroFilmePage();
    Faker faker = new Faker(new Locale("pt-BR"));

    public void inserirNomeFilme(){
        String filme = faker.book().title();
        driver.findElement(cadastroFilmePage.getFilme()).sendKeys(filme);
    }

    public void inserirDataLancamento(){
        String lancamento = String.valueOf(faker.number().numberBetween(1990,2023));
        driver.findElement(cadastroFilmePage.getAnoLancamento()).sendKeys(lancamento);
    }

    public void inserirLinkTrailerYoutube(){
        String trailer = faker.internet().url();
        driver.findElement(cadastroFilmePage.getLinkTrailerYoutube()).sendKeys(trailer);
    }

    public void inserirCapaFilme(){
        WebElement upload = driver.findElement(cadastroFilmePage.getCapaFilme());
        upload.sendKeys("C:\\Users\\Eduardo Reis\\Pictures\\ImagenTeste\\imagenTest.jpg");
    }

    public void selecionarGenero(){
        int elemento = faker.number().numberBetween(0,4);
        List<WebElement> listaGenero = driver.findElements(cadastroFilmePage.getSelectGenero());
        listaGenero.get(elemento).click();
    }

    public void inserirDuração(){
        String duracao = String.valueOf(faker.number().numberBetween(60,200));
        driver.findElement(cadastroFilmePage.getDuracao()).sendKeys(duracao);
    }

    public void inserirDiretor(){
        String nome = faker.name().fullName();
        driver.findElement(cadastroFilmePage.getDirecao()).sendKeys(nome);
    }

    public void inserirComentario(){
        String comentario = faker.name().title();
        driver.findElement(cadastroFilmePage.getComentario()).sendKeys(comentario);
    }

    public void selecionarEstrela(){
        int elemento = faker.number().numberBetween(0,4);
        List<WebElement> listaEstrela = driver.findElements(cadastroFilmePage.getEstrela());
        listaEstrela.get(elemento).click();
    }

    public void selecionarAdicionarFilme(){
        driver.findElement(cadastroFilmePage.getAdicionarFilme()).click();
    }


    public void interagirCadastroFilme(){
        this.inserirNomeFilme();
        this.inserirDataLancamento();
        this.inserirLinkTrailerYoutube();
        this.inserirCapaFilme();
        this.selecionarGenero();
        this.inserirDuração();
        this.inserirDiretor();
        this.inserirComentario();
        this.selecionarEstrela();
        this.selecionarAdicionarFilme();
    }
}
