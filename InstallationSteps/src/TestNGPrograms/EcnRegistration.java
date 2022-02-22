package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class EcnRegistration {
	
	WebDriver driver;
	
	@Test(priority=1)
	public void browser()
		{
			System.setProperty("webdriver.chrome.driver", "C:/Vanitha/Essentials/Browser Drivers/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();
		}
	
	@Test(priority=2)
	public void pageLoad()
	{
		driver.get("https://community.emc.com/welcome");
		driver.manage().window().maximize();
	}
	
	@Test(priority=3)
	public void loginRegister() throws InterruptedException
	{
		driver.findElement(By.xpath("//b[contains(text(),'Login / Register')]")).click();
		Thread.sleep(2000);
		WebElement element1=driver.findElement(By.className("submit-button"));
		element1.click();
		
		
	}
	
	@Test(priority=4)
	public void userDetails() throws InterruptedException
	{
		driver.findElement(By.id("firstname")).sendKeys("Vanitha");
		driver.findElement(By.id("lastname")).sendKeys("Vijay");
		driver.findElement(By.id("email")).sendKeys("jobstovani@gmail.com");
        driver.findElement(By.id("email2")).sendKeys("jobstovani@gmail.com");
        driver.findElement(By.id("screenname")).sendKeys("Vi");
        Thread.sleep(5000);
        //String actError=driver.findElement(By.xpath("//span[contains(text(),'Sorry Vi is in use already.')]")).getText();
        String actError=driver.findElement(By.xpath("//span[contains(text(),'Sorry Vi is in use already.')]")).getAttribute("innerHTML");
        String expError="Sorry Vi is in use already.";
        Assert.assertEquals(actError, expError,"Test case failed");
        //driver.findElement(By.id("current-complete")).sendKeys("Viva@1989");
        driver.findElement(By.id("npassword")).sendKeys("Viva@1989");
        driver.findElement(By.id("npassword2")).sendKeys("Viva@1989");
        Thread.sleep(20000);
	}
	
	@Test(priority=5)
	public void submit() throws InterruptedException
	{
		driver.findElement(By.id("form-submit")).click();
		
		Thread.sleep(5000);
		//Hard Assert for Error Message
		/*String actualError=driver.findElement(By.id("regerrormsg")).getText();
		String expectedError="The following values are invalid: First Name, Last Name, Email, Password, Enter Captcha code";
		Assert.assertEquals(actualError,expectedError,"Testcase passed"); */
		
		
		//Hard Assert for password not matching
		/*String actError=driver.findElement(By.id("password-not-matching")).getText();
		String expError="Password doesn't matchh";
		Assert.assertEquals(actError, expError,"Testcase failed");*/
	}
	
}
