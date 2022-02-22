package TestMTTR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectoresComunes {
	
	By AccederUdreg = By.className("cardHome");
	By ImputTramite = By.xpath("//*[@id=\"content\"]/div[2]/p-autocomplete/span/input");
	By IrTramiteUreg =  By.cssSelector("#content > app-procedures-landing > div > div.widget-col > div > button");
	By IngresaRunUreg = By.id("uname");
	By IngresaTuClaveUreg = By.id("pword");
	By ContinuarUreg1CUnica = By.id("login-submit");
	By DropdownPersona = By.xpath("/html/body/app-root/div/app-tracker-layout/app-navmenu/div/nav/div/div[2]/div[3]/app-users-change/div/div/div/p-dropdown");
	By CambiarPersona = By.xpath("/html/body/app-root/div/app-tracker-layout/app-navmenu/div/nav/div/div[2]/div[3]/app-users-change/div/div/div/p-dropdown/div/div[3]/div/ul/p-dropdownitem[2]/li"); 
	By RegionUreg = By.xpath("//*[@id=\"content\"]/app-service-identification/div/div[2]/div[1]/div/div[1]/span/p-dropdown");
	By EscogRegion= By.xpath("//*[@id=\"content\"]/app-service-identification/div/div[2]/div[1]/div/div[1]/span/p-dropdown/div/div[3]/div[1]/div/input");
	By ClickRegion = By.xpath("//*[@id=\"content\"]/app-service-identification/div/div[2]/div[1]/div/div[1]/span/p-dropdown/div/div[3]/div[2]/ul/p-dropdownitem/li");
	By IngFolio = By.xpath("//*[@id=\"content\"]/app-service-identification/div/div[2]/div[1]/div/app-forms-input-folio/span/input");
	By IngEmail = By.xpath("//*[@id=\"content\"]/app-service-identification/div/div[2]/div[1]/div/app-forms-input-email/div/span[1]/input");
	By ConfEmail = By.xpath("//*[@id=\"content\"]/app-service-identification/div/div[2]/div[1]/div/app-forms-input-email/div/span[2]/input");
	By ComenzarUreg = By.cssSelector("#content > app-service-identification > div > div.main-col > div.form-layout.ng-dirty.ng-touched.ng-valid > div > div.step-actions > div > button");

	public void selectoresComunes(WebDriver driver) throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(AccederUdreg).click();
		Thread.sleep(2000);
		driver.findElement(ImputTramite).click();
		Thread.sleep(2000);
		driver.findElement(ImputTramite).sendKeys("Cancelación de la Inscripción de un Servicio Inscrito en el Registro Nacional de Servicios de Transporte de Pasajeros");
		Thread.sleep(5000);
	    driver.findElement(IrTramiteUreg).click();
	    Thread.sleep(5000);
	  
		driver.findElement(IngresaRunUreg).sendKeys("44.444.444-4");
		driver.findElement(IngresaTuClaveUreg).sendKeys("testing");
		driver.findElement(ContinuarUreg1CUnica).click();
		
		Thread.sleep(2000);//esperas explicitas
		driver.findElement(DropdownPersona).click();
		Thread.sleep(2000);//esperas explicitas
		driver.findElement(CambiarPersona).click();

		Thread.sleep(2000);
		driver.findElement(RegionUreg).click();
		Thread.sleep(2000);
		driver.findElement(EscogRegion).sendKeys("Región de Valparaíso");
		Thread.sleep(2000);
	    driver.findElement(ClickRegion).click();
		Thread.sleep(2000);
		driver.findElement(IngFolio).sendKeys("234");
		Thread.sleep(2000);
		driver.findElement(IngEmail).sendKeys("carlos.gonzalez@social-it.cl");
		Thread.sleep(2000);
        driver.findElement(ConfEmail).sendKeys("carlos.gonzalez@social-it.cl");
		Thread.sleep(2000);
		driver.findElement(ComenzarUreg).click();
		Thread.sleep(2000);
	} 
}
