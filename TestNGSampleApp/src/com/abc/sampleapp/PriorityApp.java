package com.abc.sampleapp;

import org.testng.annotations.Test;

public class PriorityApp {
	
	@Test(priority=25)
	public void a_method()
	{
		System.out.println("Inside a_method()");
	}
	
	@Test(priority=30)
	public void b_method()
	{
		System.out.println("Inside b_method()");
	}
	
	@Test
	public void c_method()
	{
		System.out.println("Inside c_method()");
	}
	
	@Test
	public void d_method()
	{
		System.out.println("Inside d_method()");
	}
	
	@Test(priority=45)
	public void e_method()
	{
		System.out.println("Inside e_method()");
	}
}
