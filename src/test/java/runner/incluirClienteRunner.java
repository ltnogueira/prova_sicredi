package runner;

import org.junit.runner.RunWith;
import io.cucumber.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		plugin = {}, 
		features = "classpath:features/desafio1.feature", 
		glue = {"steps"},
		tags = "@InluirCliente",
		monochrome = true,
		dryRun = true
	)


public class incluirClienteRunner {

}
