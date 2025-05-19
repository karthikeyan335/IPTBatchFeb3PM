package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day6Chromeoptions {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions op=new ChromeOptions();
		
		op.addArguments("--start-maximized");
		
//		op.addArguments("--incognito");
		
//		op.addArguments("--headless");
		
//		op.addArguments("--disable-notifications");
		
//		op.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		WebDriver driver=new ChromeDriver(op);
		
		// https://username:password@www.website.com/
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		
//		driver.findElement(By.id("email")).sendKeys("ramesh");
//		
//		driver.findElement(By.id("pass")).sendKeys("23654");
//		
//		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
