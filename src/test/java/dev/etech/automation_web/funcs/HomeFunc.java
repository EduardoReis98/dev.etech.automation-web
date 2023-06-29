package dev.etech.automation_web.funcs;

import dev.etech.automation_web.commons.BaseTest;
import dev.etech.automation_web.pages.FilmesPage;
import dev.etech.automation_web.pages.HomePage;
import dev.etech.automation_web.pages.SeriesPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomeFunc extends BaseTest {

    HomePage homePage = new HomePage();
    FilmesPage filmesPage = new FilmesPage();
    SeriesPage seriesPage = new SeriesPage();

    public String validarLogin(){
        return driver.findElement(homePage.getTittleUsusario()).getText();
    }

    public void selecionarAdicionarFilme(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(homePage.getAdicionarFilme()));
        driver.findElement(homePage.getAdicionarFilme()).click();
    }

    public void acessarCadastroFilme(){
        this.selecionarAdicionarFilme();
    }

    public String validarCadastroFilme(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(homePage.getFilmeCriadoSucesso()));
        List<WebElement> elementos = driver.findElements(homePage.getFilmeCriadoSucesso());
        return elementos.get(1).getText();
    }

    public void selecionarSubmenu(String submenu){
        submenu = submenu.replace(" ", "").toUpperCase();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        switch (submenu){

            case "HOME":
                wait.until(ExpectedConditions.visibilityOfElementLocated(homePage.getHomeSubmenu()));
                driver.findElement(homePage.getHomeSubmenu()).click();
                break;
            case "FILMES":
                wait.until(ExpectedConditions.visibilityOfElementLocated(filmesPage.getFilmesSubmenu()));
                driver.findElement(filmesPage.getFilmesSubmenu()).click();
                break;
            case "SERIES":
                wait.until(ExpectedConditions.visibilityOfElementLocated(seriesPage.getSeriesSubmenu()));
                driver.findElement(seriesPage.getSeriesSubmenu()).click();
                break;
            default:
                System.out.println("SubMenu não existe" + submenu);
        }
    }

    public String validarNomeSubmenu(String nomeSubmenu){
        nomeSubmenu = nomeSubmenu.replace(" ","").toUpperCase();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String validarNome = null;
        
        switch (nomeSubmenu) {

            case "HOME":
                wait.until(ExpectedConditions.visibilityOfElementLocated(homePage.getNomeHomeSubmenu()));
                validarNome = driver.findElement(homePage.getNomeHomeSubmenu()).getText();
                break;
            case "FILMES":
                wait.until(ExpectedConditions.visibilityOfElementLocated(filmesPage.getNomeFilmesSubmenu()));
                validarNome = driver.findElement(filmesPage.getNomeFilmesSubmenu()).getText();
                break;
            case "SERIES":
                wait.until(ExpectedConditions.visibilityOfElementLocated(seriesPage.getNomeSeriesSubmenu()));
                validarNome = driver.findElement(seriesPage.getNomeSeriesSubmenu()).getText();
                break;
            default:
                System.out.println("O titulo da pagina não existe" + nomeSubmenu);
        }

        return validarNome;
    }

    public void inserirTextoPesquisa(String pesquisa,String genero){
        genero = genero.replace(" ","").toUpperCase();
        WebDriverWait wait = new WebDriverWait(driver, 2);

        switch (genero) {

            case "HOME":
                wait.until(ExpectedConditions.invisibilityOfElementLocated(homePage.getLoading()));
                driver.findElement(homePage.getPesquisaHome()).sendKeys(pesquisa);
                driver.findElement(homePage.getPesquisaButon()).click();
                break;
            case "FILMES":
                wait.until(ExpectedConditions.invisibilityOfElementLocated(homePage.getLoading()));
                driver.findElement(filmesPage.getPesquisaFilmes()).sendKeys(pesquisa);
                driver.findElement(homePage.getPesquisaButon()).click();
                break;
            case "SERIES":
                wait.until(ExpectedConditions.invisibilityOfElementLocated(homePage.getLoading()));
                driver.findElement(homePage.getPesquisaSeries()).sendKeys(pesquisa);
                driver.findElement(homePage.getPesquisaButon()).click();
                break;
            default:
                System.out.println("O campo não existe");
        }
    }

    public String validarTextoPesquisa(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(homePage.getTextoTituloPesquisa()));
        String textoEscrito = driver.findElement(homePage.getTextoTituloPesquisa()).getTagName();
        System.out.println(textoEscrito);
        return textoEscrito;
    }

    public void selecionarBotaoSair(){
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(homePage.getLoading()));
        driver.findElement(homePage.getBotãoSair()).click();
    }
}


