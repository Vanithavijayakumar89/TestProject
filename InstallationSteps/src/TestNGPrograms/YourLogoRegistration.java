package TestNGPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YourLogoRegistration {
	
	WebDriver driver;

	@Test (priority=1)
	public void Browser() {
		System.setProperty("webdriver.chrome.driver", "C:/Vanitha/Essentials/Browser Drivers/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test (priority=2)
	public void Pageload() {
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}
	
	@Test (priority=3)
	public void Registration() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email_create")).sendKeys("may01st2021@yopmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(4000);
	}
	
	@Test (priority=4)
	public void PersonalInformation() throws InterruptedException {
		WebElement radio1 = driver.findElement(By.id("id_gender2"));
		Thread.sleep(5000);
		radio1.click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Sujan");
		Thread.sleep(5000);
		driver.findElement(By.id("customer_lastname")).sendKeys("Kumar");
		Thread.sleep(5000);
		driver.findElement(By.id("passwd")).sendKeys("Passw0rd$123");
		driver.findElement(By.id("days")).click();
		Thread.sleep(5000);
		new Select (driver.findElement(By.id("days"))).selectByVisibleText("1  ");
		driver.findElement(By.id("days")).click();
		driver.findElement(By.id("months")).click();
		Thread.sleep(5000);
		new Select (driver.findElement(By.id("months"))).selectByVisibleText("April ");
		driver.findElement(By.id("months")).click();
		driver.findElement(By.id("years")).click();
		Thread.sleep(5000);
		new Select (driver.findElement(By.id("years"))).selectByVisibleText("1988  ");
		driver.findElement(By.id("years")).click();
	}
	
	@Test (priority=5)
	public void AddressInformation() throws InterruptedException {
		driver.findElement(By.id("firstname")).sendKeys("Sujan");
		driver.findElement(By.id("lastname")).sendKeys("Kumar");
		driver.findElement(By.id("company")).sendKeys("QSpiders");
		driver.findElement(By.id("address1")).sendKeys("Chromepet");
		driver.findElement(By.id("address2")).sendKeys("Chennai");
		driver.findElement(By.id("city")).sendKeys("Chennai");
		driver.findElement(By.id("id_state")).click();
		new Select (driver.findElement(By.id("id_state"))).selectByVisibleText("Florida");
		driver.findElement(By.id("id_state")).click();
		driver.findElement(By.id("postcode")).sendKeys("32003");
		driver.findElement(By.id("other")).sendKeys("QA Testing Information");
		driver.findElement(By.id("phone_mobile")).sendKeys("8484848584");
		driver.findElement(By.id("alias")).sendKeys("Address-1");
		driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
	}
	
	@Test (priority=6)
	public void SignOut() {
		driver.findElement(By.linkText("Sign out")).click();
	}
	
	@Test (priority=7)
	public void Signin() {
		driver.findElement(By.id("email")).sendKeys("may01st2019@yopmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Passw0rd$123");
		driver.findElement(By.id("SubmitLogin")).click();
		String PageName = driver.getTitle();
		Assert.assertEquals(PageName, "My account - My Store");
	}
	
}
