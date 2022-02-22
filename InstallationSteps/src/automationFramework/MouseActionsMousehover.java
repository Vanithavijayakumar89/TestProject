package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsMousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:/Vanitha/Essentials/Browser Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Webpage
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
	    WebElement Men=driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
	    Actions act= new Actions(driver);
        act.moveToElement(Men).build().perform();	
        
        //WebElement sweater=driver.findElement(By.xpath("//a[contains(text(),'Sweaters')]"));
       WebElement sweater=driver.findElement(By.linkText("Sweaters"));
        sweater.click();
        
        
	}

}
