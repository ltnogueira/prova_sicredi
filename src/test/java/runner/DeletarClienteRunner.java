package runner;

import org.junit.runner.RunWith;
import io.cucumber.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		plugin = {}, 
		features = "classpath:features/desafio2.feature", 
		glue = {"steps"},
		tags = "@DeletarCliente",
		monochrome = true,
		dryRun = true
	)


public class DeletarClienteRunner {

}
