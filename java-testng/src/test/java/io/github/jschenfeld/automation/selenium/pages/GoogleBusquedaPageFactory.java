package io.github.jschenfeld.automation.selenium.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleBusquedaPageFactory {

	/*@FindBy(name = "q")
	private WebElement campoDeBusqueda;

	
	@FindBy (className = " result--more__btn btn btn--full")
	private WebElement botonSig;

	

	public void ingresarBusqueda(String consulta) {
		campoDeBusqueda.sendKeys(consulta);
		campoDeBusqueda.sendKeys(Keys.TAB);
	}

	public void clickBotonBuscar() {
		botonBuscar.submit();
	}
*/
	
	
	@FindBy(xpath="//*/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;
	
	public GoogleBusquedaPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}