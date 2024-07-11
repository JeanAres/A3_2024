import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AtendimentoFormPage;

public class AtendimentoFormTestID08 extends BaseTest {
    @Test
    public void validarId08() {
        AtendimentoFormPage page = new AtendimentoFormPage(getDriver());
        page.clicarBotaoIniciar();
        page.preencherTxIdAtendente("teste");//preenche o nome do atendente
        page.getListaRdTipoAtendimento().get(1).click(); // seleciona whatsapp em atendimento
        page.getListaRdQuemEstouAtendendo().get(0).click(); //seleciona empregador
        page.preencherTxNomeCliente("Chevrolet da Silva Ford");
        page.preencherTxCnpjCliente("12.345.678/0001-00");
        page.preencherTxTelefoneCliente("51999223344");//preenche telefone do cliente
        page.getListaRdTipoAtendimento2().get(3).click();
        page.clicarBotaoEnviar();
        page.clicarVoltar();
    }
}
