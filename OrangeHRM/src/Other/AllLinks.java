package Other;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
	WebDriver driver;
	public static String Url = "https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList";

	@Before
	public void setUp() throws Exception {
	        System.setProperty("webdriver.chrome.driver",
	                "C:\\\\Users\\\\HCL TSS\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get(Url);
	}

	@Test
	public void testWeb() throws Exception {

	

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		driver.findElement(By.xpath("//*[@id=\"searchSystemUser_userName\"]")).sendKeys("adwef");

		List<WebElement> alllink = driver.findElements(By.tagName("a"));
		// Traversing through the page to find out the number of links
		System.out.println("total number of links:" + alllink.size());// it will display all the links on page
		for (WebElement link : alllink) {
			System.out.println(link.getText() + "-" + link.getAttribute("href"));
		}

		String Actual = driver.getTitle();// it will get all the title
		String Expected = "https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList";

		if (Actual.equals(Expected)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();

	}

}
