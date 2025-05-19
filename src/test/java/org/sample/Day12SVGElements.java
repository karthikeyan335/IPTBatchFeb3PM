package org.sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day12SVGElements {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.numbeo.com/quality-of-life/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement quality = driver.findElement
		(By.xpath("(//*[name()='svg' and @aria-label]/*[name()='g'])[1]"));
		String text = quality.getText();
		System.out.println(text);
		
		List<WebElement> rect = driver.findElements(By.xpath
		("((//*[name()='svg' and @aria-label]/*[name()='g'])[2]"
				+ "/*[name()='g' and @clip-path]/*[name()='g'])[2]/*[name()='rect']"));
		
		for(int i=0;i<rect.size();i++) {
			
			WebElement w = rect.get(i);
			
			Actions a=new Actions(driver);
			a.moveToElement(w).perform();
			
			WebElement value = driver.findElement(By.xpath
		("(//*[name()='svg' and @aria-label]/*[name()='g'])[3]/*[name()='g' and @class]"));
			String text2 = value.getText();
			System.out.println(text2);
			
			System.out.println("----------------------");
		}

	}

}
