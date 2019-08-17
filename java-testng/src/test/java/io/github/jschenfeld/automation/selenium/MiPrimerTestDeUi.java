package io.github.jschenfeld.automation.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.github.jschenfeld.automation.selenium.pages.GoogleBusquedaPageFactory;
import io.github.jschenfeld.automation.selenium.pages.GoogleBusquedaPageObject;
import io.github.jschenfeld.automation.selenium.pages.GoogleResultadosPageFactory;

public class MiPrimerTestDeUi {
	
	private WebDriver driver;

	@BeforeMethod
	public void inicializarBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();
//		driver = new FirefoxDriver();
	}

	/*@Test (enabled = false)
	public void busquedaEnGoogle() {
		driver.get("http://automationpractice.com");

		GoogleBusquedaPageObject googleBusquedaPage = new GoogleBusquedaPageObject(driver);
		googleBusquedaPage.buscarsignIn("Sign in");
		googleBusquedaPage.clicksignIn();

		System.out.println(driver.getCurrentUrl());
	}
*/
	@Test
	public void busquedaEnGoogleUsandoPageFactory() {
		driver.get("http://automationpractice.com");

		GoogleBusquedaPageFactory googleBusquedaPage = new GoogleBusquedaPageFactory(driver);
		googleBusquedaPage.buscarsignIn("Sign in");
		GoogleResultadosPageFactory googleResultadosPageFactory = new GoogleResultadosPageFactory(driver);
		googleResultadosPageFactory.abrirLaPaginaDeIngreso();
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals("http://automationpractice.com", driver.getCurrentUrl());
	}

	@AfterMethod(alwaysRun = true)
	public void cerrarBrowser() {
		if (null != driver) {
			driver.quit();
		}
	}
}