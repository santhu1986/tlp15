package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHP 
{
    //Element Properties
	
	@FindBy (xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")
	WebElement branch;
	
	@FindBy (xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")
	WebElement role;
	
	@FindBy (xpath=".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")
	WebElement employee;
	
	@FindBy (xpath=".//*[@id='Table_02']/tbody/tr/td[3]/a/img")
	WebElement logout;
	
	//Element Methods
	
	public void Br()
	{
		branch.click();
	}
	
	public void Rol()
	{
		role.click();
	}
	
	public void Emp()
	{
		employee.click();
	}
	public void Lout()
	{
		logout.click();
	}
}
