package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AtendimentoFormPage extends BasePage{
    @FindBy(id = "idUsuario")
    private WebElement txIdUsuario;
    @FindBy(id = "botaoIniciar")
    private WebElement btIniciar;
    @FindBy(id = "cnpjUser")
    private WebElement txCnpjUser;

    /* Para consultar
    @FindBy(id = "venda")
    private WebElement selCanalVenda;
    @FindBy(id = "txt02")
    private WebElement txEstoqueMinimo;
    @FindBy(xpath = "/html/body/div/form/fieldset/div[5]/input")
    private WebElement txEstoqueMaximo;
    @FindBy(id = "sim")
    private WebElement rdSim;
    @FindBy(name = "nao")
    private WebElement rdNao;
    @FindBy(xpath = "/html/body/div/form/div[3]")
    private WebElement checkUnidade;
    @FindBy(xpath = "/html/body/div/form/div[4]")
    private WebElement checkCaixa;
    @FindBy(xpath = "/html/body/div/form/div[5]")
    private WebElement checkPacote;
    @FindBy(xpath = "/html/body/div/form/div[6]")
    private WebElement checkDuzia;
    @FindBy(id = "elementosForm:cadastrar")
    private WebElement btnCadastrar;
    @FindBy(linkText = "google")
    private WebElement linkGoogle;
    @FindBy(partialLinkText = "GZH")
    private WebElement linkZh;
 */
    public AtendimentoFormPage(WebDriver driver) {
        super(driver);
    }

    public String getTxIdUsuario(){
        return txIdUsuario.getAttribute("value");
    }

    public AtendimentoFormPage preencherTxIdUsuario(String texto) {
        txIdUsuario.sendKeys(texto);
        return this;
    }
    public String getTxCnpjUser(){
        return txCnpjUser.getAttribute("value");
    }

    public AtendimentoFormPage preencherTxCnpjUser(String texto) {
        txCnpjUser.sendKeys(texto);
        return this;
    }


    public AtendimentoFormPage clicarBotaoIniciar(){
        btIniciar.click();
        return this;
    }

    /*public String clicarGoogle() {
        linkGoogle.click();
        String url = driver.getCurrentUrl();
        driver.navigate().back();
        return url;
    }*/
}