import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AtendimentoFormPage;

public class AtendimentoFormTestID05 extends BaseTest {
    @Test
    public void validarId05(){
        AtendimentoFormPage page = new AtendimentoFormPage(getDriver());
        page.clicarBotaoIniciar();
        String caracteres = "48.502.663/0001-30 00".repeat(1);
        page.preencherTxCnpjCliente(caracteres);
        String valorCNPJ = page.getTxCnpjCliente();
        String voltarCaracteres = page.getTxNomeCliente();
        page.preencherTxTelefoneCliente("51999223344");
        pausa();
        page.clicarBotaoEnviar();
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