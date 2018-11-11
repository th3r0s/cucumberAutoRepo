package com.basic.backgroundSD;

/**
 * Es como la clase padre donde se definen los parámetros.
 * Esta clase crea un documente html y un json de las pruebas.
 * Glue= encola dos directorios
 */
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					monochrome = true,
					features={"src/test/resources/com/basic/backgroundFF/"},
					glue={"com/basic/backgroundSD/"},
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report.json"
							
					}
		
		
		)
public class RunMyBackgroundScenarioTest {

	
	
	
}
