package com.orangeHRM.generics;

import java.io.FileInputStream;
import java.util.Properties;

public class FileLib {
	
	public String getValues(String key)
	{
		try {
		FileInputStream fin= new FileInputStream(".//src/test/resources/resourcedata.properties");
		Properties p= new Properties();
		p.load(fin);
		String value= p.getProperty(key);
		return value;
		}
		catch(Exception e)
		{
			System.out.println("error");
		}
		return  " ";
	}

}
