package TestNGPrograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class YourLogoLoginParallel 
{
	
WebDriver driver;

	

@Test(priority = 1)
@Parameters("browser")
public void Browser(String Browsertype) 
{
  if (Browsertype.equalsIgnoreCase("Chrome")) 
  {
			
    System.setProperty("webdriver.chrome.driver", "C:/Vanitha/Essentials/Browser Drivers/chromedriver_win32/chromedriver.exe");
    driver = new ChromeDriver();
  }

		
  else if (Browsertype.equalsIgnoreCase("Firefox")) 
  {
    System.setProperty("webdriver.gecko.driver", "C:/Vanitha/Essentials/Browser Drivers/chromedriver_win32/chromedriver.exe");
    driver = new FirefoxDriver();

  }
  
  else if (Browsertype.equalsIgnoreCase("IE"))
  {
	System.setProperty("webdriver.ie.driver", "C:/Vanitha/Essentials/Browser Drivers/chromedriver_win32/chromedriver.exe");
    driver = new InternetExplorerDriver();

  }

}

	


@Test(priority = 2)
	
public void Pageload() 
{
		

driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();
	
}

	


@Test(priority = 3)
	
public void login() 
{
		

driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();

		driver.findElement(By.id("email")).sendKeys("may01st2019@yopmail.com");

		driver.findElement(By.id("passwd")).sendKeys("Passw0rd$123");
		
driver.findElement(By.id("SubmitLogin")).click();

	}

	

@Test(priority = 4)
	
public void logout() {
		
driver.findElement(By.className("logout")).click();

	}

	
	

@Test(priority = 5)
	
public void validation()
 {
		
String title = driver.getTitle();
		
Assert.assertEquals(title, "Login - My Store");


	}


}
