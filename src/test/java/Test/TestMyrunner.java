package Test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\feature",
		glue={"stepDefinationClass","hook"},
		plugin= {"pretty","html:target/report.html"}
		)
public class TestMyrunner {

	
}
