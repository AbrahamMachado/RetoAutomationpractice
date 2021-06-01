package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import steps.AutomationSteps;


public class BuscadorAutomationPracticeStepDefinitios {
	
	@Steps
	AutomationSteps automationSteps = new AutomationSteps();
	
	@Given("^Se ubica en la pagina AutomationPractice$")
	public void seUbicaEnLaPaginaAutomationPractice() {
		SeleniumWebDriver.ChromeWebDriver("http://automationpractice.com/index.php");
	}


	@When("^busco los productos registrados en el excel$")
	public void buscoLosProductosRegistradosEnElExcel() throws InterruptedException, IOException {
		automationSteps.LeerArchivoExcel();;
	}

	@Then("^se valida que el nombre seleccionado en la pagina concuerde con el del archivo excel$")
	public void seValidaQueElNombreSeleccionadoEnLaPaginaConcuerdeConElDelArchivoExcel() {
		
	}

}
