package com.ebanking.master;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid 
{

	DesiredCapabilities Cap=null;
    @Parameters("browser")
	@Test
   public void Gd(String Br) throws MalformedURLException
   {
    	if (Br.equalsIgnoreCase("firefox"))
    	{
    		   Cap=new DesiredCapabilities();
    		   Cap.setBrowserName("firefox");
    		   Cap.setPlatform(Platform.WINDOWS);
    		   	
		}
    	else if (Br.equalsIgnoreCase("chrome"))
    	{
    		   Cap=new DesiredCapabilities();
    		   Cap.setBrowserName("chrome");
    		   Cap.setPlatform(Platform.ANY);
    		   	
		}
	   RemoteWebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.109:4444/wd/hub"),Cap);  
	   
       driver.manage().window().maximize();
       driver.get("http://192.168.1.4/ranford2");
 	  
 	  
 	  RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
 	  RHP.login();
 	  Sleeper.sleepTightInSeconds(5);
 	  AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
 	  AHP.Br();

   }
          
}
