package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EcnFindCommunity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Vanitha/Essentials/Browser Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://community.emc.com/welcome");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//b[contains(text(),'Login / Register')]")).click();
		Thread.sleep(5000);
		//Login 
		WebElement ele2=driver.findElement(By.id("login"));
				ele2.sendKeys("vanitharavi89@gmail.com");
        WebElement ele1=driver.findElement(By.id("passwd"));
        		ele1.sendKeys("Viva@1989");
        driver.findElement(By.xpath("//input[@class='submit-button input-button']")).click();
        
        //Find a Community
        //WebElement Category=driver.findElement(By.xpath("//b[contains(text(),'Find a Community')]"));
        Actions act=new Actions(driver);
        //act.moveToElement(Category).build().perform();
        
      //Explore
        WebElement explore=driver.findElement(By.xpath("//b[contains(text(),'Explore')]"));
        act.moveToElement(explore).build().perform();
	
	}

}
