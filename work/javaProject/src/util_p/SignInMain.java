package util_p;

import java.util.Scanner;
import java.util.regex.Pattern;

class User{
	String id,pw,mail,name,phone,address,img;
	
	String [] data;
	
	public User(String id, String pw, String mail, String name, String phone, String address, String img) {
		this.id = id;
		this.pw = pw;
		this.mail = mail;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.img = img;
		
		data = new String[]{id, pw, mail, name, phone,address, img};
	}
}

class SignInRegex{
	
	String qq, err;
	int dup;
	
	String [] regex;

	public SignInRegex(String qq, String regex, String err) {
		this(qq, regex, err, -1);
	}

	public SignInRegex(String qq, String regex, String err, int dup) {
		super();
		this.qq = qq;
		this.err = err;
		this.dup = dup;
		this.regex = regex.split(" ");
	}
	
	
	
	
}


class SignIn{
	
	 User [] mem = {
			 //new User(id, pw, mail, name, phone, address, img)
			 new User("aaa", "1111", "aaaa@aaaa.com", "±èÁ¾ÀÎ", "010-1111-1111", "¿ì¸®Áý", "aaa.jpg"),
			 new User("bbb", "2222", "bbbb@bbbb.com", "±èÁ¾¾Æ¿ô",  "010-2222-2222","´Ï³×Áý", "bbb.jpg"),
			 new User("ccc", "3333", "cccc@cccc.co.kr", "±èÁ¾¼¼ÀÌÇÁ", "010-3333-3333", "¿ì¸®Áý", "ccc.jpg")
	 };
	
	Scanner sc = new Scanner(System.in);
	
	
	String site; //Æ÷ÅÐ »çÀÌÆ® ¸í
	
	String id,mail,name,phone,address,img;
	String pw,pw2;
	
	
	//id, pw, mail, name, phone,address, img
	SignInRegex [] chkArr = {
			new SignInRegex("1.ID:", "[0-9a-zA-Z]{4,10}", "ID ¿¡·¯",0),
			new SignInRegex("2-1.PW:", "[0-9a-zA-Z]{4,10}", "PW ¿¡·¯", 1),
			new SignInRegex("2-2.PW:", "[0-9a-zA-Z]{4,10}", "PW ¿¡·¯", 1),
			new SignInRegex("3.Email:","[0-9a-zA-Z]{4,}@[0-9a-zA-Z]{4,}.[a-z]{3}"
					+ " [0-9a-zA-Z]{4,}@[0-9a-zA-Z]{4,}.[a-z]{2}.[a-z]{2}", "Email ¿¡·¯",2),
			new SignInRegex("4.¼º¸í:", "[¤¡-¤¾|°¡-ÆR|a-zA-Z]*", "¼º¸í ¿¡·¯"),
			new SignInRegex("5.ÀüÈ­¹øÈ£:", "[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}", "ÀüÈ­¹øÈ£ ¿¡·¯",4),
			new SignInRegex("6.ÁÖ¼Ò:", "[¤¡-¤¾|°¡-ÆR]*", "ÁÖ¼Ò ¿¡·¯"),
			new SignInRegex("7.ÇÁ·ÎÇÊ »çÁø:", "[0-9a-zA-Z°¡-ÆR]{1,}.(jpg|gif|png|bmp)", "»çÁøÆÄÀÏÀÌ ¾Æ´Õ´Ï´Ù.")
			
	};
	
	String [] input = new String[chkArr.length];
	
	User [] userArr = new User[10]; // ÄÝ·º¼ÇÀÌ ÀÖ´Ù¸é DBÀÇ ¾çÀÌ ¹«Á¦ÇÑ ÀÏÅÙµ­
	int i=0;
	
	public SignIn(String site) {
		this.site = site;
		run();
	}
	
	
	String chk(SignInRegex sr) throws Exception
	{

		System.out.print(sr.qq);
		String input = sc.nextLine();
		
		boolean rr = false;
		
		for (int i = 0; i < sr.regex.length; i++) {
			rr = rr || Pattern.matches(sr.regex[i],input);
		}
		
		if(!rr) {
				throw new Exception(sr.err);
		}
		
		return input;
	}
	
	void dupChk(String input, SignInRegex sir) throws Exception
	{
		if(sir.dup == 1)
		{
			if(pw == null) pw = input;
			if (!pw.equals(input)) {
				pw = null;
				throw new Exception("ºñ¹Ð¹øÈ£ È®ÀÎ°ú µ¿ÀÏÇÏÁö ¾Ê½À´Ï´Ù.");
			}
		}
		
		for (User u : mem) {
			if (u.data[sir.dup].equals(input)) {
				throw new Exception("ÀÌ¹Ì ÀÖ´Â "+sir.qq+" ÀÔ´Ï´Ù.");		
			}
		}
	}

	
	void run() {
		
		System.out.println("=================");
		System.out.println(site+" È¸¿ø°¡ÀÔ");
		System.out.println("=================");
		
		
		
		while(true)
		{
			try {
				
				
				for (int i = 0; i < chkArr.length; i++) {
					
					
					input[i]=chk(chkArr[i]);
					
					if(chkArr[i].dup>=0)
					{
						dupChk(input[i], chkArr[i]);
					}
				}

				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("È¸¿ø°¡ÀÔ ¼º°ø");
		userArr[i] = new User(id,pw,mail,name,phone,address,img);
		/*i++;
		System.out.println("1: Ãß°¡ °¡ÀÔ | 2 : Á¾·á ");
		String re = sc.nextLine();
		if (re.equals("1")) {
			run();
		}*/
	}
	
	void print() {
	
		System.out.println("=================");
		System.out.println(site+" È¸¿ø ¸ñ·Ï");
		System.out.println("=================");
		
		for (User u : userArr) {
			if (u!=null){
				String res=
				u.name+"´ÔÀÇ È¸¿ø Á¤º¸ | id : "+u.id+" | pw : "+u.pw+" | mail : "+u.mail+" | phone : "+u.phone+" | address : "+u.address+" | img : "+u.img;
				System.out.println(res);				
			}
		}
		
	}
	
}

public class SignInMain {
	public static void main(String[] args) {
		
		SignIn naver = new SignIn("³×ÀÌ¹ö");
		naver.print();
		
		//SignIn duam = new SignIn("´ÙÀ½");
		//duam.print();
	}
}
