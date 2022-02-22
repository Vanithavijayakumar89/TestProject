package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DellOnlinePage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Vanitha/Essentials/Browser Drivers/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Actions act=new Actions(driver);
		
		driver.get("https://www.dell.com/en-in");//hitting the url
		driver.manage().window().maximize();//maximize the browser
		
		int ifrmeCount=driver.findElements(By.tagName("iframe")).size();
		System.out.println(ifrmeCount); 
		//Cookie Consent
		
        //driver.switchTo().frame("destination_publishing_iframe_dell_0_name");
		//WebElement banner=driver.findElement(By.id("_evidon_banner"));//banner name--- ElementClickInterceptedException
	    //act.moveToElement(banner).build().perform();
				//driver.findElement(By.xpath("//span[@id='_evidon-button-text']")).click();
			  // driver.findElement(By.xpath("//button[contains(text(),'Manage your cookies')]")).click();//Manage your cookies
			    //driver.switchTo().frame("_evidon-l3");
			   // driver.findElement(By.xpath("//button(contains(text(),'Close  X'))")).click();
				
	    //iframe--//iframe[@name='iframe']
	  //iframe[@id='destination_publishing_iframe_dell_0']
		//driver.findElement(By.xpath("//button[contains(text(),'Accept all')]"));// Cookie Consent Accept all	
		
		driver.findElement(By.xpath("//span[@class='mh-si-label']")).click();
		driver.findElement(By.xpath("//a[@class='mh-btn mh-btn-primary mh-si-cold-state mh-sign-in-btn']")).click();
		
		
		
				
				Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='EmailAddress']")).sendKeys("vanitharavi89@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Viva@1989");
		WebElement loginBtn=driver.findElement(By.id("sign-in-button"));
		loginBtn.click();
		
		Thread.sleep(2000);
		
		
		
		WebElement Products=driver.findElement(By.xpath("//button[contains(text(),'Products')]"));
		act.moveToElement(Products).build().perform();
		
		
		Thread.sleep(4000);
		WebElement desktop=driver.findElement(By.xpath("//span[contains(text(),'Desktops & All-in-Ones')]"));
		act.moveToElement(desktop).build().perform();
		
	/*	WebElement desktopHome=driver.findElement(By.xpath("//span[contians(text(),' View all Desktops & All-in-One PCs for Home']"));   
	    desktopHome.click();*/
		
		Thread.sleep(2000);
		WebElement Inspiron=driver.findElement(By.xpath("(//a[contains(text(),'Inspiron: For Home and Home Office')])[2]"));
		Inspiron.click();
		
		
		Thread.sleep(2000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(20,500)");
		
		//New Small Desktop (3471)	
		WebElement nsd=driver.findElement(By.xpath("//a[contains(text(),'New Small Desktop (3471)')]"));
		nsd.click();
		driver.findElement(By.xpath("(//a[contains(text(),'New Inspiron 3471 Small Desktop')])[2]")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'Add to Cart')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Proceed')])[1]")).click();
		
		//Cart
		driver.findElement(By.xpath("(//button[text()='Checkout'])[3]")).click(); //Checkout Button
		
		//Shipping name and address
		driver.findElement(By.id("DataModel-ShippingContact-FirstName")).sendKeys("Vivantha");
		driver.findElement(By.id("DataModel-ShippingContact-LastName")).sendKeys("V");
		driver.findElement(By.id("DataModel-ShippingContact-PostalCode")).sendKeys("600035");
		driver.findElement(By.id("DataModel-ShippingContact-Line1")).sendKeys("TreeSet Avenue, Guindy");
		driver.findElement(By.id("DataModel-ShippingContact-City")).sendKeys("Chennai");
		
		
		//drop-down menu
		driver.findElement(By.id("DataModel-ShippingContact-State")).click();
		new Select(driver.findElement(By.id("DataModel-ShippingContact-State"))).selectByVisibleText("TAMIL NADU");
		driver.findElement(By.id("DataModel-ShippingContact-State")).click();
		
		driver.findElement(By.id("DataModel-ShippingContact-Phone-PhoneNumber")).sendKeys("6388654090");
		//Radio button
		WebElement sameasShipping=driver.findElement(By.name("SameAsShipToAddress"));
		sameasShipping.click();
		
		//drop-down menu
		driver.findElement(By.id("DataModel-BillOfEntryDataModel-BillOfEntryIdCategory")).click();
		new Select(driver.findElement(By.id("DataModel-BillOfEntryDataModel-BillOfEntryIdCategory"))).selectByVisibleText("Aadhaar");
		driver.findElement(By.id("DataModel-BillOfEntryDataModel-BillOfEntryIdCategory")).click();
		
		driver.findElement(By.id("DataModel-BillOfEntryDataModel-BillOfEntryIdNumber")).sendKeys("435543562344");
		
		//Agree T&C
		//Checkbox
		WebElement tc=driver.findElement(By.id("DataModel-AgreeTermsAndConditions"));
		tc.click();
		
		//Continue button
		driver.findElement(By.xpath("(//button[contains(text(),'Continue')])[3]")).click();
		
		
		//Iframes
		//iframe[@name='ftiframe']
		//iframe[@id='iPerceptionsFrame']
		//iframe[@id='iPerceptionsFrame']
		//iframe[@id='mm_sync_back_ground']
		
		//a[@id='_evh-link']
		
		
		//Payment Details
		driver.findElement(By.xpath("(//a[@class='stp-tabbed-payment-item-trigger ng-scope selectedTab'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='DataModel-CardNumber']")).click();
		
		//Drop-down menu
		driver.findElement(By.xpath("//select[@id='DataModel-ExpirationMonth']")).click();
		new Select(driver.findElement(By.xpath("//select[@id='DataModel-ExpirationMonth']"))).selectByVisibleText("12");
		driver.findElement(By.xpath("//select[@id='DataModel-ExpirationMonth']")).click();
		
		//drop-down menu
		driver.findElement(By.xpath("//select[@id='DataModel-ExpirationYear']")).click();
		new Select(driver.findElement(By.xpath("//select[@id='DataModel-ExpirationYear']"))).selectByVisibleText("2025");
		driver.findElement(By.xpath("//select[@id='DataModel-ExpirationYear']")).click();
		
		driver.findElement(By.xpath("//input[@id='DataModel-NameAsOnCard']")).sendKeys("Visa Debit Card");
		
		driver.findElement(By.xpath("//input[@id='DataModel-CardIdentificationNumber']")).sendKeys("456");
		
		//Checkbox
		WebElement saveCard=driver.findElement(By.xpath("(//input[@class='top-offset-0 ng-valid ng-dirty'])[1]"));//Save the card details
		saveCard.click();
		//Checkbox
		WebElement defaultCard=driver.findElement(By.xpath("(//input[@class='top-offset-0 ng-valid ng-dirty'])[2]"));//Set the saved card as default card
		defaultCard.click();
		
		driver.findElement(By.xpath("(//button[@class='btn btn-success btn-block continueButton ng-binding dellmetrics-payment-cc'])[2]")).click();
		
		//Payment Verification
		//switching to Iframe
		driver.switchTo().frame("Cardinal-CCA-IFrame");  //iframe[@id='Cardinal-CCA-IFrame']
		driver.findElement(By.xpath("//input[@id='OTP']")).sendKeys("");//enter the OTP
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("IDCT_BUTID")).click();//Submit button
		
		//Verify and Submit
		
		
		//Order Submitted
		

		
		
		
		
		
		

		
		
		
		

	}

}
