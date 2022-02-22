package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionsTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:/Vanitha/Essentials/Browser Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Webpage
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("vanitharavi89@gmail.com");
		Actions act=new Actions(driver);
		//act.sendKeys(Keys.TAB).build().perform();//to perform any action, we must first build it
        act.sendKeys(Keys.TAB,"Password@1").build().perform();
       // act.sendKeys(Keys.ENTER).build().perform();
        
	}

}
