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
        page.preencherTxIdAtendente(caracteres);
        String voltarCaracteres = page.getTxIdAtendente();
        //Assert.assertEquals(100,voltarCaracteres.length()); // COLOCAR VERIFICAÇÃO <=1
        boolean menorIguala100 = (voltarCaracteres.length() <= 100) ? true : false;
        Assert.assertEquals(true,menorIguala100);
    }
}