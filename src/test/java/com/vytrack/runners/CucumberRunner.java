package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "src/test/resources/features",
        //dryRun=true  checking if every test has code implementation, otherwise cucumber wil create it
        dryRun = false, // execute test
        strict = false,
        tags = "@sales_manager", // for skipping this method "@driver" for running only this method
//it will run one which execute but if we have both it will run both
        plugin = {
                "html:target/default-report",
                "json:target/cucumber1.json",
                "rerun:target/rerun.txt"
        }
)
public class CucumberRunner {

}
