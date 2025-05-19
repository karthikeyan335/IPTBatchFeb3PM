package org.sample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day16Waitss {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(" ");
		driver.manage().window().maximize();
		
		
		// static wait
		Thread.sleep(5000);
		
		// dynamic wait
		// 1.Implicit wait
//		Options m = driver.manage();
//		Timeouts t = m.timeouts();
//		t.implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   // selenium 3
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   // selenium 4
		
		// 2.Explicit wait
		// 2a.WebDriverWait
		WebDriverWait w=new WebDriverWait(driver, 50);      // selenium 3
		
//		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(50));   // selenium 4
		
		w.until(ExpectedConditions.urlContains("privacy"));
		
//		Alert a = driver.switchTo().alert();
//		a.accept();
		
		Alert a = w.until(ExpectedConditions.alertIsPresent());
		a.accept();
		
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("frame1")));
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("85236");
		
		WebElement pass = w.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		pass.sendKeys("25365");
		
		WebElement login = w.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		login.click();
		
		// 2b.FluentWait
		FluentWait<WebDriver> f=new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(50))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(Throwable.class);
		
		f.until(ExpectedConditions.urlContains("privacy"));
		
		// pageloadtimeout
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
	}

}
