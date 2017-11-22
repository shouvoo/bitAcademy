package homeWork_20170828;

public class HomeWorkMain 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*주민번호를 이용하여
		성별, 국적, 생년월일을 출력하세요*/
		String [][] dataArr = 	{{"한빛남", "800505-1234567"},
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
			

			name = dataArr[i][0];
				
			countryId = ((i / 4) > 1) ? (i / 4) - 2 : (i / 4);
				
				
			printStr = country[countryId] + "\t" + gender[i  % 2] + "\t" + name + "\t" + birth;
			System.out.println(printStr);
		}
		
	}

}
