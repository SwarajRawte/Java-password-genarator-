

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Listeners2 implements ITestListener {
	Boolean s1,s2,s3;
	@Test
	public void login() {
		 System.setProperty("webdriver.chrome.driver",
	                "C:\\\\Users\\\\HCL TSS\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList");
	        s1=driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).isDisplayed();// it check the  box is present 
	        System.out.println(s1 + " Username is present");
	        s2=driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).isDisplayed();
	        System.out.println(s2 + " password is present");
	        s3= driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).isDisplayed();
	        System.out.println(s3 + " click button is present");
	        driver.get("https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList");
	        driver.findElement(By.id("txtUsername")).sendKeys("Admin" );
		    driver.findElement (By.id("txtPassword") ).sendKeys("admin123");
		    driver.findElement (By.name("Submit")) . click( );
		    
	
	
	
}

	@Override
	public void onFinish(ITestContext Result) {
		// TODO Auto-generated method stub
		System.out.println("Congrats the testcase execution finished "+Result.getName());
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("The name of the testcase failed is :"+arg0.toString());
		
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		 System.out.println("Test case started"+arg0.toString());
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
	
		System.out.println("Congrats the testcase has been passed "+arg0.toString());
		
	}

}
