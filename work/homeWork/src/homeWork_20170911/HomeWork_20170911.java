package homeWork_20170911;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

public class HomeWork_20170911 
{
	public static void main(String [] args)
	{
		/*올해생일 언제
		다가오는 생일
		d - day
		생일 파티가 토, 일이면 그주 금요일*/
		
		/*주민번호를 이용하여
		성별, 국적, 생년월일을 출력하세요*/
		
		
		ArrayList<String> originalBirth = new ArrayList<>();
		String [][] dataArr = 	{{"한빛남", "800821-1234567"},
								{"한빛여", "950725-2234567"},
								{"두빛남", "020123-3234567"},
								{"두빛여", "050421-4234567"},
								{"브래드", "880623-5234567"},
								{"안젤리나", "990811-6234567"},
								{"피트", "011223-7234567"},
								{"졸리", "071010-8234567"},
								{"남어르신", "960222-9234567"},
								{"여어르신", "540319-0234567"}};
		
		String [] gender = {"남", "여"};
		String [] country = {"내국인", "외국인"};
		
		String printStr = "";
		String persnolId = "";
		String birth = "";
		String name = "";
		String year = "";
		int countryId = 0;
		for (int i = 0; i < dataArr.length; i++) 
		{
			persnolId = dataArr[i][1].substring(dataArr[i][1].indexOf("-") + 1, 
					                            dataArr[i][1].indexOf("-") + 2);
			if(i <= 7) year = ((i % 4) / 2) + 19 + "";
			else year = "18";
			
			birth = year + dataArr[i][1].substring(0, 2) + "년 " + 
			        dataArr[i][1].substring(2, 4) + "월 " + 
			        dataArr[i][1].substring(4, 6) + "일 ";
			
			originalBirth.add(year + dataArr[i][1].split("-")[0]);
			name = dataArr[i][0];
				
			countryId = ((i / 4) > 1) ? (i / 4) - 2 : (i / 4);
				
				
			printStr = country[countryId] + "\t" + gender[i  % 2] + "\t" + name + "\t" + birth;
			System.out.println(printStr);
			
		}
		System.out.println(year);
		
		System.out.println("------------------------------------------------------");
		Date bornDate;
		Date nowBirth;
		Date nextBirth;
		Date toDate;
		SimpleDateFormat bornSdf;
		
		int yy, mm, dd;
		int leftDay;
		
		for (String ob : originalBirth)	
		{
			String res = "";
			yy = Integer.parseInt(ob.substring(0,  4)) - 1900;
			mm = Integer.parseInt(ob.substring(4, 6)) - 1;
			dd = Integer.parseInt(ob.substring(6, 8));
			
			bornDate = new Date(yy, mm, dd);
			nowBirth = new Date();
			nowBirth.setMonth(mm);
			nowBirth.setDate(dd);
			nextBirth = new Date(nowBirth.getYear() + 1, mm, dd);
			toDate = new Date();
			
			bornSdf = new SimpleDateFormat("yyyy-MM-dd");
			res += "태어난 날 : " + bornSdf.format(bornDate) + ", 올해생일 : " + bornSdf.format(nowBirth)
			 + ", 내년생일 : " + bornSdf.format(nextBirth);
			bornSdf = new SimpleDateFormat("DD");
			
			leftDay = Integer.parseInt(bornSdf.format(nowBirth)) - Integer.parseInt(bornSdf.format(toDate));
			
			if(leftDay > 0) res += "\n 올해생일까지 " + leftDay + "일 남았습니다";
			else res += "\n 올해생일은 " + (-leftDay) + "일 지났습니다";
			
			leftDay = 365 - Integer.parseInt(bornSdf.format(toDate)) + Integer.parseInt(bornSdf.format(nextBirth));
			res += "\n 내년 생일까지 " + leftDay + "남았습니다";
			
			System.out.println(res);
			System.out.println("---------------------------------------");
			System.out.println("---------------------------------------");
			System.out.println("---------------------------------------");
		}
		
		
		
	}

}
