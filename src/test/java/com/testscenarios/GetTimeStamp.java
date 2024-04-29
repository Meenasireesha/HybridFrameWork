package com.testscenarios;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTimeStamp {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d); 
		//ddMMMyyyy_HHmmss
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss");
		//convert date to user designed format
		//System.out.println(df.format(d));
		String timestamp = df.format(d);
		System.out.println(timestamp);
		
		
		
		
	}

}
