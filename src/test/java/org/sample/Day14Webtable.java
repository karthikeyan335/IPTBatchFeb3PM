package org.sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day14Webtable {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		1.Find the number of table available in webpage.
//		List<WebElement> table = driver.findElements(By.tagName("table"));
//		System.out.println("Total Tables: "+table.size());
		
//		2.Find the number of row available in that table.
//		WebElement table = driver.findElement(By.id("customers"));
//		List<WebElement> row = table.findElements(By.tagName("tr"));
//		System.out.println("Total Rows: "+row.size());
		
//		3.Find out particular value is present or not.
//		WebElement table = driver.findElement(By.id("customers"));
//		List<WebElement> row = table.findElements(By.tagName("tr"));
//		for(int i=0;i<row.size();i++) {
//			WebElement w = row.get(i);
//			List<WebElement> data = w.findElements(By.tagName("td"));
//			
//			for(int j=0;j<data.size();j++) {
//				WebElement w1 = data.get(j);
//				String text = w1.getText();
//				
//				if(text.equals("Canada")) {
//					System.out.println(text);
//					System.out.println("Present");
//				}
//				
//			}
//				
//		}
		
//		4.Find out particular value is present or not. 
//		If there print the row number and column number.
//		WebElement table = driver.findElement(By.id("customers"));
//		List<WebElement> row = table.findElements(By.tagName("tr"));
//		for(int i=0;i<row.size();i++) {
//			WebElement w = row.get(i);
//			List<WebElement> data = w.findElements(By.tagName("td"));
//			
//			for(int j=0;j<data.size();j++) {
//				WebElement w1 = data.get(j);
//				String text = w1.getText();
//				
//				if(text.equals("Canada")) {
//					System.out.println(text);
//					System.out.println("Present");
//					System.out.println("Row Number: "+(i+1));
//					System.out.println("Column Number: "+(j+1));
//				}
//				
//			}
//				
//		}
		
//		5.Read only heading from the table.
//		WebElement table = driver.findElement(By.id("customers"));
//		List<WebElement> row = table.findElements(By.tagName("tr"));
//		for(int i=0;i<row.size();i++) {
//			
//			WebElement w = row.get(i);
//			List<WebElement> head = w.findElements(By.tagName("th"));
//			
//			for(int j=0;j<head.size();j++) {
//				
//				WebElement w1 = head.get(j);
//				String text = w1.getText();
//				System.out.println(text);
//				
//			}
//			
//		}
		
//		6.Print Last row of dynamically changing table.
//		WebElement table = driver.findElement(By.id("customers"));
//		List<WebElement> row = table.findElements(By.tagName("tr"));
//		WebElement we = row.get(row.size()-1);
//		String text = we.getText();
//		System.out.println(text);
		
//		7.Read all the values available in second table.
//		List<WebElement> tables = driver.findElements(By.tagName("table"));
//		WebElement table = tables.get(1);
//		String text = table.getText();
//		System.out.println(text);
		
//		8.Print Last row datas of dynamically changing table.
//		WebElement table = driver.findElement(By.id("customers"));
//		List<WebElement> row = table.findElements(By.tagName("tr"));
//		WebElement we = row.get(row.size()-1);
//		List<WebElement> datas = we.findElements(By.tagName("td"));
//		for(int i=0;i<datas.size();i++) {
//			
//			WebElement data = datas.get(i);
//			System.out.println(data.getText());
//		}
		
//		9.Get only odd and even row from given table.
//		WebElement table = driver.findElement(By.id("customers"));
//		List<WebElement> row = table.findElements(By.tagName("tr"));
//		for(int i=0;i<row.size();i++) {
//			
//			WebElement w = row.get(i);
//			
//			if(i%2==0) {
//				System.out.println("Odd Row: "+w.getText());
//			}
//			else {
//				System.out.println("Even Row: "+w.getText());
//			}
//		
//		}
//		
//		System.out.println("------------------------");
//		// oddRow
//		for(int i=0;i<row.size();i++) {	
//			if(i%2==0) {
//				WebElement we = row.get(i);
//				String text = we.getText();
//				System.out.println(text);
//			}
//		}
//		
//		System.out.println("------------------------");
//		// evenRow
//		for(int i=0;i<row.size();i++) {	
//			if(i%2==1) {  // if(i%2!=0)
//				WebElement we = row.get(i);
//				String text = we.getText();
//				System.out.println(text);
//			}
//		}
		
//		10.Print the middle row and middle column data.
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		
		int s=row.size()/2;
		
		WebElement mid = row.get(s);
		System.out.println(mid.getText());
		
		List<WebElement> midData = mid.findElements(By.tagName("td"));
		
		int c=midData.size()/2;
		
		WebElement data = midData.get(c);
		System.out.println(data.getText());
		
	}

}
