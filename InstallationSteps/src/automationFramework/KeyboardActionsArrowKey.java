package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsArrowKey {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Vanitha/Essentials/Browser Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Webpage
		driver.get("https://the-internet.herokuapp.com/inputs");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='example']//input")).sendKeys("5");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		//act.sendKeys(Keys.TAB).build().perform();//to perform any action, we must first build it
        act.sendKeys(Keys.ARROW_UP).build().perform();
        Thread.sleep(3000);
        
        act.sendKeys(Keys.DOWN).build().perform();
        
        Thread.sleep(3000);
		
        for(int i=0;i<=4;i++)
        {
        	act.sendKeys(Keys.ARROW_UP).build().perform();
        }
	}

}
