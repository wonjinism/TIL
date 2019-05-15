package main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import dao.DateManager;

public class test {
	private static DateManager mgr = new DateManager();

	public static void main(String[] args) {

		String today = mgr.getToday();
	     
	    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	    try {
	        Date date1 = df.parse(today);
	        System.out.println(date1);
	         
	        // 날짜 더하기
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(date1);
	        cal.add(Calendar.DATE, 2);
	        cal.add(Calendar.MONTH, 2);
	         
	        String date = df.format(cal.getTime());
	        System.out.println(date);
	         
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
}
}