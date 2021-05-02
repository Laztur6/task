package priv.szq.base.day4_21Hw;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import priv.szq.util.DateUtil;

public class HomeWork1 {

	public static void main(String[] args) throws ParseException {
		System.out.println("2014.11.1是星期几");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = df.parse("2014-11-1");
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(date);
		 int i = cal.get(Calendar.DAY_OF_WEEK)-1;
		 System.out.println("星期:"+i);
		 System.out.println("2014.11共有多少天");
		 cal.set(Calendar.YEAR,2014);
		 cal.set(Calendar.MONTH,10);
		 int days = cal.getActualMaximum(Calendar.DATE);
		 System.out.println("共有:"+days+"天");
	
	}
}
