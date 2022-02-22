package TestMTTR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SolicitudTramite32_Eliminar extends SelectoresComunes {


	By IngRutUreg = By.cssSelector("#content > section > section.main-col > section > app-requests-modify-service-representative > app-forms-input-rut > span > input");
	By LiberarBtn = By.tagName("p-selectbutton");
	By BtnEliminar =  By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/div/div/p-selectbutton/div/div[3]");
	By BtnSig = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/section/div/button");
	By BtnIcon = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-request-documents/app-file-uploaders-documents-list/div/app-file-uploaders-document-list-item/div/div/div[3]/div[1]/button");
	By BtnSig2 = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-request-documents/section/div/button");
	By CheckTerminos = By.cssSelector("div[class='p-checkbox-box']");
	By BtnEnviar = By.xpath("//*[@id=\"content\"]/app-request-summary/section/section[3]/app-requests-finalize-card-payment/div/button");

	
	public void TrElimi32_Modifica_Rep_Legal_Servicio_RNSTP(WebDriver driver) throws InterruptedException {

		SelectoresComunes Select = new SelectoresComunes();
		Select.selectoresComunes(driver);
		 
		Thread.sleep(2000);
		driver.findElement(IngRutUreg).sendKeys("8739608-8");
		Thread.sleep(2000);
		driver.findElement(LiberarBtn).click();
		Thread.sleep(2000);
		driver.findElement(BtnEliminar).click();
		Thread.sleep(2000);
		driver.findElement(BtnSig).click();
		Thread.sleep(2000);
		
		driver.findElement(BtnIcon).click();
		Thread.sleep(10000);
		driver.findElement(BtnSig2).click();
		Thread.sleep(2000);
		
		driver.findElement(CheckTerminos).click();
		Thread.sleep(2000);
		driver.findElement(BtnEnviar).click();
	}
}
