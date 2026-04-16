package com.serenityautomation.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features="src/test/resources/features/LoginSwagLab.feature",
        glue = "com.serenityautomation.stepsdefinition",
        snippets = CAMELCASE,
        tags = "@LoginSwaglab"
)
public class LoginSwagLabRunner {
}
