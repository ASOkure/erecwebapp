package uk.ac.glasgowerec.uniqueid;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;

public class UniqueIDGenerator{
	


	    public static void main(String args[]) throws InterruptedException {
	     
	    	
	    	
	    	
	    	for (int i = 0; i < 50; i++) {
	            Date dNow = new Date();
	            SimpleDateFormat ft = new SimpleDateFormat("yy-MM-dd");
	            String datetime = ft.format(dNow);
	            System.out.println(datetime);
	    }
	    }
	}


