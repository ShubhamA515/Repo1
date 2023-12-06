package in1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

public class Current_date_and_time 
{
	   public static void main(String[] args) {
	        // Get the current date and time
	        //LocalDateTime currentDateTime = LocalDateTime.now();

	        // Define a format for displaying the date and time
	       	 //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	        // Format the current date and time using the specified format
	        //String sdsd = 
		   //currentDateTime.format(formatter);
	       	 //String formattedDateTime = 
	        		//currentDateTime.format(formatter);

	        // Print the formatted date and time
	        //System.out.println("Current Date and Time: " + sdsd);
	        
		   	LocalDateTime cdt = LocalDateTime.now();
//	        
	   	DateTimeFormatter formatdatetime = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");

	   	String sdsds = cdt.format(formatdatetime);
	  
	   	System.out.println(sdsds);
	   	//System.out.println(cdt);
	   	//	      
		   //	currentDate
		   	// Current_date_and_time.format(formatdatetime);
		   	// System.out.println(formatdatetime);
		   	// System.out.println(cdt);
	    }
}
