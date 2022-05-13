package com.Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/feature",
        monochrome=true,

        glue={"com.Steps","com.Hooks"},

        plugin = {"pretty","html:target/cucumber-reports", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extentreport.html"
        }
)
public class runner {


}
