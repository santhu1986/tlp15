package com.ebanking.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample 
{
	WebDriver driver;
	@BeforeMethod
   public void launch()
   {
	   driver=new FirefoxDriver();
	   driver.manage().window().maximize();
   }
   @Test(priority=2)
   public void google()
   {
	   driver.get("http://www.google.com");
   }
   @Test(priority=1)
   public void yahoo()
   {
	   Sleeper.sleepTightInSeconds(4);
	   driver.get("http://www.yahoo.com");
   }
   @AfterMethod
   public void Aclose()
   {
	   driver.close();
   }

}
