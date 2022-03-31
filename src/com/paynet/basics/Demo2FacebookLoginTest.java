package com.paynet.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FacebookLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");//wait for page load to complete 
		
//		Thread.sleep(10000); //wait for 10s
		
		driver.findElement(By.id("email")).sendKeys("john@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("john123");
		
		
		
//		By loc= By.name("login");
//		WebElement ele= driver.findElement(loc);
//		ele.click();
		
		driver.findElement(By.name("login")).click();
	}

}
