package dev.etech.automation_web.funcs;

import com.github.javafaker.Faker;
import dev.etech.automation_web.commons.BaseTest;
import dev.etech.automation_web.pages.CadastroUsuarioPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Locale;

public class CadastroUsuarioFunc extends BaseTest {

    CadastroUsuarioPage cadastroPage = new CadastroUsuarioPage();
    Faker faker = new Faker(new Locale("pt-BR"));

    public void acessarCadastro(){
        driver.get("https://automation-web.etech.dev/cadastro");
    }

    public void inserirNomeCompleto(){
        String name = faker.name().fullName();
        driver.findElement(cadastroPage.getNomeCompleto()).sendKeys(name);
    }

    public void inserirApelido(){
        String firstName = faker.name().firstName();
        driver.findElement(cadastroPage.getApelido()).sendKeys(firstName);
    }

    public void inserirTelefone(){
        String phone = faker.phoneNumber().cellPhone();
        driver.findElement(cadastroPage.getTelefone()).sendKeys(phone);
    }

    public void inserirDataNascimento(){
        driver.findElement(cadastroPage.getDataNascimento()).sendKeys("15091998");
    }

    public void selecionarProsseguirDadosPessoais(){
        driver.findElement(cadastroPage.getProsseguirDadosPessoais()).click();
    }

    public void inserirCep(){
        String cep = faker.address().zipCode();
        driver.findElement(cadastroPage.getCep()).sendKeys("06653590");
    }

    public void selecionarProsseguirEndereco(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(cadastroPage.getEsperarRua()));
        driver.findElement(cadastroPage.getProsseguirEndereco()).click();
    }

    public void inserirEmail(){
        String email = faker.internet().emailAddress();
        driver.findElement(cadastroPage.getEmailCadastro()).sendKeys(email);
    }

    public void inserirSenha(){
        String senha = faker.internet().password();
        driver.findElement(cadastroPage.getSenhaCadastro()).sendKeys(senha);
        driver.findElement(cadastroPage.getConfirmarSenhaCadastro()).sendKeys(senha);
    }

    public void selecionarProsseguirEmailSenha(){
        driver.findElement(cadastroPage.getProsseguirEmailSenha()).click();
    }



    public void interacaoDadosCadastrais(){
        this.inserirNomeCompleto();
        this.inserirApelido();
        this.inserirTelefone();
        this.inserirDataNascimento();
        this.selecionarProsseguirDadosPessoais();
        this.inserirCep();
        this.selecionarProsseguirEndereco();
        this.inserirEmail();
        this.inserirSenha();
        this.selecionarProsseguirEmailSenha();
    }
}
