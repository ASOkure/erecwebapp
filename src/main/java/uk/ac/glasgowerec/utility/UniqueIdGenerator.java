package uk.ac.glasgowerec.utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;

public class UniqueIdGenerator {
	
	 public static String getCurrentDateTimeMS() {
	        Date dNow = new Date();
	        SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmssMs");
	        String datetime = ft.format(dNow);
	        return datetime;
	    }

	    public static void main(String args[]) throws InterruptedException {
	        for (int i = 0; i < 20; i++) {
	            DateTime orderid = DateTime.now();
	            		
	            		getCurrentDateTimeMS();
	            System.out.println(orderid);
	        }
	    }
	}


