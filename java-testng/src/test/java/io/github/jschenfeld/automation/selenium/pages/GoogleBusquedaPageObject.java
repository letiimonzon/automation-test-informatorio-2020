package io.github.jschenfeld.automation.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleBusquedaPageObject {
	
	private WebDriver driver;
	
	public GoogleBusquedaPageObject(WebDriver driver) {
		this.driver = driver;
	}

	/*public void ingresarBusqueda(String consulta) {
		WebElement campoDeBusqueda = driver.findElement(By.name("q"));
		campoDeBusqueda.sendKeys(consulta);
		campoDeBusqueda.sendKeys(Keys.TAB);
	}*/
	
	public void buscarsignIn() {
		WebElement buscarsignIn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		buscarsignIn.click();
	}

	
}
