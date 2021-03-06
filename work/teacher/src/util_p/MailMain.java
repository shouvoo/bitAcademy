package util_p;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MailMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		while(true)
		{
			try {
				
				System.out.print("1.주소:");
				String mail = sc.nextLine();
				
				if(!(Pattern.matches("[0-9a-zA-Z]{4,}@[0-9a-zA-Z]{4,}.[a-z]{3}",mail)
					||	
					Pattern.matches("[0-9a-zA-Z]{4,}@[0-9a-zA-Z]{4,}.[a-z]{2}.[a-z]{2}",mail)
				))
					throw new Exception("메일주소에러");
				
				System.out.print("2.발신인:");
				String sender = sc.nextLine();
				if(!Pattern.matches("[ㅏ-ㅣ|ㄱ-ㅎ|가-힣]*",sender))
						throw new Exception("발신인 에러");
				
				System.out.print("3.내용:");
				String contents = sc.nextLine();
				if(contents.trim().length()<=0)
						throw new Exception("내용 에러");
				
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("메일발송 성공");
	}

}
