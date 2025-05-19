package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3XpathOne {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//tagname[@attribute name='attribute value']
		WebElement one = driver.findElement(By.xpath("//input[@id='email']"));
		
		//tagname[text()='text value']
		WebElement two = driver.findElement(By.xpath("//a[text()='Create new account']"));
		
		//tagname[contains(text(),'par text value')]
		WebElement three = driver.findElement(By.xpath("//a[contains(text(),'Create n')]"));
		
		//tagname[contains(@att name,'par att value')]
		WebElement four = driver.findElement(By.xpath("//input[contains(@type,'pas')]"));
		
		// (//tagname[@attribute name='attribute value'])[index]
		WebElement five = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		//tagname[starts-with(@attribute name,'attribute value')]
		WebElement six = driver.findElement(By.xpath("//input[starts-with(@id,'em')]"));
		
		//tagname[@att name='att value' and @att name='att value']
		WebElement seven = driver.findElement(By.xpath("//input[@id='email'  and @name='email']"));

		//tagname[@att name='att value' or @att name='att value']
		WebElement eight = driver.findElement(By.xpath("//input[@id='pass'  or @name='karthi']"));
		
		//*[@att name='att value']
		WebElement nine = driver.findElement(By.xpath("//*[@id='email']"));
		
		//*[@att name='att value'][@att name='att value'][@att name='att value']
		WebElement ten = driver.findElement(By.xpath("//*[@name='birthday_day'][@id='day'][@title='Day']"));
		
		
	}

}
