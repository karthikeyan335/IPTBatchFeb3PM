package org.sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day10CalanderHandling {
	
	public static void selectDate(WebDriver driver,String month,String year,String date) {
		
		while(true) {
			
		String text = driver.findElement
			(By.xpath("//div[contains(@class,'ui-datepicker-title')]")).getText();
		
		String[] sp = text.split(" ");
		String mon=sp[0];
		String years=sp[1];
		
			if(mon.equalsIgnoreCase(month) && years.equalsIgnoreCase(year)) {
				break;
			} else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		
		}
		
		List<WebElement> datas = driver.findElements
		(By.xpath("//table[@class='ui-datepicker-calendar']//child::tbody/tr/td/a"));
		
		for(WebElement x:datas) {
			if(x.getText().equalsIgnoreCase(date)) {
				x.click();
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("datepicker1")).click();
		
		selectDate(driver, "March", "2025", "16");
		
	}

}
