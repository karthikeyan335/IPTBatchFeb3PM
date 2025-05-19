package org.sample;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day7Links {
	
	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		// active links
		for(int i=0;i<links.size();i++) {
			
			WebElement link = links.get(i);
			String u = link.getAttribute("href");
			System.out.println(u);
			
			URL url=new URL(u);
			URLConnection op = url.openConnection();			
			HttpsURLConnection code=(HttpsURLConnection) op;			
			int statusCode = code.getResponseCode();		
			System.out.println(statusCode);
			
		}
		
		System.out.println("-----------------------------");
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		
		// active image links
		for(int i=0;i<images.size();i++) {
			
			WebElement image = images.get(i);
			String u = image.getAttribute("src");
			System.out.println(u);
			
			URL url=new URL(u);
			URLConnection op = url.openConnection();
			HttpsURLConnection code=(HttpsURLConnection) op;
			int imageCode = code.getResponseCode();
			System.out.println(imageCode);
		}

	}

}
