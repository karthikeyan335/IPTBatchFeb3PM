package org.sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.test.LoginPage;
import org.utility.BaseClass;

public class Day9DataReader extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		
		FileInputStream fs=new FileInputStream
		(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		
		prop.load(fs);
		
		Object user = prop.get("username");
		System.out.println(user);
		
		String st = user.toString();
		System.out.println(st);
		
		String pass = (String) prop.get("password");
		System.out.println(pass);
		
		String username = prop.getProperty("username");
		System.out.println(username);
		
		launchBrowser(prop.getProperty("browser"));
		urlLaunch(prop.getProperty("url"));
		maximize();
		implicitWait(10);
		
		LoginPage l=new LoginPage();
		
		sendkeys(l.getUsername(), prop.getProperty("username"));
		sendkeys(l.getPassword(), prop.getProperty("password"));
		click(l.getLoginBtn());
		
		
	}

}
