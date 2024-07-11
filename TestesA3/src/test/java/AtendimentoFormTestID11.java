import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AtendimentoFormPage;

public class AtendimentoFormTestID11 extends BaseTest {
    @Test
    public void validarId11() {
        AtendimentoFormPage page = new AtendimentoFormPage(getDriver());
        page.clicarBotaoIniciar();
        page.preencherTxNomeCliente("1234567890");
        String voltarCaracteres = page.getTxNomeCliente();
        page.preencherTxTelefoneCliente("51999223344");
        pausa();
        page.clicarBotaoEnviar();
        pausa();
        Assert.assertNotEquals("Dados enviados com sucesso", page.getStrDadosEnvidados());
    }
    private void pausa(){
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
