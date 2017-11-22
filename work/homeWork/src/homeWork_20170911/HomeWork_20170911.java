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
		/*���ػ��� ����
		�ٰ����� ����
		d - day
		���� ��Ƽ�� ��, ���̸� ���� �ݿ���*/
		
		/*�ֹι�ȣ�� �̿��Ͽ�
		����, ����, ��������� ����ϼ���*/
		
		
		ArrayList<String> originalBirth = new ArrayList<>();
		String [][] dataArr = 	{{"�Ѻ���", "800821-1234567"},
								{"�Ѻ���", "950725-2234567"},
								{"�κ���", "020123-3234567"},
								{"�κ���", "050421-4234567"},
								{"�귡��", "880623-5234567"},
								{"��������", "990811-6234567"},
								{"��Ʈ", "011223-7234567"},
								{"����", "071010-8234567"},
								{"�����", "960222-9234567"},
								{"�����", "540319-0234567"}};
		
		String [] gender = {"��", "��"};
		String [] country = {"������", "�ܱ���"};
		
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
			
			birth = year + dataArr[i][1].substring(0, 2) + "�� " + 
			        dataArr[i][1].substring(2, 4) + "�� " + 
			        dataArr[i][1].substring(4, 6) + "�� ";
			
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
			res += "�¾ �� : " + bornSdf.format(bornDate) + ", ���ػ��� : " + bornSdf.format(nowBirth)
			 + ", ������� : " + bornSdf.format(nextBirth);
			bornSdf = new SimpleDateFormat("DD");
			
			leftDay = Integer.parseInt(bornSdf.format(nowBirth)) - Integer.parseInt(bornSdf.format(toDate));
			
			if(leftDay > 0) res += "\n ���ػ��ϱ��� " + leftDay + "�� ���ҽ��ϴ�";
			else res += "\n ���ػ����� " + (-leftDay) + "�� �������ϴ�";
			
			leftDay = 365 - Integer.parseInt(bornSdf.format(toDate)) + Integer.parseInt(bornSdf.format(nextBirth));
			res += "\n ���� ���ϱ��� " + leftDay + "���ҽ��ϴ�";
			
			System.out.println(res);
			System.out.println("---------------------------------------");
			System.out.println("---------------------------------------");
			System.out.println("---------------------------------------");
		}
		
		
		
	}

}
