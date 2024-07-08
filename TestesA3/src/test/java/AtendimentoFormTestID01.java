import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AtendimentoFormPage;
public class AtendimentoFormTestID01 extends BaseTest {
    /*@Test
    public void validarBotaoIniciar() {
        AtendimentoFormPage page = new AtendimentoFormPage(getDriver());
        page.clicarBotaoIniciar();
    }*/
    @Test
    public void validarId01(){
        AtendimentoFormPage page = new AtendimentoFormPage(getDriver());
        page.clicarBotaoIniciar();
        String caracteres = "A".repeat(101);
        page.preencherTxIdUsuario(caracteres);
        String voltarCaracteres = page.getTxIdUsuario();
        Assert.assertEquals(100,voltarCaracteres.length()); // COLOCAR VERIFICAÇÃO <=1
    }
}