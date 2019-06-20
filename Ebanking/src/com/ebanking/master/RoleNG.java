package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RoleNG extends BaseNG
{
	@Test(dataProvider="Rdata")
	public void Rol(String Rn,String Rd,String Rt)
	{
		Lb.RoleCre(Rn,Rd,Rt);
	}
	
	@DataProvider
	
	public Object [][] Rdata()
	{
		Object[][] Obj=new Object [4][3];
		
		Obj[0][0]="clerkab01";
		Obj[0][1]="clerkab";
		Obj[0][2]="E";
          
		Obj[1][0]="clerkab02";
		Obj[1][1]="clerkab";
		Obj[1][2]="E";

		Obj[2][0]="clerkab03";
		Obj[2][1]="clerkab";
		Obj[2][2]="E";

		Obj[3][0]="clerkab04";
		Obj[3][1]="clerkab";
		Obj[3][2]="E";

		return Obj;
				
		
	}
	
}
