package Other;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class alertmsgloginpage { 	
	static WebDriver driver;
	public static String baseUrl = "https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList";
	
	
	@Before
	public void setUp() throws Exception {
		 System.setProperty("webdriver.chrome.driver",
	                "C:\\chrome\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get(baseUrl);
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test
	public void testWeb()  {
		
		driver.findElement(By.name("txtUsename")).sendKeys("");
        driver.findElement(By.name("txtPassword")).sendKeys("d3444");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        Alert alert = driver.switchTo().alert();
        String getOne=driver.switchTo().alert().getText();
        System.out.println(getOne);
        alert.accept();
        
	}
	@After
	public void tearDown() throws Exception {
		
		driver.quit();
	}
		
}
