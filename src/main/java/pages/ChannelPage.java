package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ChannelPage {

    private WebDriver driver;

    //valida que o resultado da busca "whinderssonnunes" realmente retornam os videos do mesmo
    public void validaRetorno() {
        String termoBusca = "whinderssonnunes";
        Boolean resultado = false;
        for (int i = 3; i < 30; i++) {
            WebElement resultados = driver.findElement(By.xpath("(//a[@href=\"/c/whindersson\"])" + "[" + i + "]"));
            String valorResultado = resultados.getText();
            if (valorResultado.equals(termoBusca)) {
                resultado = true;
            }
        }
        Assert.assertTrue(resultado);
    }

    //função que faz a conexão com o driver
    public ChannelPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

}
