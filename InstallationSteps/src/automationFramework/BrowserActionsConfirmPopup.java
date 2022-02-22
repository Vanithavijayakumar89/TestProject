package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActionsConfirmPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Driver Invoke
				System.setProperty("webdriver.chrome.driver", "C:/Vanitha/Essentials/Browser Drivers/chromedriver_win32/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//Open Webpage
				driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
				
				Thread.sleep(5000);
				
				//Pop Handling
				Alert alert = driver.switchTo().alert();
				String popupDetails = alert.getText();
				System.out.println(popupDetails);
				alert.dismiss();

			}


}
