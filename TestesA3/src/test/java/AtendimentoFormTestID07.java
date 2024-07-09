import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AtendimentoFormPage;

public class AtendimentoFormTestID07 extends BaseTest {
    @Test
    public void validarId07() {
        AtendimentoFormPage page = new AtendimentoFormPage(getDriver());
        page.clicarBotaoIniciar();

        page.preencherTxIdAtendente("Bananilson da Silva");//preenche o nome do atendente
        pausa();
        page.getListaRdTipoAtendimento().get(1).click(); // seleciona whatsapp em atendimento
        pausa();
        page.getListaRdQuemEstouAtendendo().get(0).click(); //seleciona empregador
        pausa();
        page.preencherTxNomeCliente("Chevrolet da Silva Ford");
        pausa();
        page.preencherTxCnpjCliente("12.345.678/0001-00");
        pausa();
        page.preencherTxTelefoneCliente("51999223344");//preenche telefone do cliente
        pausa();
        page.getListaRdTipoAtendimento2().get(3).click();
        pausa();
        page.clicarBotaoEnviar();
        Assert.assertEquals("Dados enviados com sucesso",page.getStrDadosEnvidados());


    }
    private void pausa(){
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}