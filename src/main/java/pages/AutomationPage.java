package pages;

import org.openqa.selenium.By;

public class AutomationPage {
	
	protected By txtBuscadorAutomation = By.xpath("//input[@id='search_query_top']");
	protected By btnBuscadorAutomation = By.xpath("//button[@name='submit_search']");
	protected By lblResultadoBusqueda = By.xpath("//span[@class='heading-counter']");
	protected By imgProductoBuscado;
	protected By txtResultadoBusqueda;

	public By getTxtResultadoBusqueda() {
		return txtResultadoBusqueda;
	}

	public void setTxtResultadoBusqueda(String nombreProducto) {
		this.txtResultadoBusqueda = By.xpath("//h1[contains(text(),'"+nombreProducto+"')]");
	}

	public By getTxtBuscadorAutomation() {
		return txtBuscadorAutomation;
	}

	public By getBtnBuscadorAutomation() {
		return btnBuscadorAutomation;
	}

	public By getLblResultadoBusqueda() {
		return lblResultadoBusqueda;
	}

	public By getImgProductoBuscado() {
		return imgProductoBuscado;
	}
	
	public void setImgProductoBuscado(String nombreProducto) {
		this.imgProductoBuscado = By.xpath("//ul[contains(@class,'product_list')]//li[contains(@class,'first')]//a[contains(text(),'"+nombreProducto+"')]");
	}
	
}
