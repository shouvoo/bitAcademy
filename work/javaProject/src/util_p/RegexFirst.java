package util_p;

import java.util.regex.Pattern;

public class RegexFirst 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char ch = 'ㅎ';
		System.out.println((int)ch);
		
		/*for (int i = 'ㄱ'; i <= 'ㅎ'; i+=3) 
		{
			System.out.println((char)i);
		}*/
		
		String [] mmArr = {"장동건","장서건","장혁","장남건","장","장군","최장군","박장군","장군님","장장장",
                "현빈","원빈","미스터빈","커피빈","커피","원두커피","장희빈","ㄱㄴㄷ","ㄱㄹㄴ",
                "다","공석호","김희애","나비야","너비아니", "ㅋㅍㅂ", "카ㅍ빈", "강남역", "강남역전", "구내염", "강내영" , "영가네"    
        };
		
		String index = "ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅍㅌㅎㄲㄸㅉㅃㅆ";
		String ff = "가나다라마바사아자차카파타하까따짜빠싸";
		String ee = "깋닣딯맇밓빟싷잏짛칳킿핗팋힣낗띻찧삫앃";
		
		String sch = "ㅋㅍㅂ";
		//String sch = "ㄱㄱㅎㄹㄹㅈㄷ";
		String pp = "";
		
		for (int i = 0; i < sch.length(); i++) 
		{
			int pos = index.indexOf("" + sch.charAt(i));
			if(pos < 0) pp += sch.charAt(i);
			else pp += "[" + sch.charAt(i) +  "|" + ff.charAt(pos) + "-"+ee.charAt(pos) + "]";
		}
		
		System.out.println(pp);
		
		for (String str : mmArr) 
		{
			if(Pattern.matches(pp, str))
			{
				System.out.println(str + ", ");
			}
		}
	}

}
