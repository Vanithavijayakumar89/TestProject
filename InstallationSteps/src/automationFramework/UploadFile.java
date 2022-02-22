package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Vanitha/Essentials/Browser Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open Webpage
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement Element = driver.findElement(By.id("uploadfile_0"));
		Element.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
		WebElement CheckBox=driver.findElement(By.id("terms"));
		CheckBox.click();
		WebElement Submit=driver.findElement(By.id("submitbutton"));
		Submit.click();
	}

}
