package br.com.serenitybddtemplate.hooks;

import br.com.serenitybddtemplate.steps.LoginSteps;
import br.com.serenitybddtemplate.utils.GlobalParameters;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.thucydides.core.annotations.Steps;

public class GeneralHooks {
    @Steps
    LoginSteps loginSteps;

    @Before
    public void beforeScenario(){
        //código a ser executado antes de cada cenário
        System.setProperty("serenity.outputDirectory", GlobalParameters.pathReport);
        loginSteps.abrirMantis();
    }

    @After
    public void afterScenario(){
        //código a ser executado depois de cada cenário
    }
}
