package dev.etech.automation_web.steps;

import dev.etech.automation_web.funcs.CadastroUsuarioFunc;
import dev.etech.automation_web.funcs.LoginFunc;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class CadastroUsuarioStep {

    CadastroUsuarioFunc cadastroFunc = new CadastroUsuarioFunc();
    LoginFunc loginFunc = new LoginFunc();

    @Dado("estiver na tela de cadastro")
    public void entrarCadastro(){
        cadastroFunc.acessarCadastro();
    }

    @Quando("inserir os dados cadastrais")
    public void dadosCadastrais(){
        cadastroFunc.interacaoDadosCadastrais();
    }

    @Então("deve visualizar na tela de login {string}")
    public void visualizarNomeUsuario(String mensagem){
        Assert.assertEquals(mensagem,loginFunc.validarCadastro());
    }
}
