package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Test.OrangeTest;
import Browserfactory.BrowserFactory;
import POM.LoginHRM;

public class OrangeTest {
	@Test
	public void checkvalidUser() {
		WebDriver driver = BrowserFactory.startBrowser("chrome", "https://opensource-demo.orangehrmlive.com/");
		LoginHRM loginp = PageFactory.initElements(driver, LoginHRM.class);
		loginp.HRM_login("Admin", "admin123");
	}
}


