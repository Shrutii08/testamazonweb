package com.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone 14 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.linkText("Apple iPhone 14 Pro (128 GB) - Deep Purple")).click();
		

		Set<String> s = driver.getWindowHandles();
		ArrayList arr = new ArrayList(s);
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		
		driver.switchTo().window((String)arr.get(1));
		WebElement buynow = driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		buynow.click();
		WebElement signin = driver.findElement(By.xpath("//input[@id='ap_email']"));
		signin.click();
		signin.sendKeys("shrutirawat10102@gmail.com");
		WebElement submit = driver.findElement(By.xpath("//input[@id='continue']"));
		submit.click();
		WebElement psswrd = driver.findElement(By.xpath("//input[@id='ap_password']"));
		psswrd.click();
		psswrd.sendKeys("Shruti123");
	
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.id("banner-image")).click();
		driver.findElement(By.id("a-autoid-1-announce")).click();
		driver.findElement(By.id("nav-logo-sprites")).click();
		
		
		
	}

}
