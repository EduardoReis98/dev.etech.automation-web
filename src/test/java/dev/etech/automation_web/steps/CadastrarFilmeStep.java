package dev.etech.automation_web.steps;

import dev.etech.automation_web.funcs.CadastrarFilmeFunc;
import dev.etech.automation_web.funcs.HomeFunc;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;


public class CadastrarFilmeStep {

    HomeFunc homeFunc = new HomeFunc();
    CadastrarFilmeFunc cadastrarFilmeFunc = new CadastrarFilmeFunc();

    @Quando("inserir os dados do filme")
    public void inserirDadosFilme(){
        homeFunc.selecionarAdicionarFilme();
        cadastrarFilmeFunc.interagirCadastroFilme();
        System.out.println();
    }

    @Então("deve visualizar na tela {string}")
    public void visualizarFilmeCriadoSucesso(String mensagem){

    }

}
