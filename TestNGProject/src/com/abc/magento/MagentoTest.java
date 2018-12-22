package com.abc.magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MagentoTest {
	
	ChromeDriver driver;
	
	@BeforeMethod
	public void BeforeMethod()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void Test() throws Exception
	{
		String url="http://www.facebook.com";
		driver.get(url);
		
		driver.findElement(By.id("email")).sendKeys("utsavi443@gmail.com");
		Thread.sleep(5000);
		
		driver.findElement(By.id("pass")).sendKeys("uts9687@");
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		driver.quit();
	}
}
