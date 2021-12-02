package br.com.serenitybddtemplate.tests;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
        glue = {"classpath:br.com.serenitybddtemplate.stepdefinitions",
                "classpath:br.com.serenitybddtemplate.hooks" })
public class LoginTests {
}
