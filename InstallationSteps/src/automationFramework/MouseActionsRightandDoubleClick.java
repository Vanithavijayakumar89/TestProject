package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsRightandDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Vanitha/Essentials/Browser Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Webpage
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement RightClick= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act=new Actions(driver);
		act.contextClick(RightClick).build().perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'Copy')]")).click();
		
		//Handling alert popup
		Alert alert = driver.switchTo().alert();
		String popupDetails = alert.getText();
		System.out.println(popupDetails);
		Thread.sleep(2000);
		alert.accept();
		
		WebElement DoubleClick=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		act.doubleClick(DoubleClick).build().perform();
		driver.switchTo().alert();
		String popupDetails1 = alert.getText();
		System.out.println(popupDetails1);
		Thread.sleep(2000);
		alert.accept();
		
		
	}

}
