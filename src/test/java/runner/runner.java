package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import pages.BasePage;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps"
)

public class runner extends AbstractTestNGCucumberTests{
    @AfterClass(alwaysRun = true)
    public static void cleanDriver(){
        BasePage.closeBrowser();
    }
    }
