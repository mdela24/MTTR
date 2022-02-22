package TestMTTR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SolicitudTramite17 extends SelectoresComunes {
	
	By CheckAceptoTyCUreg = By.cssSelector("#content > app-request-summary > section > section.widget-col > app-requests-finalize-card-payment > div > app-disclaimer > div > label > p-checkbox");
	By PagarUreg = By.cssSelector("#content > app-request-summary > section > section.widget-col > app-requests-finalize-card-payment > div > button.btn.btn-primary.btn-block.ng-star-inserted");
	By IrTGRUreg = By.cssSelector("body > p-dynamicdialog > div > div > div > app-dialogs-confirm > div > div > button.btn.btn-primary");
	By IconoBcoVirtualUreg = By.id("todos0");
	By PagarLineaVirtualUreg = By.id("id-button-button-icon");
	By AutorzaPagoVirUreg = By.cssSelector("input[value='Autorizar']");
	By IngreseSuEmailUreg = By.name("name");
	By BotonIngreseSuEmailUreg = By.id("id-div-mail-enviar");
	By FinalizarTr= By.cssSelector("#mostrarDetalle > div > button"); 
	
	public void Tr17_Modifica_Dominio_Veh�culo_RNSTP(WebDriver driver) throws InterruptedException {
		
		SelectoresComunes Select = new SelectoresComunes();
		Select.selectoresComunes(driver);

		driver.findElement(CheckAceptoTyCUreg).click();
		Thread.sleep(2000);// esperas explicitas
		driver.findElement(PagarUreg).click();
		Thread.sleep(2000);// esperas explicitas

		driver.findElement(IrTGRUreg).click();
		Thread.sleep(2000);// esperas explicitas

		driver.findElement(IconoBcoVirtualUreg).click();
		Thread.sleep(2000);// esperas explicitas
		driver.findElement(PagarLineaVirtualUreg).click();
		Thread.sleep(2000);// esperas explicitas
		driver.findElement(AutorzaPagoVirUreg).click();
		Thread.sleep(2000);// esperas explicitas

		driver.findElement(IngreseSuEmailUreg).sendKeys("carlos.gonzalez@social-it.cl");
		Thread.sleep(2000);// esperas explicitas
		driver.findElement(BotonIngreseSuEmailUreg).click();
		Thread.sleep(5000);// esperas explicitas
		driver.findElement(FinalizarTr).click();



	}
}
