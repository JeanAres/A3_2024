import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AtendimentoFormPage;
public class AtendimentoFormTest extends BaseTest {

    @Test
    public void validarId09() {
        AtendimentoFormPage page = new AtendimentoFormPage(getDriver());
        page.clicarBotaoIniciar();
    }
    @Test
    public void validarId01(){
        AtendimentoFormPage page = new AtendimentoFormPage(getDriver());
        //page.clicarBotaoIniciar();
        String caracteres = "A".repeat(101);
        page.preencherTxIdUsuario(caracteres);
        String voltarCaracteres = page.getTxIdUsuario();
        System.out.println(voltarCaracteres.length());
        Assert.assertEquals(100,voltarCaracteres.length());
    }
}