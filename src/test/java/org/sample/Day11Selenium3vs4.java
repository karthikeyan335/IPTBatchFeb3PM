package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day11Selenium3vs4 {
	
	public static void main(String[] args) throws AWTException {
		
		// 1. selenium 3 --- JSON wire protocol 
		
		// 2. browser launch
		
//		System.setProperty("", "");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("");
		
		// 3. maximize
		driver.manage().window().maximize();
		
		// 4. waits
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// 5. new tab --- robot class
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		
		driver.get("");
		
		// 1. selenium 4 ---- w3c protocol
		
		// 2. browser launch --- WebDriver driver=new ChromeDriver();
		
		// 3. minimize ---- driver.manage().window().minimize();
		
		// 4. waits ---- driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// 5. new tab 
		// driver.switchTo().newWindow(WindowType.TAB);
		// driver.switchTo().newWindow(WindowType.WINDOW);
		
		
	}

}
