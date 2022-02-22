package TestMTTR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SolicitudTramite32_Modificación extends SelectoresComunes {
	

	By IngRutUreg = By.cssSelector("#content > section > section.main-col > section > app-requests-modify-service-representative > app-forms-input-rut > span > input");
	By LiberarBtn = By.tagName("p-selectbutton");
	By BtnModific =  By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/div/div/p-selectbutton/div/div[2]");
	By ModifNum = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/app-commons-person-contact-info/app-forms-input-phone/span/input");
	By ModifMail = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/app-commons-person-contact-info/app-forms-input-email/div/span/input");
	By AbrirDropReg = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/app-commons-person-address-info/app-geographic-scope-named/div/div[1]/span/p-dropdown");
	By IngresarReg = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/app-commons-person-address-info/app-geographic-scope-named/div/div[1]/span/p-dropdown/div/div[3]/div[1]/div/input");
	By ClickReg = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/app-commons-person-address-info/app-geographic-scope-named/div/div[1]/span/p-dropdown/div/div[3]/div[2]/ul/p-dropdownitem/li");
	By AbrirDropCom = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/app-commons-person-address-info/app-geographic-scope-named/div/div[2]/span/p-dropdown");
	By IngresarCom = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/app-commons-person-address-info/app-geographic-scope-named/div/div[2]/span/p-dropdown/div/div[3]/div[1]/div/input");
	By ClickCom = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/app-commons-person-address-info/app-geographic-scope-named/div/div[2]/span/p-dropdown/div/div[3]/div[2]/ul/p-dropdownitem/li");
	By ModifDire = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/app-commons-person-address-info/div[1]/span/input");
	By ModifNume = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/app-commons-person-address-info/div[2]/span/input");
	By BtnSig = By.xpath("//*[@id=\"content\"]/section/section[2]/section/app-requests-modify-service-representative/section/div/button");


	
	public void TrModif32_Modifica_Rep_Legal_Servicio_RNSTP(WebDriver driver) throws InterruptedException {

		SelectoresComunes Select = new SelectoresComunes();
		Select.selectoresComunes(driver);

		driver.findElement(IngRutUreg).sendKeys("8739608-8");
		Thread.sleep(2000);
		driver.findElement(LiberarBtn).click();
		Thread.sleep(2000);
		driver.findElement(BtnModific).click();
		Thread.sleep(2000);
		
		driver.findElement(ModifNum).clear();
		Thread.sleep(2000);
		driver.findElement(ModifNum).sendKeys("988803875");
		Thread.sleep(2000);
		driver.findElement(ModifMail).clear();
		Thread.sleep(2000);
		driver.findElement(ModifMail).sendKeys("emersono.olmos@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(AbrirDropReg).click();
		Thread.sleep(2000);
		driver.findElement(IngresarReg).sendKeys("Región de Coquimbo");
		Thread.sleep(2000);
		driver.findElement(ClickReg).click();
		driver.findElement(AbrirDropCom).click();
		Thread.sleep(2000);
		driver.findElement(IngresarCom).sendKeys("Vicuña");
		Thread.sleep(2000);
		driver.findElement(ClickCom).click();
		Thread.sleep(2000);
		driver.findElement(ModifDire).clear();
		driver.findElement(ModifDire).sendKeys("El canario #11825");
		Thread.sleep(2000);
		driver.findElement(ModifNume).sendKeys("22898525");
		driver.findElement(BtnSig).click();
		Thread.sleep(2000);

	}
}
