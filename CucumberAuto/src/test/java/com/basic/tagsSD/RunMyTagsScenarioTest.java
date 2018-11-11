package com.basic.tagsSD;

/**
 * Es como la clase padre donde se definen los par�metros.
 * Esta clase crea un documente html y un json de las pruebas.
 * Glue= encola dos directorios
 */
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					//tags={"@Important"},//Todos los escenarios
					//tags={"@Smoke", "@Regression"},//Expression and
					tags={"@Smoke,@Regression"},//Expression or
					monochrome = true,
					features={"src/test/resources/com/basic/tagsFF/"},
					glue={"com/basic/tagsSD/"},
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html"	
							
					}
		
		
		)
public class RunMyTagsScenarioTest {

	
	
	
}
