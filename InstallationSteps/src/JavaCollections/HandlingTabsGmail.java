package JavaCollections;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabsGmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Vanitha/Essentials/Browser Drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/gmail/about/#");
        driver.manage().window().maximize();
        
        driver.findElement(By.linkText("Create an account")).click();
        String mainWindow=driver.getWindowHandle();
        System.out.println("MainWIndow handle\\t"+mainWindow);
        
        ArrayList <String> tabs=new ArrayList <String>(driver.getWindowHandles());
        for(String obj:tabs)
        {
        	System.out.println(obj);
        }
        
        Thread.sleep(3000);
        
        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getTitle());
        
        driver.findElement(By.id("firstName")).sendKeys("Vanitha");
        driver.findElement(By.id("lastName")).sendKeys("Vijay");
        driver.findElement(By.id("username")).sendKeys("Vanithatest12309");
        driver.findElement(By.name("Passwd")).sendKeys("Vivan@1989");
        driver.findElement(By.name("ConfirmPasswd")).sendKeys("Vivan@1989");
        driver.findElement(By.id("accountDetailsNext")).click();
	}

}
