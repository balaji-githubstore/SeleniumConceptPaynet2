package com.paynet.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//mouse hover activity 
public class Demo8Actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("file:///D:/Html/Demo6.html");
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//button[text()='Mouse Hover']"))).perform();

		driver.findElement(By.xpath("//a[text()='Reload']")).click();

	}

}



