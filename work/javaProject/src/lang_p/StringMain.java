package lang_p;

public class StringMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s1 = "아기 상어";
		String s2 = new String("아기 상어");
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println("아기 상어".toString());
		System.out.println(s1.toString().length());
		System.out.println("아기 상어".length());
		System.out.println(s2 == s1);
		System.out.println(s1.equals(s2));
		
		String a = "선생님 귀여워요 AbcD eF Java 만세 1234";
		//          0 1234------------------------->28
		System.out.println(a.length());
		char ch = a.charAt(5);
		System.out.println(ch);
		System.out.println(a.substring(5, 10));
		System.out.println(a.substring(5));
		String [] arr = a.split(" ");
		for (String str : arr) 
		{
			System.out.println(str);
		}
		System.out.println("------------------------------------------------");
		String ff = "aaa.bbb.ccc.ddd.eee.txt";
		arr = ff.split("[.]");
		for (String str : arr) 
		{
			System.out.println(str);
		}
		
		System.out.println(a.indexOf("a"));
		System.out.println(a.indexOf("a", 19));
		System.out.println(a.lastIndexOf("a"));
		System.out.println(ff.substring(ff.lastIndexOf(".") + 1, ff.length())); //txt
		System.out.println(ff.substring(ff.lastIndexOf(".") + 1)); //txt
		System.out.println(a.contains("Java"));
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.replaceAll("a", "에이"));
		
		char [] chArr = a.toCharArray();
		for (char c : chArr) 
		{
			System.out.println(c);
		}
		
		String tt = "      asdf asdf qwer     ";
		System.out.println(tt.length());
		System.out.println(tt.trim());
		System.out.println(tt.trim().length());
		System.out.println("--------------------------------------------------------");
		//선생님 귀여워요 AbcD Ef Java 만세 1234
		String str1 = a.replaceAll("D", "d");
		String str2 = str1.replace("e", "E");
		String str3 = str2.replace("F", "f");
		
		System.out.println(str3);
		
		arr = a.toLowerCase().split(" ");
		String buf = "";
		for (int i = 0; i < arr.length; i++) 
		{
			buf += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
			if(i + 1 < arr.length)
			{
				buf += " ";
			}
		}
		
		System.out.println(buf);
	}

}















































