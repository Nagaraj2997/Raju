package org.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagaraju\\eclipse-workspace\\Amazon\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.snapdeal.com/");
	
	WebElement clicksignin = driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']"));
	clicksignin.click();
	
	WebElement clicksignin1 = driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']"));
	clicksignin1.click();
	
	
	WebElement txtusername = driver.findElement(By.xpath("//input[@class='col-xs-24 clickOnceOnly']"));
	txtusername.sendKeys("98765432");
	Thread.sleep(3000);
	
	WebElement clicksignin2 = driver.findElement(By.xpath("//button[@class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30']"));
	clicksignin2.click();
	
	
	
	
	
	
	
	
}
}
