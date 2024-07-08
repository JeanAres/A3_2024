import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AtendimentoFormPage;
public class AtendimentoFormTest extends BaseTest {
    @Test
    public void validarBotaoIniciar() {
        AtendimentoFormPage page = new AtendimentoFormPage(getDriver());
        page.clicarBotaoIniciar();
    }
    @Test
    public void validarBotaoVoltar(){
        AtendimentoFormPage page = new AtendimentoFormPage(getDriver());
        //page.clicarBotaoIniciar();
        page.clicarTxIdUsuario("HAHAHAHAHAHAHAHAHAHA");
    }
}