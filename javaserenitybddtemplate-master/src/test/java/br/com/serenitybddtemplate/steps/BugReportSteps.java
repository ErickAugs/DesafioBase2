package br.com.serenitybddtemplate.steps;

import br.com.serenitybddtemplate.pages.BugReportPage;

public class BugReportSteps {

    BugReportPage bugReportPage;

    public void selecionarCategoria(String categoria){
        bugReportPage.selecionarCategoria(categoria);
    }

    public void preencherResumo(String resumo){
        bugReportPage.preencherResumo(resumo);
    }

    public void preencherDescricao(String descricao){
        bugReportPage.preencherDescricao(descricao);
    }

    public void inserirAnexo(String caminhoArquivo){
        bugReportPage.inserirAnexo(caminhoArquivo);
    }

    public void clicarEmSubmitReport(){
        bugReportPage.clicarEmSubmitReport();
    }
}
