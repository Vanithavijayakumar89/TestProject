package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcnRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Vanitha/Essentials/Browser Drivers/chromedriver_win32/chromedriver.exe");//browser preference
		WebDriver driver=new ChromeDriver();//opening the browser
		driver.get("https://www.dell.com/community/Dell-Community/ct-p/English");//hitting the url
		driver.manage().window().maximize();//maximize the browser
		
		//user registration
		driver.findElement(By.xpath("//b[contains(text(),'Login / Register')]")).click();
		Thread.sleep(5000);
		WebElement Register = driver.findElement(By.xpath("//input[@class='submit-button']"));
		Register.click();
		driver.findElement(By.id("firstname")).sendKeys("Vanitha");
		driver.findElement(By.id("lastname")).sendKeys("Vijay");
		driver.findElement(By.id("email")).sendKeys("jobstovani@gmail.com");
        driver.findElement(By.id("email2")).sendKeys("jobstovani@gmail.com");	
        driver.findElement(By.id("screenname")).sendKeys("VanithaVijay");
        //driver.findElement(By.id("current-complete")).sendKeys("Viva@1989@V");
        driver.findElement(By.id("npassword")).sendKeys("Viva1989V");
        driver.findElement(By.id("npassword2")).sendKeys("Viva1989V");
        Thread.sleep(20000);
        driver.findElement(By.id("form-submit")).click();
        
        
        //Login 
       /* driver.findElement(By.id("login")).sendKeys("jobstovani@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Viva@1989@V");
        driver.findElement(By.xpath("//input[@class='submit-button input-button']"));*/
        
        //Find a Community
     /*   WebElement FaC=driver.findElement(By.xpath("//b[contains(text(),'Find a Community')]"));
        Actions act=new Actions(driver);
        act.moveToElement(FaC).build().perform();
        //category
        WebElement category=driver.findElement(By.xpath("//span[@class='communityMenuTabButton active']"));
        category.click();
        //servers
        WebElement Servers=driver.findElement(By.linkText("Servers"));
        Servers.click();
        
        //Explore
        WebElement explore=driver.findElement(By.xpath("//b[contains(text(),'Explore')]"));
        act.moveToElement(explore).build().perform();
        //People
        WebElement people=driver.findElement(By.linkText("People"));
        people.click();
        
        //Events
        WebElement events=driver.findElement(By.xpath("//b[contains(text(),'Events')]"));
        act.moveToElement(events).build().perform();
        //EMC World
        WebElement EMCW=driver.findElement(By.linkText("EMC World"));
        EMCW.click();
        
        //Create 
        WebElement create=driver.findElement(By.id("navCreate"));
         create.click();
        //Message
         WebElement msg=driver.findElement(By.linkText("Message"));
         msg.click();
         driver.findElement(By.id("recipients")).sendKeys("vanitharavi89@gmail.com");
         driver.findElement(By.id("message-direct-message-text")).sendKeys("Hi... How r u?");
         driver.findElement(By.xpath("//input[contains(@name,'share-content-submit')]")).click();
         
         //Menu
         driver.findElement(By.id("header-icon-menu")).click();
         driver.findElement(By.id("globalnav-overlay-menu-tab-products")).click();*/
         
	}

}