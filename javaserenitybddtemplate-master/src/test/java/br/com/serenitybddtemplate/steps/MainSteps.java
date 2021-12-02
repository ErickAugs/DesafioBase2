package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.MainPage;
import net.thucydides.core.annotations.Step;

public class MainSteps {
    MainPage mainPage;

    @Step("Retorna username das informações de login")
    public String retornaUsernameDasInformacoesDeLogin(){
        return mainPage.retornaUsernameDasInformacoesDeLogin();
    }

    @Step("Clicar em 'Report Issue'")
    public void clicarEmReportIssue(){
        mainPage.clicarEmReportIssue();
    }
}
