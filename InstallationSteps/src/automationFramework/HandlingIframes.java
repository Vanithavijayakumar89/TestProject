package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframes {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:/Vanitha/Essentials/Browser Drivers/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//Open Webpage
	driver.get("https://nunzioweb.com/iframes-example.htm/");
	driver.manage().window().maximize();
	
	int ifrmeCount=driver.findElements(By.tagName("iframe")).size();
	System.out.println(ifrmeCount);
	driver.switchTo().frame("frame");
	String header=driver.findElement(By.xpath("//td[@class='headline']")).getText();
	System.out.println(header);
			
	}

}
