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
			 new User("aaa", "1111", "aaaa@aaaa.com", "김종인", "010-1111-1111", "우리집", "aaa.jpg"),
			 new User("bbb", "2222", "bbbb@bbbb.com", "김종아웃",  "010-2222-2222","니네집", "bbb.jpg"),
			 new User("ccc", "3333", "cccc@cccc.co.kr", "김종세이프", "010-3333-3333", "우리집", "ccc.jpg")
	 };
	
	Scanner sc = new Scanner(System.in);
	
	
	String site; //포털 사이트 명
	
	String id,mail,name,phone,address,img;
	String pw,pw2;
	
	
	//id, pw, mail, name, phone,address, img
	SignInRegex [] chkArr = {
			new SignInRegex("1.ID:", "[0-9a-zA-Z]{4,10}", "ID 에러",0),
			new SignInRegex("2-1.PW:", "[0-9a-zA-Z]{4,10}", "PW 에러", 1),
			new SignInRegex("2-2.PW:", "[0-9a-zA-Z]{4,10}", "PW 에러", 1),
			new SignInRegex("3.Email:","[0-9a-zA-Z]{4,}@[0-9a-zA-Z]{4,}.[a-z]{3}"
					+ " [0-9a-zA-Z]{4,}@[0-9a-zA-Z]{4,}.[a-z]{2}.[a-z]{2}", "Email 에러",2),
			new SignInRegex("4.성명:", "[ㄱ-ㅎ|가-힣|a-zA-Z]*", "성명 에러"),
			new SignInRegex("5.전화번호:", "[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}", "전화번호 에러",4),
			new SignInRegex("6.주소:", "[ㄱ-ㅎ|가-힣]*", "주소 에러"),
			new SignInRegex("7.프로필 사진:", "[0-9a-zA-Z가-힣]{1,}.(jpg|gif|png|bmp)", "사진파일이 아닙니다.")
			
	};
	
	String [] input = new String[chkArr.length];
	
	User [] userArr = new User[10]; // 콜렉션이 있다면 DB의 양이 무제한 일텐뎅
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
				throw new Exception("비밀번호 확인과 동일하지 않습니다.");
			}
		}
		
		for (User u : mem) {
			if (u.data[sir.dup].equals(input)) {
				throw new Exception("이미 있는 "+sir.qq+" 입니다.");		
			}
		}
	}

	
	void run() {
		
		System.out.println("=================");
		System.out.println(site+" 회원가입");
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
		
		System.out.println("회원가입 성공");
		userArr[i] = new User(id,pw,mail,name,phone,address,img);
		/*i++;
		System.out.println("1: 추가 가입 | 2 : 종료 ");
		String re = sc.nextLine();
		if (re.equals("1")) {
			run();
		}*/
	}
	
	void print() {
	
		System.out.println("=================");
		System.out.println(site+" 회원 목록");
		System.out.println("=================");
		
		for (User u : userArr) {
			if (u!=null){
				String res=
				u.name+"님의 회원 정보 | id : "+u.id+" | pw : "+u.pw+" | mail : "+u.mail+" | phone : "+u.phone+" | address : "+u.address+" | img : "+u.img;
				System.out.println(res);				
			}
		}
		
	}
	
}

public class SignInMain {
	public static void main(String[] args) {
		
		SignIn naver = new SignIn("네이버");
		naver.print();
		
		//SignIn duam = new SignIn("다음");
		//duam.print();
	}
}
