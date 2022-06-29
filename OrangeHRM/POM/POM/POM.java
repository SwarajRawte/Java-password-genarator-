package POM;  //for without browser factory class 1 



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM { // Page Object Model
	WebDriver driver;
	By username = By.name("txtUsername");
	By passwoed = By.id("txtPassword");
	By loginbtn = By.xpath("//*[@id=\"btnLogin\"]");
	

	public POM(WebDriver driver) {
		this.driver = driver;

	}

	public void typeusername() {
		driver.findElement(username).sendKeys("Admin");
	}

	public void typepassword() {
		driver.findElement(passwoed).sendKeys("admin123");
	}

	public void clickbtn() {
		driver.findElement(loginbtn).click();
	}
}
