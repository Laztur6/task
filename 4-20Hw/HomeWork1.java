package priv.szq.base.day4_21Hw;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import priv.szq.util.DateUtil;

public class HomeWork1 {

	public static void main(String[] args) throws ParseException {
		System.out.println("2014.11.1�����ڼ�");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date date = df.parse("2014-11-1");
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(date);
		 int i = cal.get(Calendar.DAY_OF_WEEK)-1;
		 System.out.println("����:"+i);
		 System.out.println("2014.11���ж�����");
		 cal.set(Calendar.YEAR,2014);
		 cal.set(Calendar.MONTH,10);
		 int days = cal.getActualMaximum(Calendar.DATE);
		 System.out.println("����:"+days+"��");
	
	}
}
