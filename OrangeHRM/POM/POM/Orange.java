package POM;  //without browser factory class 2 main class 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Orange {
	
	@Test
	public void verifyLogin() {		
		
		System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\HCL TSS\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        driver.manage().window().maximize();
        
        POM page = new POM(driver);
        
        page.typeusername();
        page.typepassword();
        page.clickbtn();
	}
}
