package Other;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Tags  {// this will be used for finding tags on webpage using TestNG framework
	public static String baseUrl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
  WebDriver driver;
	
	@BeforeMethod

	public void setUp() throws Exception {
		
	System.setProperty("webdriver.chrome.driver",
	             "C:\\\\chrome\\\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get(baseUrl);
	}

	@Test
	public void testWeb() throws Exception {
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		String E1= driver.findElement(By.tagName("h1")).getText();
		if(E1.contains("h1")) {
		System.out.println(E1);
		}
		else { 
			System.out.println("H1 tag is not present");
		}
		String e2=driver.findElement(By.xpath("//*[@id=\"div_graph_display_emp_distribution\"]/canvas[2]")).getCssValue("color");
		System.out.println(e2);
		 String hexBuilder=Color.fromString(e2).asHex();
         System.out.println(hexBuilder);

	}
	


	@AfterMethod

	public void tearDown() throws Exception {
		driver.close();
	
	}

}