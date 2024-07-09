import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AtendimentoFormPage;

public class AtendimentoFormTestID03 extends BaseTest {
    @Test
    public void validarId03() {
        int contaSelecionados = 0;
        AtendimentoFormPage page = new AtendimentoFormPage(getDriver());
        page.clicarBotaoIniciar();
        for(WebElement opcao : page.getListaRdTipoAtendimento()){
            opcao.click();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        for(WebElement opcao : page.getListaRdTipoAtendimento()){
            if(opcao.isSelected()) contaSelecionados++;
        }
        //page.getListaRdTipoAtendimento().get(1).click(); // clica em Whatsapp no form
        //boolean teste = page.getListaRdTipoAtendimento().get(1).isSelected(); verifica se Whatsapp está marcado
        System.out.println("Quantidade de opções selecionadas: " + contaSelecionados);
        Assert.assertEquals(1,contaSelecionados);
    }
}