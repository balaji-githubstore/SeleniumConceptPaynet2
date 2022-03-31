package com.paynet.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("D:\\Html\\Demo6.html");

		// click on alert
		driver.findElement(By.id("confirmbtn")).click();

		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		driver.switchTo().alert().accept();

	}

}
