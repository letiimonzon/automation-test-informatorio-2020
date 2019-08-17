package io.github.jschenfeld.automation.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleResultadosPageFactory {

	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	private WebElement ingresolink;
	
	public GoogleResultadosPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void abrirLaPaginaDeIngreso() {
		ingresolink.click();
	}
}
