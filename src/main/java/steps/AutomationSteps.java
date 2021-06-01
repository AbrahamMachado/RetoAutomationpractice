package steps;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;

import driver.SeleniumWebDriver;
import pages.AutomationPage;
import util.LecturaExcel;

public class AutomationSteps extends AutomationPage {
	
	public void escribirTexto(By elemento, String producto) {
		SeleniumWebDriver.driver.findElement(elemento).sendKeys(producto);
	}
	
	public void clickElemento(By elemento) {
		SeleniumWebDriver.driver.findElement(elemento).click();
	}
	
	public String obtenerTextoElemento(By elemento) {
		return SeleniumWebDriver.driver.findElement(elemento).getText();
	}
	
	public void validarTexto(By elemento, String texto) {
		assertEquals(obtenerTextoElemento(elemento), texto);
	}
	
	public Boolean ValidarUbicacion(By elemento) {
		return SeleniumWebDriver.driver.findElement(elemento).isDisplayed();
	}
	
	public void BorrarTexto(By elemento) {
		SeleniumWebDriver.driver.findElement(elemento).clear();
	}
	
	public void buscarAutomation(String producto) throws InterruptedException {
		escribirTexto(getTxtBuscadorAutomation(), producto);
		clickElemento(getBtnBuscadorAutomation());
		Thread.sleep(3000);
		if (ValidarUbicacion(lblResultadoBusqueda)) {
			setImgProductoBuscado(producto);
			clickElemento(getImgProductoBuscado());
			setTxtResultadoBusqueda(producto);
			validarTexto(txtResultadoBusqueda,producto);
		}else {
			System.out.println("No se encuentra la pagina resultado de busqueda.");
		}
	}
	
	public void LeerArchivoExcel() throws InterruptedException, IOException {
		String filePath = "C:\\Users\\ABRAHAM\\Desktop\\Semillero SQA\\Products.xlsx";
		String sheetName = "Hoja1";
		LecturaExcel lecturaExcel = new LecturaExcel();
		
		for (int i = 0; i < 5; i++) {
			BorrarTexto(txtBuscadorAutomation);
			buscarAutomation(lecturaExcel.getCellValue(filePath, sheetName, i, 0));
		}
	}

}
