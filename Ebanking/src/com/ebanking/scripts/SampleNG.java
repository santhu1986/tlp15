package com.ebanking.scripts;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleNG
{
	
	@BeforeTest
	public void xyz()
	{
	Assert.assertEquals("selenium","selenium");	
	}
	@Test
	public void abc()
	{
		Assert.assertEquals("TestNG","TestNG");	
	}
	@AfterTest
	public void pqr()
	{
		Assert.assertEquals("Testing","Testing");
	}

}
