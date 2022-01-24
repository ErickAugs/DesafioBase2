package br.com.serenitybddtemplate.stepdefinitions;

import br.com.serenitybddtemplate.steps.LoginSteps;
import br.com.serenitybddtemplate.steps.MainSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class LoginStepDefinitions {
    @Steps
    LoginSteps loginSteps;

    @Steps
    MainSteps mainSteps;


    @Given("^Esteja logado no Mantis$")
    public void estejaLogadoNoMantis() {
        Properties properties;
        properties = new Properties();

        try {
            InputStream inputStream = new FileInputStream("serenity.properties");
            properties.load(inputStream);
        }catch (Exception e){
            e.printStackTrace();
        }
        loginSteps.preenhcerUsuario(properties.getProperty("login.mantis"));
        loginSteps.preencherSenha(properties.getProperty("senha.mantis"));

        loginSteps.clicarEmLogin();
    }

    @And("informo o usuario '(.*)'")
    public void preencherUsuario(String usuario){
        loginSteps.preenhcerUsuario(usuario);
    }

    @And("informo a senha '(.*)'")
    public void preencherSenha(String senha){
        loginSteps.preencherSenha(senha);
    }

    @When("acessar o sistema")
    public void clicarEmLogin(){
        loginSteps.clicarEmLogin();
    }

    @Then("o usuário deve ser autenticado com sucesso")
    public void verificarSeUsuarioEstaAutenticado(){
        String usuario = Serenity.sessionVariableCalled("templateautomacao");
        Assert.assertEquals(usuario, mainSteps.retornaUsernameDasInformacoesDeLogin());
    }
}
