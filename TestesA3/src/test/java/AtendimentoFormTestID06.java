import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AtendimentoFormPage;

public class AtendimentoFormTestID06 extends BaseTest {
    @Test
    public void validarId06() {
        AtendimentoFormPage page = new AtendimentoFormPage(getDriver());
        page.clicarBotaoIniciar();
        String caracteres = "9".repeat(10);
        page.preencherTxTelefoneCliente(caracteres);
        pausa();
        page.clicarBotaoEnviar();
        pausa();
        Assert.assertNotEquals("Dados enviados com sucesso", page.getStrDadosEnvidados());
    }
    private void pausa(){
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}