package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Driver Invoke
		System.setProperty("webdriver.chrome.driver", "C:/Vanitha/Essentials/Browser Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Webpage
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement element1=driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		
        WebElement element2=driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));
        Actions act=new Actions(driver);
        act.dragAndDrop(element1, element2).build().perform();//build() method will wait and perform the action
	}

}
