package org.sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day13DynamicTables {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> table = driver.findElements(By.tagName("table"));
		System.out.println("Total Tables: "+table.size());
		
		System.out.println("---------------------------------");
		
		WebElement one = table.get(0);
		String text = one.getText();
		System.out.println(text);
		
		System.out.println("---------------------------------");
		
		WebElement another = driver.findElement(By.id("shopping"));
		String text1 = another.getText();
		System.out.println(text1);
		
		System.out.println("---------------------------------");
		
//		WebElement second = driver.findElement(By.id("second"));
//		second.click();
//		
//		WebElement third = driver.findElement(By.id("third"));
//		third.click();
//		
//		List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		
//		for(int i=0;i<check.size();i++) {
//			
//			WebElement box = check.get(i);
//			
//			if(box.isSelected()) {
//				
//				WebElement we = driver.findElement
//						(By.xpath("//table[@id='simpletable']//child::tbody//tr["+(i+1)+"]"));
//				
//				String text2 = we.getText();
//				System.out.println(text2);
//			}
//			
//		}
		
		System.out.println("---------------------------------");
		
		WebElement table2 = driver.findElement(By.id("simpletable"));
		
		List<WebElement> row = table2.findElements(By.tagName("tr"));
		
		for(int i=0;i<row.size();i++) {
			
			WebElement r = row.get(i);
			
			
			List<WebElement> datas = r.findElements(By.tagName("td"));
			
			for(int j=0;j<datas.size();j++) {
				
				WebElement data = datas.get(j);
				String d = data.getText();
				
				if(d.equals("Man")) {
					
					driver.findElement
(By.xpath("(//table[@id='simpletable']//child::tr//following-sibling::td//input[@type='checkbox'])["+i+"]")).click();
					
				}
				
				
			}
			
			
		}
		
		
		System.out.println("---------------------------------");
		
		String value="Ice cream";
		
		WebElement cal = driver.findElement
(By.xpath("//table[contains(@class,'mat-sort')]//child::tr//td[text()='"+value+"']//following-sibling::td[1]"));
		String text2 = cal.getText();
		System.out.println(text2);
		
	}

}
