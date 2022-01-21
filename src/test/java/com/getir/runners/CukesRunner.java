package com.getir.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/getir/step_definitions",
        dryRun = false,
        publish = true,
        tags = "@case1 or @case2"
)
public class CukesRunner {
}
