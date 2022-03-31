package com.paynet.advance;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3MultipleTab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("D:\\Html\\Demo6.html");

		//click on Open tab
		driver.findElement(By.id("opentab")).click();
		
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		
//		System.out.println(windows.get(0));
//		System.out.println(windows.get(1));
		
		driver.switchTo().window(windows.get(1));  //switch to second tab
		
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("bala");
		
		
	}

}


