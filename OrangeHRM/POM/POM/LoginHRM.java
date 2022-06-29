package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginHRM {

	WebDriver driver;
	@FindBy(id = "txtUsername")
	WebElement uname;
	@FindBy(how = How.ID, using = "txtPassword")
	WebElement pwd;
	@FindBy(how = How.XPATH, using = "//*[@id=\"btnLogin\"]")
	WebElement btn;

	public LoginHRM(WebDriver driver) {
		this.driver = driver;
	}

	public void HRM_login(String uid, String pass) {
		uname.sendKeys(uid);
		pwd.sendKeys(pass);
		btn.click();
	}

}