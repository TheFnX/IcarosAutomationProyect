package com.opencart.us.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.opencart.us.stepDefinitions", "com.opencart.us.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
        //tags = "@Test-HomePage"
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {

}
