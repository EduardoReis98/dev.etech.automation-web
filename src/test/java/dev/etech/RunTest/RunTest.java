package dev.etech.RunTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty", "html:reports/cucumber.html"},
        features = {"./src/test/resources/features"},
        glue = {"dev.etech.automation_web.steps","dev.etech.automation_web.configuration"},
        tags = "@teste_cadastro_filmes")

public class RunTest {
}
