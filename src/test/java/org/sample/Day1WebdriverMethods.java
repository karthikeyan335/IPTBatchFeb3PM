package org.sample;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1WebdriverMethods {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("");  // to launch url
		
		driver.close();   // to close current window
		
		driver.quit();    // to close the browser
		
		String title = driver.getTitle();  // to get title of application
		
		String currentUrl = driver.getCurrentUrl();   // to get the current url of application
		
		String windowHandle = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		Options m = driver.manage();
		Window w = m.window();
		w.maximize();
		
		Timeouts t = m.timeouts();
		Timeouts wait = t.implicitlyWait(10, TimeUnit.SECONDS);
		
		TargetLocator s = driver.switchTo();
		
		Alert a = s.alert();
		a.accept();
		
		WebDriver frame = s.frame(0);
		WebDriver parentFrame = s.parentFrame();
		WebDriver defaultContent = s.defaultContent();
		
		WebDriver window = s.window("");
		
		Navigation n = driver.navigate();
		n.to("");
		n.back();
		n.forward();
		n.refresh();
		
		WebElement findElement = driver.findElement(By.id(""));
		
		List<WebElement> findElements = driver.findElements(By.id(""));
		
	}

}
