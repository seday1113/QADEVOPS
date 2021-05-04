package com.Devops.QADEVOPS;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass1 {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void LaunchDriver()throws MalformedURLException
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
		
				
	}
	
	@Test
	public void Test1(){
		
         driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		System.out.println(" Test  1      Title of the page is "+driver.getTitle());
		
	}
	    @Test
		public void Test2(){
			
			driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
			
			System.out.println(" Test 2     Title of the page is "+driver.getTitle());
				
			}
		
	    @Test
	    public void Test3(){
			
			driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
			
			System.out.println("  Test  3    Title of the page is "+driver.getTitle());
			
		}
	    
	    
	    @AfterMethod
	    public void quit(){
	    	
	    	driver.quit();
	    	
	    }
	
	

}
