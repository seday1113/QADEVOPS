package TestBase;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	
	// thread local  -- threading 
	//  single ton , factory 
	
	private DriverFactory(){
		
	}
	
	private static DriverFactory instance = new DriverFactory();
	
	public static DriverFactory getInstance(){
		return instance;
	}
	
	
	//  factory design patteren --  define seperate factory methods for creationg objects and creating objects by calling that methods 
	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	
	public WebDriver getDriver(){
		
		return driver.get();
	}
	
	public void setDriver(WebDriver driverparm){
		
		driver.set(driverparm);
			
		}
	
	public void CloseBrowser(){
		
		driver.get().close();
		driver.remove();
		
	}
	
	}
