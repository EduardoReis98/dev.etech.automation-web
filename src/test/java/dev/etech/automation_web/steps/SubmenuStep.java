package dev.etech.automation_web.steps;

import dev.etech.automation_web.funcs.HomeFunc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.E;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class SubmenuStep {

    HomeFunc homeFunc = new HomeFunc();

    @Quando("selecionar o {string} no submenu")
    public void selecionarGeneroSubmenu(String genero){
    homeFunc.selecionarSubmenu(genero);
    }

    @Então("deve visualizar o {string} do {string}")
    public void visualizarNomeGenero(String generoSelecionado, String genero){
        Assert.assertEquals(generoSelecionado, homeFunc.validarNomeSubmenu(genero));
    }

    @Quando("inserir {string} no campo de pesquisa do {string}")
    public void selecionarPesquisa(String pesquisa, String genero){
        homeFunc.inserirTextoPesquisa(pesquisa,genero);
    }

    @Então("deve visualizar uma imagem na tela da pesquisa")
    public void visualizarPesquisa(){
    Assert.assertEquals("img",homeFunc.validarTextoPesquisa());

    }
}
