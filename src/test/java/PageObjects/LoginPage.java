package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import TestBase.DriverFactory;
import TestBase.TestBase;

public class LoginPage extends TestBase {
	
	By EMAIL = By.id("Email");
	By PASSWORD = By.id("Password");
	By LOGIN_BTN = By.xpath("//button[contains(text(),'Log')]");
	
	//Page Factory - OR:
		//@FindBy(id="EMail")
		//WebElement Text_Email;
		
	//	@FindBy(id="Password")
	//	WebElement t_password;
		
	//	@FindBy(xpath="//button[contains(text(),'Log')]")
	//	WebElement loginBtn;
		
	
		public void LogIn(String email, String password){
			
		DriverFactory.getInstance().getDriver().findElement(EMAIL).clear();
		DriverFactory.getInstance().getDriver().findElement(PASSWORD).clear();
			
			sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(EMAIL), "LoginEmailFIeld", email);
			sendKeys_custom(DriverFactory.getInstance().getDriver().findElement(PASSWORD), "LoginPasswordFIeld", password);

			click_custom(DriverFactory.getInstance().getDriver().findElement(LOGIN_BTN), "LoginButton");
			
//			Text_Email.clear();
//			t_password.clear();
//			Text_Email.sendKeys(email);
//			t_password.sendKeys(password);
//			loginBtn.click();
			
			
		}

}
