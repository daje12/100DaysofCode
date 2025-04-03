/*Day 17*/
/*Java has a date library which works with the date and time API.
Like other libraries it has classes that need importing.
Although I can import all of those classes in one line. Ima do it
seperately for learning purposes*/

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

//imports for using comparing dates
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.time.*;
import java.text.*;
import java.util.*;

public class Day17 {
	//you see that throws parse exception
	//its very necessary
	//you should probably find out why thats there
	public static void main(String [] args) throws ParseException{
		//create a date object using the now() method
		LocalDate dateObj = LocalDate.now();
		System.out.println(dateObj);
		//format is terrible but it works

		//create time object
		LocalTime timeObj = LocalTime.now();
		System.out.println(timeObj);

		//to use this chronounit you have to import it
		LocalDate weekBefore = LocalDate.now().minus(1, ChronoUnit.WEEKS);
		System.out.println("week Before: " + weekBefore);

		//create simpledateformat object
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        //initialise the data variables we're comparing
        Date date1 = simpleDateFormat.parse("2022-12-06");
        Date date2 = simpleDateFormat.parse("2021-12-06");
        //use compare to method and print result
        //so the compareTo method prints 0 if dates are equal and -1 if not
        System.out.println(date2.compareTo(date1));

        Date date3 = simpleDateFormat.parse("2012-07-06");
        Date date4 = simpleDateFormat.parse("2013-12-05");
 		//use before and after methods
 		//before and after methods are straight forward as to what to they do
        System.out.println(date3.before(date4));
        System.out.println(date3.after(date4));
        //I like the latter because it uses boolean

        //Time zone
        ZonedDateTime instant = ZonedDateTime.now();
		System.out.println(instant);

		ZonedDateTime instantInGMT = instant.withZoneSameInstant(ZoneId.of("GMT"));
		System.out.println(instantInGMT);

		SimpleDateFormat formatDate1 = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss z");
        //"SimpleDateFormat" class initialize with object
        //"formatDate" this class acceptes the format of
        //date and time as ""dd/MM/yyyy" and "HH:mm:ss z""
        //"z" use for print the time zone
		// Date date1 = new Date();
        //initialize "Date" class
        formatDate1.setTimeZone(TimeZone.getTimeZone("CST"));
        //converting to IST or format the Date as IST
        System.out.println(formatDate1.format(date1));
        //print formatted date and time

		SimpleDateFormat formatDate2 = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss z");
        //"SimpleDateFormat" class initialize with object
        //"formatDate" this class acceptes the format of
        //date and time as ""dd/MM/yyyy" and "HH:mm:ss z""
        //"z" use for print the time zone
		// Date date2 = new Date();
        //initialize "Date" class
        formatDate2.setTimeZone(TimeZone.getTimeZone("IST"));
        //converting to IST or format the Date as IST
        System.out.println(formatDate2.format(date2));
        //print formatted date and time
	}
}