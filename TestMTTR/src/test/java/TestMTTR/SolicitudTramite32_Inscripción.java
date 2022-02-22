package TestMTTR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SolicitudTramite32_Inscripción extends SelectoresComunes {

	By IngRutUreg = By.cssSelector("#content > section > section.main-col > section > app-requests-modify-service-representative > app-forms-input-rut > span > input");
	By LiberarBtn = By.tagName("p-selectbutton");
	By BtnInscripcion =  By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/div/div/p-selectbutton/div/div[1]");
	By IngNombreCom = By.cssSelector("#content > section > section.main-col > section > app-requests-modify-service-representative > app-commons-person-contact-info > app-forms-input-text > span > input");
	By IngNumv= By.cssSelector("#content > section > section.main-col > section > app-requests-modify-service-representative > app-commons-person-contact-info > app-forms-input-phone > span > input");
	By IngEmailv= By.cssSelector("#content > section > section.main-col > section > app-requests-modify-service-representative > app-commons-person-contact-info > app-forms-input-email > div > span > input");
	By AbrirDropReg = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/app-commons-person-address-info/app-geographic-scope-named/div/div[1]/span/p-dropdown");
	By IngresarReg = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/app-commons-person-address-info/app-geographic-scope-named/div/div[1]/span/p-dropdown/div/div[3]/div[1]/div/input");
	By ClickReg = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/app-commons-person-address-info/app-geographic-scope-named/div/div[1]/span/p-dropdown/div/div[3]/div[2]/ul/p-dropdownitem/li");
	By AbrirDropCom = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/app-commons-person-address-info/app-geographic-scope-named/div/div[2]/span/p-dropdown");
	By IngresarComuna = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/app-commons-person-address-info/app-geographic-scope-named/div/div[2]/span/p-dropdown/div/div[3]/div[1]/div/input");
	By ClickComuna = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/app-commons-person-address-info/app-geographic-scope-named/div/div[2]/span/p-dropdown/div/div[3]/div[2]/ul/p-dropdownitem/li");
	By IngresarDire =By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/app-commons-person-address-info/div[1]/span/input");
	By IngresarNum = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/app-commons-person-address-info/div[2]/span/input");
	By BtnSig =By.cssSelector("#content > section > section.main-col > section > app-requests-modify-service-representative > section > div > button");
	By BtnIcon = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-request-documents/app-file-uploaders-documents-list/div/app-file-uploaders-document-list-item/div/div/div[3]/div[1]/button");
	By BtnSig2 = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-request-documents/section/div/button");
	By CheckTerminos = By.cssSelector("div[class='p-checkbox-box']");
	By BtnEnviar = By.xpath("//*[@id=\"content\"]/app-request-summary/section/section[3]/app-requests-finalize-card-payment/div/button");

	public void TrIns32_Modifica_Rep_Legal_Servicio_RNSTP(WebDriver driver) throws InterruptedException {
	
		SelectoresComunes Select = new SelectoresComunes();
		Select.selectoresComunes(driver);
		 
		driver.findElement(IngRutUreg).sendKeys("17243132-1");
		Thread.sleep(2000);
		driver.findElement(LiberarBtn).click();
		Thread.sleep(2000);
		driver.findElement(BtnInscripcion).click();
		Thread.sleep(2000);
		
		driver.findElement(IngNombreCom).sendKeys("Emerson Carlos Oliveras Olmos de Aguilera");
		Thread.sleep(2000);
		driver.findElement(IngNumv).sendKeys("988803787");
		Thread.sleep(2000);
		driver.findElement(IngEmailv).sendKeys("emersono.olmos@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(AbrirDropReg).click();
		Thread.sleep(2000);
		driver.findElement(IngresarReg).sendKeys("Región Metropolitana de Santiago");
		Thread.sleep(2000);
		driver.findElement(ClickReg).click();
		Thread.sleep(2000);
		
		driver.findElement(AbrirDropCom).click();
		Thread.sleep(2000);
		driver.findElement(IngresarComuna).sendKeys("La Florida");
		Thread.sleep(2000);
		driver.findElement(ClickComuna).click();
		
		driver.findElement(IngresarDire).sendKeys("El Canario #11825");
		Thread.sleep(2000);
		driver.findElement(IngresarNum).sendKeys("988803875");
		Thread.sleep(2000);
		driver.findElement(BtnSig).click();
		
		driver.findElement(BtnIcon).click();
		Thread.sleep(10000);
		driver.findElement(BtnSig2).click();
		Thread.sleep(2000);
		
		driver.findElement(CheckTerminos).click();
		Thread.sleep(2000);
		driver.findElement(BtnEnviar).click();
		Thread.sleep(2000);
		

	}
}


