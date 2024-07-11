import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AtendimentoFormPage;

public class AtendimentoFormTestID13 extends BaseTest {
    @Test
    public void validarId13() {
        AtendimentoFormPage page = new AtendimentoFormPage(getDriver());
        page.clicarBotaoIniciar();
        String caracteres = "51 9963913150555555555".repeat(1);
        page.preencherTxTelefoneCliente(caracteres);
        String valorTelefone = page.getTxTelfoneCliente();
        Assert.assertEquals(11, valorTelefone.length());
    }
    private void pausa(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}