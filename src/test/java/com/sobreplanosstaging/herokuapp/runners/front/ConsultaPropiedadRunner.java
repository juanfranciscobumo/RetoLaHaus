package com.sobreplanosstaging.herokuapp.runners.front;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/front/consultar_propiedad.feature"
        , glue = "com.sobreplanosstaging.herokuapp.stepdefinitions"
        , snippets = CAMELCASE)
public class ConsultaPropiedadRunner {
}
