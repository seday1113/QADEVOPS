package TestBase;

import java.util.concurrent.TimeUnit;
import ReusableComponents.ActionEngine;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import ReusableComponents.PropertuFile;

public class TestBase extends ActionEngine {
	
	BrowserFactory bf = new BrowserFactory();
	
	
	@BeforeMethod
	public void LaunchApp() throws Exception{
		
		String browser = PropertuFile.getPropertyByValue("browser");
		
		String url = PropertuFile.getPropertyByValue("url");
		
		WebDriver driverInstance = bf.CreateBrowserInstance(browser);
		
		
		
		DriverFactory.getInstance().setDriver(driverInstance);
		
		WebDriver driver = DriverFactory.getInstance().getDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		
		
	}
	
	@AfterMethod
	public void TearDown(){
		
		 DriverFactory.getInstance().CloseBrowser();
		
	}

}
