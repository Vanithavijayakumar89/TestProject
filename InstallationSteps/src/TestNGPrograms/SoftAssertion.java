package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class SoftAssertion {
	
WebDriver driver;
String Elemnt1;
SoftAssert softassert;
	
	@Test (priority=1)
	public void Browser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Vanitha/Essentials/Browser Drivers/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
	}
	
	@Test (priority=2)
	public void assertEquals() {
		String Elemnt1 = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		System.out.println("Elemnt1 =" +Elemnt1);
		softassert = new SoftAssert();
		softassert.assertEquals(Elemnt1, "ONLINE BANKING");
		System.out.println("Assert Equals Pass");
	}
	
	@Test (priority=3)
	public void assertNotEquals() {
		softassert.assertNotEquals(Elemnt1, "Online Banking");
		System.out.println("Assert Not Equals Pass");
	}
	
	@Test (priority=4)
	public void assertTrue() {
		softassert.assertTrue("ONLINE BANKING".equals(driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText()), "Assert True Statement");
		System.out.println("Assert True Pass");
	}
	
	@Test (priority=5)
	public void assertFalse() {
		softassert.assertFalse("Online Banking".equals(Elemnt1), "Assert Fail Statement");
		System.out.println("Assert False Pass");
	}
		
	@Test (priority=6)
	public void assertNotNull() {
		Object obj2 = driver.getTitle();
		softassert.assertNotNull(obj2);
		System.out.println(obj2);
		System.out.println("Assert Not Null Pass");
	}
	
	@Test (priority=7)
	public void assertNull() {
		Object obj3 = null;
		System.out.println(obj3);
		softassert.assertNull(obj3);
		System.out.println("Assert Null Pass");
		
	}

}
