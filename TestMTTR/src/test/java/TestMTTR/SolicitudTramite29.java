package TestMTTR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SolicitudTramite29 extends SelectoresComunes {

	By clickRegion = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-service-responsible-address/app-commons-person-address-info/app-geographic-scope-named/div/div[1]/span");
	By ElegRegion = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-service-responsible-address/app-commons-person-address-info/app-geographic-scope-named/div/div[1]/span/p-dropdown/div/div[3]/div[1]/div/input");
	By ConfRegion = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-service-responsible-address/app-commons-person-address-info/app-geographic-scope-named/div/div[1]/span/p-dropdown/div/div[3]/div[2]/ul/p-dropdownitem/li");
	By clickComuna = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-service-responsible-address/app-commons-person-address-info/app-geographic-scope-named/div/div[2]/span");
	By ElegComuna = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-service-responsible-address/app-commons-person-address-info/app-geographic-scope-named/div/div[2]/span/p-dropdown/div/div[3]/div[1]/div/input");
	By ConfComuna = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-service-responsible-address/app-commons-person-address-info/app-geographic-scope-named/div/div[2]/span/p-dropdown/div/div[3]/div[2]/ul/p-dropdownitem/li");
	By Direccion = By.cssSelector("#content > section > section.main-col > section > app-requests-service-responsible-address > app-commons-person-address-info > div:nth-child(2) > span > input");
	By NumTelef = By.cssSelector("#content > section > section.main-col > section > app-requests-service-responsible-address > app-commons-person-address-info > div:nth-child(3) > span > input");
	By ContinuarUrgDomi = By.cssSelector("#content > section > section.main-col > section > app-requests-service-responsible-address > section > div > button");
	By BtnAdjuntarArch = By.className("btn-icon");
	By ContinuarUrgDocu = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-request-documents/section/div/button");
	By ClickCheckbox = By.className("p-checkbox-box");
	By ContinuarUrgRes = By.cssSelector("#content > app-request-summary > section > section.widget-col > app-requests-finalize-card-payment > div > button");

	
	public void Tr29_Modifica_Domicilio_Legal_Servicio_RNSTP(WebDriver driver) throws InterruptedException {

		SelectoresComunes Select = new SelectoresComunes();
		Select.selectoresComunes(driver);
		
		driver.findElement(clickRegion).click();
	    Thread.sleep(2000);
		driver.findElement(ElegRegion).sendKeys("Región Metropolitana de Santiago");
		Thread.sleep(2000);	
		driver.findElement(ConfRegion).click();
		Thread.sleep(2000);
			
		driver.findElement(clickComuna).click();
		Thread.sleep(2000);
        driver.findElement(ElegComuna).sendKeys("La Florida");
		Thread.sleep(2000);	
		driver.findElement(ConfComuna).click();
		Thread.sleep(2000);
		
		driver.findElement(Direccion).sendKeys("El canario #11825");
		Thread.sleep(2000);
		driver.findElement(NumTelef).sendKeys("+56988803875");
		Thread.sleep(2000);
		driver.findElement(ContinuarUrgDomi).click();
		Thread.sleep(2000);
		driver.findElement(BtnAdjuntarArch).click();
		Thread.sleep(10000);	
		driver.findElement(ContinuarUrgDocu).click();	
		driver.findElement(ClickCheckbox).click();
		Thread.sleep(2000);
		driver.findElement(ContinuarUrgRes).click();
			

	}
}
