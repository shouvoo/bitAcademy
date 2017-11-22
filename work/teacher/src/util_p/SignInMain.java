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

	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + ", mail=" + mail + ", name=" + name + ", phone=" + phone + ", address="
				+ address + ", img=" + img + "]";
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
			 new User("aaa", "1111", "aaaa@aaaa.com", "������", "010-1111-1111", "�츮��", "aaa.jpg"),
			 new User("bbb", "2222", "bbbb@bbbb.com", "�����ƿ�",  "010-2222-2222","�ϳ���", "bbb.jpg"),
			 new User("ccc", "3333", "cccc@cccc.co.kr", "����������", "010-3333-3333", "�츮��", "ccc.jpg")
	 };
	
	Scanner sc = new Scanner(System.in);
	
	
	String site; //���� ����Ʈ ��
	
	String id,pw,pw2,mail,name,phone,address,img;
	
	
	//id, pw, mail, name, phone,address, img
	SignInRegex [] chkArr = {
			new SignInRegex("1.ID:", "[0-9a-zA-Z]{4,10}", "ID ����",0),
			new SignInRegex("2-1.PW:", "[0-9a-zA-Z]{4,10}", "PW ����"),
			new SignInRegex("2-2.PW:", "[0-9a-zA-Z]{4,10}", "PW ����"),
			new SignInRegex("3.Email:","[0-9a-zA-Z]{4,}@[0-9a-zA-Z]{4,}.[a-z]{3}"
					+ " [0-9a-zA-Z]{4,}@[0-9a-zA-Z]{4,}.[a-z]{2}.[a-z]{2}", "Email ����",2),
			new SignInRegex("4.����:", "[��-��|��-�R|a-zA-Z]*", "���� ����"),
			new SignInRegex("5.��ȭ��ȣ:", "[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}", "��ȭ��ȣ ����",4),
			new SignInRegex("6.�ּ�:", "[��-��|��-�R]*", "�ּ� ����"),
			new SignInRegex("7.������ ����:", "[0-9a-zA-Z��-�R]{1,}.(jpg|gif|png|bmp)", "���������� �ƴմϴ�.")
			
	};
	
	String [] input = new String[chkArr.length];
	
	User [] userArr = new User[10]; // �ݷ����� �ִٸ� DB�� ���� ������ ���ٵ�
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
		for (User u : mem) {
			if (u.data[sir.dup].equals(input)) {
				throw new Exception("�̹� �ִ� "+sir.qq+" �Դϴ�.");		
			}
		}
	}
	
	void run() {
		
		System.out.println("=================");
		System.out.println(site+" ȸ������");
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
					
					if(i==2 && !input[i].equals(input[i-1])) {
						throw new Exception("��й�ȣ Ȯ�ΰ� �������� �ʽ��ϴ�.");	
					}
				}
				
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("ȸ������ ����");
		userArr[i] = new User(
				input[0],
				input[1],
				input[3],
				input[4],
				input[5],
				input[6],
				input[7]);
		
	}
	
	void print() {
	
		System.out.println("=================");
		System.out.println(site+" ȸ�� ���");
		System.out.println("=================");
		
		System.out.println(userArr[i]);
		
	}
	
}

public class SignInMain {
	public static void main(String[] args) {
		
		SignIn naver = new SignIn("���̹�");
		naver.print();

	}
}
