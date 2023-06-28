package dev.etech.automation_web.steps;

import dev.etech.automation_web.funcs.HomeFunc;
import dev.etech.automation_web.funcs.LoginFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class LoginStep {

    LoginFunc loginFunc = new LoginFunc();
    HomeFunc homeFunc = new HomeFunc();

    @Dado("estiver na tela de login")
    public void entrarLogin(){
        loginFunc.acessarLogin();
    }

    @Quando("inserir os dados cadastrados do login")
    public void inserirDadosCadastrais(DataTable dataTable){
        List<Map<String,String>> usuario = dataTable.asMaps();
        String email = usuario.get(0).get("email");
        String senha = usuario.get(0).get("senha");
        loginFunc.realizarLogin(email, senha);
    }

    @Então("deve visualizar o nome do login {string}")
    public void visualizarNomeLogin(String usuario){
        Assert.assertEquals(usuario, homeFunc.validarLogin());
    }
}
