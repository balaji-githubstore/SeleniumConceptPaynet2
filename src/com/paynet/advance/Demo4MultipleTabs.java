package com.paynet.advance;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4MultipleTabs {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("email-or-phone")).sendKeys("bala");
		driver.findElement(By.id("password")).sendKeys("bala");
		
		driver.findElement(By.id("join-form-submit")).click();
		
		driver.close(); //close the current tab
		
		driver.switchTo().window(windows.get(0)); //switch to 1st tab 
		
		System.out.println(driver.getCurrentUrl());
	}
}
