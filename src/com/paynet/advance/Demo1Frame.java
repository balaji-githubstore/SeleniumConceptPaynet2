package com.paynet.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1Frame {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("D:\\Html\\Demo1.html");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("john");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("john123");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'Demo2')]")));
		//click on google
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		
		driver.switchTo().defaultContent(); //switch to main html
		
	}

}




