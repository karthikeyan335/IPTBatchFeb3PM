package org.sample;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day2WebElementMethods {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		WebElement user = driver.findElement(By.id(""));
		
		user.sendKeys("");
		
		user.click();
		
		user.clear();
		
		String text = user.getText();
		
		String attribute = user.getAttribute("value");
		
		String attribute2 = user.getAttribute("innerText");
		
		boolean displayed = user.isDisplayed();
		
		boolean enabled = user.isEnabled();
		
		boolean selected = user.isSelected();
		
		File screenshotAs = user.getScreenshotAs(OutputType.FILE);
		
		WebElement findElement = user.findElement(By.id(""));
		
		List<WebElement> findElements = user.findElements(By.id(""));
		
		String cssValue = user.getCssValue("");
		
		String tagName = user.getTagName();
		
		Point location = user.getLocation();
		
		int x = location.getX();
		int y = location.getY();
		
		user.submit();
		
	}

}
