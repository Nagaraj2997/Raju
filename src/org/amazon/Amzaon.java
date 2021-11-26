package org.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amzaon {
public static void main(String[] args) {
	
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagaraju\\eclipse-workspace\\Amazon\\driver\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.amazon.in/");

WebElement txtsearch = driver.findElement(By.xpath("//input[@dir='auto']"));
txtsearch.sendKeys("Iphone");

WebElement txtbtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
txtbtn.click();



}
}
