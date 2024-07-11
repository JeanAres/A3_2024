import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AtendimentoFormPage;

public class AtendimentoFormTestID02 extends BaseTest {
    @Test
    public void validarId02() {
        AtendimentoFormPage page = new AtendimentoFormPage(getDriver());
        page.clicarBotaoIniciar();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".repeat(1);
        page.preencherTxCnpjCliente(caracteres);

        String valorCNPJ = page.getTxCnpjCliente();
        Assert.assertEquals(0, valorCNPJ.length());
    }



}