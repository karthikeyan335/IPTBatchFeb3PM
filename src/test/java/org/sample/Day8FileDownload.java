package org.sample;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day8FileDownload {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions op=new ChromeOptions();
		
		String loc="C:\\Users\\HP\\eclipse-workspace-oxygen\\IPTBtachFeb3Pm\\src\\test\\resources";
		
		Map<String,Object> mp=new HashMap<String, Object>();
		
		mp.put("profile.default_content_settings.popups", 0);
		mp.put("download.default_directory", loc);
		
		op.setExperimentalOption("prefs", mp);
		
		WebDriver driver=new ChromeDriver(op);
		
		driver.get("https://samplelib.com/sample-jpeg.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement download = driver.findElement
		(By.xpath("//a[@href='https://download.samplelib.com/jpeg/sample-clouds-400x300.jpg']"));
		download.click();
		
	}

}
