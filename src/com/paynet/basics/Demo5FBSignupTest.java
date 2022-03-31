package com.paynet.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5FBSignupTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.partialLinkText("New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Balaji");
		
		driver.findElement(By.name("reg_email__")).sendKeys("78999");
		
		Select selectday=new Select(driver.findElement(By.id("day")));
		selectday.selectByVisibleText("12");
		
		Select selectMon=new Select(driver.findElement(By.id("month")));
		selectMon.selectByVisibleText("Apr");
//		selectMon.selectByValue("4");
		
		Select selectYear=new Select(driver.findElement(By.name("birthday_year")));
		selectYear.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		driver.findElement(By.name("websubmit")).click();
		//button[text()='Sign Up']

	}

}
