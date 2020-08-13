package runner;



import io.cucumber.junit.CucumberOptions;


// Runwith classi eksik
@CucumberOptions(

        plugin = {
                "pretty",
                "html:target/default-cucumber-reports",
                "junit:target/cucumber.xml"},
        features = {"src/test/resources/"},
        glue = { "steps"},
        //glue = {"src/test/java/steps"},
        dryRun = false,
        tags = {""}

)

public class TestRunner {

}