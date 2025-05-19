package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4XpathTwo {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// parent
		WebElement one = driver.findElement(By.xpath("//input[@id='email']//parent::div"));
		
		// child
		WebElement two = driver.findElement(By.xpath("(//div[@class='_6lux']//child::input)[1]"));
		
		// ancestor
		List<WebElement> three = driver.findElements(By.xpath("//div[@class='_6lux']//ancestor::div"));
		
		// descendant
		List<WebElement> four = driver.findElements(By.xpath("//div[@class='_6lux']//descendant::div"));
		
		// preceding
		List<WebElement> five = driver.findElements(By.xpath("//select[@id='month']//preceding::option"));
		
		// preceding-sibling
		List<WebElement> six = driver.findElements(By.xpath("//option[text()='Jul']//preceding-sibling::option"));
		
		// following
		List<WebElement> seven = driver.findElements(By.xpath("//select[@id='month']//following::option"));
		
		// following-sibling
		List<WebElement> eight = driver.findElements(By.xpath("//option[text()='Jul']//following-sibling::option"));
		
		
		String name="Albania";
		WebElement currency = driver.findElement
				(By.xpath("//strong[text()='"+name+"']//parent::td//following-sibling::td[2]"));
		
		
	}

}
