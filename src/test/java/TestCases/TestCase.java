package TestCases;

import org.testng.annotations.Test;
import TestBase.MyLogger;

import TestBase.TestBase;
import TestBase.DriverFactory;
import PageObjects.LoginPage;

public class TestCase extends TestBase {
	
	LoginPage login = new LoginPage();
	
	@Test
	public void TestCase1(){
		System.out.println(" first test case");
		login.LogIn("admin@yourstore.com", "admin");
		
		
		System.out.println(" test case last step ");
	}
	
	@Test
	public void TestCase2(){
		System.out.println(" 2  test case");
		login.LogIn("admin@yourstore.com", "admin1234567");
		
	}
	
	@Test
	public void TestCase3(){
		System.out.println(" 3  test case");
		login.LogIn("admin@yourstore.com", "admin123498765");
	}
	
//	@Test
//	public void TestCase4(){
//		System.out.println(" 4  test case");
//		MyLogger.startTestCase(new Throwable().getStackTrace()[0].getMethodName());
//		MyLogger.info("TEST 4 ");
//		System.out.println(" test case last step ");
//	}

}
