package uk.ac.glasgowerec.uniqueid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;

public class UniqueId {

public static void main ( String[]args) {
	
	
	// String today = DateTime.Today.ToString("ddMMyyyy");
	

	
	
	 Date dNow = new Date();
     SimpleDateFormat ft = new SimpleDateFormat("yy-MM");
     String today = ft.format(dNow);
	
	
     for (int i = 1; i < 50; i++) {
    	 
   
	String ss = String.format("ERN-46-") + "" +  today + "-" +   String.format("%03d", i );
	
	System.out.println(ss);
	
	
	}
	
	}
 }



