package TestMTTR;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetDriver {
	
	public static WebDriver setUpChorme()
	{
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://liun.mtt.cl:15500/inicio");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public static WebDriver setUpMozilla()
	{
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://liun.mtt.cl:15500/inicio");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public static WebDriver setUpEdge()
	{
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://liun.mtt.cl:15500/inicio");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		return driver;
	}

}
