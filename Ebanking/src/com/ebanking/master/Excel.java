package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException 
	{
	   Library Lb=new Library();
	   
	   Lb.OpenApp("http://192.168.1.4/ranford2");
		Lb.AdminLgn("Admin","Admin");
	
		//to get Test data File
		
		FileInputStream fis=new FileInputStream("E:\\mrngbatchAug\\Ebanking\\src\\com\\ebanking\\testdata\\Role.xlsx");
	
		//WorkBook
		
		XSSFWorkbook Wb=new XSSFWorkbook(fis);
		
		//Sheet
		
		XSSFSheet Ws=Wb.getSheet("Rdata");
		
		//Row Count
		
		int Rcount=Ws.getLastRowNum();
	     System.out.println(Rcount);
	     
	     //multiple Iteraations  -------------For Loop
	     
	     for (int i=1;i<=Rcount;i++) 
	     {
	    	 //Row
	    	 
	    	 XSSFRow Wr=Ws.getRow(i);
	    	 
	    	 //Cell
	    	 
	    	 XSSFCell Wc=Wr.getCell(0);
	    	 XSSFCell Wc1=Wr.getCell(1);
	    	 XSSFCell Wc2=Wr.getCell(2);
	    	 
	    	 XSSFCell Wc3=Wr.createCell(3);
	    	 
	    	 //Cell Values
	    	 
	    	 String Rname=Wc.getStringCellValue();
              String Rdes=Wc1.getStringCellValue();	    	 
	    	 String Rtyp=Wc2.getStringCellValue();
	    	 
	    	String Res=Lb.RoleCre(Rname,Rdes,Rtyp);
	    	System.out.println(Res);
	    	
	    	Wc3.setCellValue(Res);
	    	 
	    	 }
	     
	     FileOutputStream Fos=new FileOutputStream("E:\\mrngbatchAug\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.xlsx");
	     Wb.write(Fos);
	     Wb.close();
		
	}
	

}
