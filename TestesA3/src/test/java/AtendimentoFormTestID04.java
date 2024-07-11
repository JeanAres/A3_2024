import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AtendimentoFormPage;

public class AtendimentoFormTestID04 extends BaseTest {
    @Test
    public void validarId04() {
        AtendimentoFormPage page = new AtendimentoFormPage(getDriver());
        page.clicarBotaoIniciar();
        String caracteres = "1234567890".repeat(1);
        page.preencherTxIdAtendente(caracteres);
        String voltarCaracteres = page.getTxIdAtendente();
        Assert.assertEquals(0,voltarCaracteres.length());
    }
}