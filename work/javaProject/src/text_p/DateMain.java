package text_p;

import java.util.Calendar;
import java.util.Date;

public class DateMain 
{
	public static void main(String [] args)
	{
		/*Date now = new Date();
		System.out.println(now);
		System.out.println(now.getYear() + 1900); // �׻� 1900 �� ������� �Ѵ�
		System.out.println(now.getMonth() + 1); // �׻� 1�� ������� ���� "��"�� ��µȴ�
		System.out.println(now.getDate());
		System.out.println(now.getDay()); //�� ~ �� ������� 0 ~ 6
		System.out.println(now.getHours());
		System.out.println(now.getMinutes());
		System.out.println(now.getSeconds());
		System.out.println(now.getTimezoneOffset());
		System.out.println(now.getTime());
		
		Calendar nn = Calendar.getInstance();
		System.out.println(nn.getTimeInMillis());*/
		
		Date now = new Date();
		now = new Date(1989 - 1900, 3 - 1, 20);
		Calendar nn = Calendar.getInstance();
		//nn.setTimeInMillis(now.getTime());	
		nn.setTime(now);
		nn.set(Calendar.YEAR, 2010);
		print(nn);
		
		now = nn.getTime();
		
		now.setYear(119);
		now.setMonth(10);
		System.out.println(now);
		
	}
	
	static void print(Calendar ddd)
	{
		String str = "" + ddd.get(Calendar.YEAR) + "-";
		
		if(ddd.get(Calendar.MONTH) < 9) str += 0;
		
		str += (ddd.get(Calendar.MONTH) + 1) + "-" + 
				ddd.get(Calendar.DATE) + " (" + "�Ͽ�ȭ�������".charAt(ddd.get(Calendar.DAY_OF_WEEK) - 1) + ") " +
				ddd.get(Calendar.HOUR_OF_DAY) + ":" + ddd.get(Calendar.MINUTE) + ":" + 
				ddd.get(Calendar.SECOND) + "." + ddd.get(Calendar.MILLISECOND); 
		System.out.println(str);
	}
}



























