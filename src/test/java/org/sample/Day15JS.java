package org.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day15JS {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		WebElement css = driver.findElement
//				(By.xpath("(//h5[text()='Daily Opening'])[1]"));
//		String att = css.getAttribute("style");
//		System.out.println(att);
//		
//		System.out.println(css.getCssValue("font-weight"));
//		System.out.println(css.getCssValue("color"));
//		System.out.println(css.getCssValue("font-size"));
//		System.out.println(css.getCssValue("background-color"));
//		System.out.println(css.getCssValue("text-align"));
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		Object url = js.executeScript("return document.URL");
		System.out.println(url);
		
		Object title = js.executeScript("return document.title");
		System.out.println(title);
		
		WebElement user = driver.findElement(By.id("email"));
		
//		js.executeScript("arguments[0].style.border='2px solid red'", user);
		
//		js.executeScript("arguments[0].style.background='yellow'", user);
		
		
		js.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:yellow')", user);
		
	}

}
