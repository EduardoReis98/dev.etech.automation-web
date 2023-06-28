package dev.etech.automation_web.pages;

import org.openqa.selenium.By;

public class CadastroUsuarioPage {

    By nomeCompleto = By.id("nome");
    By apelido = By.id("apelido");
    By telefone = By.id("telefone");
    By dataNascimento = By.id("nascimento");
    By prosseguirDadosPessoais = By.xpath("//button[@class='button btn-filled' and ancestor::div[@style='margin: 30px 0px; display: flex; justify-content: end;']]");
    By cep = By.id("cep");
    By prosseguirEndereco = By.xpath("//button[@class='button btn-filled' and ancestor:: div[@style='transform-origin: center top 0px;']]");
    By emailCadastro = By.id("email");
    By senhaCadastro = By.id("senha");
    By confirmarSenhaCadastro = By.id("confirmSenha");
    By prosseguirEmailSenha = By.xpath("//button [@class='button btn-filled' and ancestor:: div [@style='display: flex; justify-content: space-between;']]");
    By esperarRua = By.xpath("// input [@class='filled input' and following-sibling:: label[@for='rua']]");


    public By getNomeCompleto() {
        return nomeCompleto;
    }

    public By getApelido() {
        return apelido;
    }

    public By getTelefone() {
        return telefone;
    }

    public By getDataNascimento() {
        return dataNascimento;
    }

    public By getProsseguirDadosPessoais() {
        return prosseguirDadosPessoais;
    }

    public By getCep() {
        return cep;
    }

    public By getProsseguirEndereco() {
        return prosseguirEndereco;
    }

    public By getEmailCadastro() {
        return emailCadastro;
    }

    public By getSenhaCadastro() {
        return senhaCadastro;
    }

    public By getConfirmarSenhaCadastro() {
        return confirmarSenhaCadastro;
    }

    public By getProsseguirEmailSenha() {
        return prosseguirEmailSenha;
    }

    public By getEsperarRua() {
        return esperarRua;
    }
}
