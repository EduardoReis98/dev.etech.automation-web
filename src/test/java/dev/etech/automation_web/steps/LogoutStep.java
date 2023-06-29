package dev.etech.automation_web.steps;

import dev.etech.automation_web.funcs.HomeFunc;
import dev.etech.automation_web.funcs.LoginFunc;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class LogoutStep {
    HomeFunc homeFunc = new HomeFunc();
    LoginFunc loginFunc = new LoginFunc();

    @Quando("selecionar a opção sair")
    public void selecionarOpcaoSair(){
        homeFunc.selecionarBotaoSair();
    }

    @Então("deve visualizar a tela de login")
    public void visualizarTelaLogin(){
        Assert.assertEquals("Email",loginFunc.validarLogout());
    }
}
