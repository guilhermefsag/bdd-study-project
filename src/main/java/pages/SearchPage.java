package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    private WebDriver driver;


    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/ytd-app[1]/div[1]/ytd-page-manager[1]/ytd-search[1]/div[1]/ytd-two-column-search-results-renderer[1]/div[1]/ytd-section-list-renderer[1]/div[2]/ytd-item-section-renderer[1]/div[3]/ytd-channel-renderer[1]/div[1]/div[2]/a[1]/div[1]/ytd-channel-name[1]/div[1]/div[1]/yt-formatted-string[1]")
    private WebElement clicaLinkDoCanal;

    //função que faz a conexão com o driver
    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //função que clica no botão do canal pesquisado
    public void clicaLinkDoCanal() {
        clicaLinkDoCanal.click();
    }

}