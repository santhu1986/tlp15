package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class RanfordHP 
{

	//Element Properties
	
	@FindBy (id="txtuId")
	WebElement Uname;
	
	@FindBy (id="txtPword")
	WebElement Pwd;
	
	@FindBy (xpath=".//*[@id='login']")
	WebElement lgn;
	
	//Element Methods
	
	public void login()
	{
		Uname.sendKeys("Admin");
		Pwd.sendKeys("Admin");
		Sleeper.sleepTightInSeconds(5);
		lgn.click();
	}


}
