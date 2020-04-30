package com.vytrack.runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = "com/vytrack/step_definitions",
        features = "@target/rerun.txt",
        //dryRun=true  checking if every test has code implementation, otherwise cucumber will create it
        plugin = {
                "html:target/failed-default-report",
                "json:target/failed_report.json"
        }
)
public class FailedRunner extends AbstractTestNGCucumberTests {


}
