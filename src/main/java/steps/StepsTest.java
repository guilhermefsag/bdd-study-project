package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ChannelPage;
import pages.HomePage;
import pages.SearchPage;
import drivers.Driver;

public class StepsTest {

    private WebDriver driver;
    HomePage homePage;
    ChannelPage channelPage;
    SearchPage searchPage;

    @Before(value = "@Tag1")
    public void before() {
        Driver wdriver = new Driver();
        driver = wdriver.Webdriver();
    }

    @BeforeStep(value = "@Tag1")
    public void beforestep() {
        homePage = new HomePage(driver);
        channelPage = new ChannelPage(driver);
        searchPage = new SearchPage(driver);
    }

    //anotações que mostram para o Junit que essas são funções de testes
    @Test
    @Given("Que entro na url {string}")
    public void que_entro_na_url(String string) {
        driver.get("https://www.youtube.com");
    }

    @Test
    @Given("pesquiso {string} na barra de pesquisa")
    public void pesquiso_na_barra_de_pesquisa(String string) {
        homePage.fazPesquisa();
    }

    @Test
    @When("Clico no botão de confirmar a pesquisa")
    public void clico_no_botão_de_confirmar_a_pesquisa() {
        homePage.clicaBotaoOK();
    }

    @Test
    @When("Clico no botão do canal")
    public void clico_no_botão_do_canal() {
        searchPage.clicaLinkDoCanal();
    }

    @Test
    @Then("Deverá aparecer os videos do canal {string}")
    public void deverá_aparecer_os_videos_do_canal(String string) {
        channelPage.validaRetorno();
    }

    @After(value = "@Tag1")
    public void testEnd() {
        driver.close();
        driver.quit();
    }
}
