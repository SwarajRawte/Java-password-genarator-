

import java.io.File;//based on TestN framework

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class DataDrivenTesting {
	WebDriver driver;
	Workbook wb;
	Sheet sh;
	int numrow;
	String uname;
	String pwd;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
	             "C:\\Users\\HCL TSS\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.get("https://opensource-demo.orangehrmlive.com/");
	      driver.manage().window().maximize();
	      
	}
	@Test(dataProvider="testdata")
	
	public void verifiy(String uname, String pwd) {
		s1=driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).isDisplayed();
        System.out.println(s1 + " Username is present");
        driver.findElement(By.name("txtUsername")).sendKeys(uname);
        s2=driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).isDisplayed();
        System.out.println(s2 + " password is present");
        driver.findElement(By.name("txtPassword")).sendKeys(pwd);
        s3= driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).isDisplayed();
        System.out.println(s3 + " click button is present");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click(); 
	        
	        
	        
	}
	
   @DataProvider(name = "testdata")
	public Object [][] TestDataFeed(){
	
		try {
			wb = Workbook.getWorkbook(new File ("C:\\Users\\HCL TSS\\OneDrive\\Desktop\\Book1.xls"));
			sh = wb.getSheet(0);
			numrow = sh.getRows();
		}
		catch(Exception e)
		{ 
			e.printStackTrace();
			
		}
   
		Object[][] lmsdata = new Object [numrow][sh.getColumns()];
		for(int i=0;i<numrow;i++) {
			lmsdata[i][0]= sh.getCell(0,i).getContents();
			lmsdata[i][1]= sh.getCell(1,i).getContents();
			
		
		
   
}
	return lmsdata;
   }
}

