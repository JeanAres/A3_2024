import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AtendimentoFormPage;

public class AtendimentoFormTestID02 extends BaseTest {
    @Test
    public void validarId02() {
        AtendimentoFormPage page = new AtendimentoFormPage(getDriver());
        page.clicarBotaoIniciar();
        AtendimentoFormPage formPage = new AtendimentoFormPage(driver);
        String caracteres = "ABCEDFGHIJKLMNOPQRSTUVWXYZ".repeat(1);
        formPage.preencherTxCnpjUser(caracteres);  // Digitar letras no campo CNPJ do empregador

        String valorCNPJ = formPage.getTxCnpjUser();
        Assert.assertEquals(0, valorCNPJ.length()); // Verificar pq o E nao tem valor?
    }



}