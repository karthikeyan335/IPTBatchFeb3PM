package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5CssSelectorss {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		// tagname[attributename=attributevalue]
		WebElement one = driver.findElement(By.cssSelector("input[id=email]"));
		
		// tagname#idAttributeValue   id----->#
		WebElement two = driver.findElement(By.cssSelector("input#email"));
		
		// tagname[attributename=attributevalue]
		List<WebElement> three = driver.findElements(By.cssSelector("div[class=_6lux]"));
		
		// tagname.classAttributevalue   class----->.
		List<WebElement> four = driver.findElements(By.cssSelector("div._6lux"));
		
		// *[attributename=attributevalue]
		WebElement five = driver.findElement(By.cssSelector("*[id=email]"));
		
		// tagname[attributename^=prefix]
		WebElement six = driver.findElement(By.cssSelector("input[id^=em]"));
		
		// tagname[attributename$=suffix]
		WebElement seven = driver.findElement(By.cssSelector("input[id$=ail]"));
		
		// tagname[attributename*=substring]
		WebElement eight = driver.findElement(By.cssSelector("input[id*=mai]"));
		
		// parent to child
		WebElement nine = driver.findElement(By.cssSelector("div[class=_6lux] > input"));
		
		// nth-of-type
		WebElement ten = driver.findElement(By.cssSelector("select#day > option:nth-of-type(5)"));
		
		// first-of-type
		WebElement eleven = driver.findElement(By.cssSelector("select#day > option:first-of-type"));
		
		// last-of-type
		WebElement tweleve = driver.findElement(By.cssSelector("select#day > option:last-of-type"));
		
		// tag with multiple attributes
		WebElement th = driver.findElement(By.cssSelector("select[id=day][title=Day][name=birthday_day]"));
		
		// tagname
		List<WebElement> tag = driver.findElements(By.tagName("input"));
		
		// link text
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		link.click();
		
		// partial link text
		WebElement par = driver.findElement(By.partialLinkText("Create a"));
		par.click();
		
	}

}
