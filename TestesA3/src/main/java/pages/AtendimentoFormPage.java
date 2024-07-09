package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AtendimentoFormPage extends BasePage{
    @FindBy(id = "idAtendente")
    private WebElement txIdAtendente;
    @FindBy(id = "btnIniciar")
    private WebElement btIniciar;
    @FindBy(id = "idNomeCliente")
    private WebElement txNomeCliente;
    @FindBy(id = "idTelefoneCliente")
    private WebElement txTelefoneCliente;
    @FindBy(id = "idCnpjCliente")
    private WebElement txCnpjCliente;
    @FindBy(id = "btnEnviar")
    private WebElement btEnviar;
    @FindBy(id = "idDadosEnviados")
    private WebElement strDadosEnviados;



    @FindBy(name = "type")
    private List<WebElement> listaRdTipoAtendimento;
    @FindBy(name = "typeClient")
    private List<WebElement> listaRdQuemEstouAtendendo;
    @FindBy(name = "type2")
    private List<WebElement> listaRdTipoAtendimento2;



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

    public AtendimentoFormPage clicarBotaoIniciar(){
        btIniciar.click();
        return this;
    }

    public String getTxIdAtendente(){
        return txIdAtendente.getAttribute("value");
    }

    public AtendimentoFormPage preencherTxIdAtendente(String texto) {
        txIdAtendente.sendKeys(texto);
        return this;
    }

    public String getTxNomeCliente(){
        return txNomeCliente.getAttribute("value");
    }

    public AtendimentoFormPage preencherTxNomeCliente(String texto) {
        txNomeCliente.sendKeys(texto);
        return this;
    }


    public String getTxCnpjCliente(){
        return txCnpjCliente.getAttribute("value");
    }

    public AtendimentoFormPage preencherTxCnpjCliente(String texto) {
        txCnpjCliente.sendKeys(texto);
        return this;
    }
    public String getTxTelfoneCliente(){
        return txTelefoneCliente.getAttribute("value");
    }

    public AtendimentoFormPage preencherTxTelefoneCliente(String texto) {
        txTelefoneCliente.sendKeys(texto);
        return this;
    }

    public String getStrDadosEnvidados(){
        return strDadosEnviados.getText();
    }

    public List<WebElement> getListaRdTipoAtendimento(){
        return listaRdTipoAtendimento;
    }
    public List<WebElement> getListaRdTipoAtendimento2(){
        return listaRdTipoAtendimento2;
    }
    public List<WebElement> getListaRdQuemEstouAtendendo(){
        return listaRdQuemEstouAtendendo;
    }

    public AtendimentoFormPage clicarBotaoEnviar(){
        btEnviar.click();
        return this;
    }
    /*public String clicarGoogle() {
        linkGoogle.click();
        String url = driver.getCurrentUrl();
        driver.navigate().back();
        return url;
    }*/
}