package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad {

	public static void main(String[] args) throws IOException 
	{
	   Library Lb=new Library();
	   
	   Lb.OpenApp("http://192.168.1.4/ranford2");
	   Lb.AdminLgn("Admin","Admin");
	   
	   //To get Test Data File Path
	   
	   String Fpath="E:\\mrngbatchAug\\Ebanking\\src\\com\\ebanking\\testdata\\Role.txt";
	   
	   //Results File path
	   
	   String Rpath="E:\\mrngbatchAug\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.txt";
	   String Sd;
	   //To get Test Data File
	   
	   FileReader Fr=new FileReader(Fpath);
	   BufferedReader Br=new BufferedReader(Fr);
	   String Sread=Br.readLine();
	   System.out.println(Sread);
	   
	   
	   //Write
	   
	   FileWriter Fw=new FileWriter(Rpath);
	   BufferedWriter Bw=new BufferedWriter(Fw);
	   Bw.write(Sread);
	   Bw.newLine();
	   
	   //Multiple Iterations----While loop
	   
	   while((Sd=Br.readLine())!=null) 
	   {
		   System.out.println(Sd);
		   
		   //Split
		   
		   String Sr[]=Sd.split("###");
		   
		   String Rn=Sr[0];
		   String Rd=Sr[1];
		   String Rt=Sr[2];
		   
		   
		   String Res=Lb.RoleCre(Rn,Rd,Rt);
		   System.out.println(Res);
		   
		   
		   //Results
		   
		   Bw.write(Rn+"%%%"+Rd+"$$$$"+Rt+"@@@"+Res);
		   Bw.newLine();
		
	   }
	   Bw.close();
	   Br.close();
	   
	}

}
