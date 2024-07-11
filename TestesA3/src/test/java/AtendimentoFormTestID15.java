import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AtendimentoFormPage;

public class AtendimentoFormTestID15 extends BaseTest {
    @Test
    public void validarId14() {
        AtendimentoFormPage page = new AtendimentoFormPage(getDriver());
        page.clicarBotaoIniciar();
        page.preencherTxTelefoneCliente("51999223344");
        pausa();
        page.clicarBotaoEnviar();
        Assert.assertNotEquals("Dados enviados com sucesso", page.getStrDadosEnvidados());
    }
    private void pausa(){
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}