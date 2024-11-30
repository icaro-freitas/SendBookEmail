package com.devsuperior.send_book_email.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class GenerateBookReturnDate {
	
	public static int numDaysToReturnBook = 7;
	
	private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	public static String dateToStringFormatedDate(Date date) {		
		Calendar calendar = dateToCalendar(date);
		calendar.add(Calendar.DATE, numDaysToReturnBook);
		String result = dateFormat.format(calendarToDate(calendar));
		return result;		
	}

	private static Date calendarToDate(Calendar calendar) {
		return calendar.getTime();
	}

	private static Calendar dateToCalendar(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}

}
