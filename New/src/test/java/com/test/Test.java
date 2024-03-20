package com.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Test {
	public static AndroidDriver driver;
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		
		DesiredCapabilities capabilites=new DesiredCapabilities();
			capabilites.setCapability("platformName", "Android");
			capabilites.setCapability("platformVersion", "12");
			capabilites.setCapability("udid", "ZD22275F65");
			capabilites.setCapability("deviceName", "motog22");
			
			capabilites.setCapability("appPackage", "com.google.android.calculator");
			capabilites.setCapability("appActivity", "com.android.calculator2.Calculator");
			URL url=new URL("http://0.0.0.0:4723/wd/hub");
			 
			driver=new AndroidDriver(url,capabilites);
			System.out.println("done");
			WebElement eight=driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
			eight.click();
			String number=eight.getText();
			System.out.println(number);
			
		    driver.findElement(By.id("com.google.android.calculator:id/digit_3")).click();
		    
		    driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		    
		    driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
		    
		    driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		    
		    
		    driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
		    
		    driver.findElement(By.id("com.google.android.calculator:id/digit_3")).click();
		    
		    driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
		    Thread.sleep(3000);
		    
		   driver.quit();
		}


	}


