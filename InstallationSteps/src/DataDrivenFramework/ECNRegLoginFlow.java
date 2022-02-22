package DataDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import llib.ExcelDataConfig;

public class ECNRegLoginFlow 
{
   WebDriver driver;
   @Test(dataProvider="LoginTestData")
   public void loginToECN(String username,String password) throws InterruptedException
       {
		    System.setProperty("webdriver.chrome.driver", "C:/Vanitha/Essentials/Browser Drivers/chromedriver_win32/chromedriver.exe");
            driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://community.emc.com/welcome");
		    
		    driver.findElement(By.xpath("//b[contains(text(),'Login / Register')]")).click();
		    Thread.sleep(5000);
			
		    driver.findElement(By.id("login")).sendKeys("username");
	        driver.findElement(By.id("passwd")).sendKeys("password");
	        driver.findElement(By.xpath("//input[@class='submit-button input-button']")).click();
	        
	        //Thread.sleep(10000);
	        
	        Assert.assertTrue(driver.getTitle().contains("Welcome|DECN "),"User is not able to login . Invalid Credentials");
	        System.out.println("Page title verified. User is able to login successfully");
	   }
   
   @AfterMethod  //it will execute every time whether test case passed or failed
   public void tearDown()
   {
	   driver.quit();//closes the current window
   }
   
   @DataProvider(name="LoginTestData") //data provider will always executes first
   public Object[][] passData()
   {
      ExcelDataConfig config= new ExcelDataConfig("N:\\VanithaSelenium\\EcnLogin.xlsx"); 
      int rows=config.getRowCount(0);
      Object[][] data=new Object[rows][2];
      for(int i=0;i<rows;i++)
      {
    	  data[i][0]=config.getData(0,i,0);
    	  data[i][1]=config.getData(0,i,1);
      }
	  return data;
   }
}
