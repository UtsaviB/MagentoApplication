package com.abc.sampleapp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleApp {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Connecting to db");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Closing the browser\n");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Automating magento app");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Automating fb app");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Opening the browser\n");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Closing db");
	}
}
