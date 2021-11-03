package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    //elementos da página atribuidos a uma variável
    @FindBy(how = How.XPATH, using = "/html/body/ytd-app/div/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/button")
    private WebElement botaoOK;

    @FindBy(how = How.XPATH, using = "//input[@id='search']")
    private WebElement pesquisayt;

    //função que faz a conexão com o driver
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //função que passa um texto a ser escrito no
    public void fazPesquisa() {
        pesquisayt.sendKeys("Whinderson Nunes");
    }

    //função que clica no botão de pesquisa
    public void clicaBotaoOK() {
        botaoOK.click();
    }
}
