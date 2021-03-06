package homeWork_20170830;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HomeWorkMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * 회원가입
		 * 이름확인 - 한글 4글자 이하만 가능
		 * 주민등록 확인 - 숫자 - 가능
		 * id 확인 - 알파벳 대소문자 숫자 가능
		 * 사용가능한 아이디인지 체크
		 * 이메일 주소
		 * 비밀번호 - !@#$%^&*영문숫자한글가능
		 * 비밀번호 확인
		 * 전화번호 - 숫자만- 가능
		 * 주소 - 한글 숫자만 가능
		 * 가입경로 - 숫자로 보기나감 (1)인터넷 (2)친구추천 (3)신문 (4)기타
		 * 사이트에 바라는 점 - 한글만 가능
		 *  
		 */
		Scanner sc = new Scanner(System.in);
		String name = "", countryId = "", nickName = "", select = "", mail = "", pw = "",
				rePw = "", phone = "", address = "", join = "", joinComment = "";
		
		print("-", "이름을 입력하세요*한글 입력만 가능합니다*");
		nameW:while(true)
		{
			name = sc.nextLine();
			switch(check("[ㄱ-ㅎ|가-힣]{3}", name))
			{
				case "true":
					break nameW;
				default :
					print("*", "입력한 이름을 확인하시고 다시 입력하세요");
					continue;
			}
		}
		
		print("-", "주민등록 번호를 입력하세요");
		idW:while(true)
		{
			countryId = sc.nextLine();
			switch(check("[0-9]{6}-[0-9]{7}", countryId))
			{
				case "true":
					break idW;
				default :
					print("*", "입력한 주민등록 번호를 확인하시고 다시 입력하세요");
					continue;
			}
		}
		
		print("-", "E-mail 주소를 입력하세요");
		mailW:while(true)
		{
			mail = sc.nextLine();
			String check = "";
			if(check("[0-9a-zA-Z]{1,}@[0-9a-zA-Z]{1,}.[a-z]{3}", mail) == "true" ||
				check("[0-9a-zA-Z]{1,}@[0-9a-zA-Z]{1,}.[a-z]{2}.[a-z]{2}", mail) == "true")
			{
				check = "true";
			} else check = "false";
			
			switch(check)
			{
				case "true":
					break mailW;
				default :
					print("*", "메일주소가 없습니다. 다시 E-mail 주소를 입력하세요");
					continue;
			}
		}	
		
		print("-", "사용하실 ID를 입력하세요*특수기호는 사용하실수 없습니다*");
		nickNameW:while(true)
		{
			nickName = sc.nextLine();
			switch(check("[0-9a-zA-Z가-힣]{4,10}", nickName))
			{
				case "true":
					print("*", "ID 사용이 가능합니다. 사용 : 1, 재입력 : 2");
					print("#", "사용하실 번호를 입력하세요");
					select = sc.nextLine();
					if(select.equals("1")) break nickNameW;
				default :
					print("*", "입력한 ID를 확인하시고 다시 입력하세요");
					continue;
			}
		}
		
		print("-", "사용하실 비밀번호를 입력하세요*특수기호 사용이 가능합니다!@#$%^&*");
		pwW:while(true)
		{
			pw = sc.nextLine();
			switch(check("[!@#$%^&*|a-zA-Z0-9]*", pw))
			{
				case "true":
					print("*", "비밀번호 확인을위해 다시 입력하세요");
					rePw = sc.nextLine();
					System.out.println(pw + " : " + rePw);
					if(pw.equals(rePw))
					{
						print("-", "비밀번호가 설정되었습니다");
						break pwW;
					}
					else 
					{
						print("*", "비밀번호가 틀립니다 새로 입력해 주세요");
						continue;
					}
				default :
					print("*", "입력한 비밀번호를 확인하시고 다시 입력하세요");
					continue;
			}
		}

		print("-", "전화번호를 입력하세요");
		phoneW:while(true)
		{
			phone = sc.nextLine();
			switch(check("[0-9]{2,3}-[0-9]{3,4}-[0-9]{3,4}", phone))
			{
				case "true":
					break phoneW;
				default :
					print("*", "전화번호를 확인하시고 다시 입력하세요");
					continue;
			}
		}
		
		print("-", "주소를 입력하세요");
		addresW:while(true)
		{
			address = sc.nextLine();
			switch(check("[가-힣]*" + " " + "[가-힣]*" + " " + "[가-힣]*" + " " + "[0-9]{1,5}-[0-9]{1,5}", address))
			{
				case "true":
					break addresW;
				default :
					print("*", "주소를 확인하시고 다시 입력하세요");
					continue;
			}
		}
		
		print("-", "가입 경로를 선택해 주세요 - (1)인터넷 (2)친구추천 (3)신문 (4)기타");
		joinW:while(true)
		{
			join = sc.nextLine();
			switch(check("[0-9]{1}", join))
			{
				case "true":
					break joinW;
				default :
					print("*", "번호를 확인하시고 다시 입력하세요");
					continue;
			}
		}
		
		print("-", "사이트에 바라는 점을 작성해 주세요");
		commW:while(true)
		{
			joinComment = sc.nextLine();
			switch(check("[0-9]{1}", join))
			{
				case "true":
					if(joinComment.trim().length() <= 0) print("*", "사이트에 바라는 점을 작성해 주세요");
					else break commW;
				default :
					print("*", "사이트에 바라는 점을 작성해 주세요");
					continue;
			}
		}

		print("@", name + "님 가입이 완료되었습니다");
		print("^", "          회원정보               ");
		
		System.out.println("이름 : " + name + "\n주민번호 : " + name + "\n별명 : " + nickName + "\n이메일 : " + 
				mail + "\n비밀번호 : " + pw + "\n전화번호 : " + phone + "\n주소 : " + address);
		
	}
	
	static String check(String pt, String compare)
	{
		String str = Pattern.matches(pt, compare) ? "true" : "false";
		return str;
	}
	
	static void print(String value1, String value2)
	{
		int len = value2.length() + 8;
		for (int i = 0; i < 3; i++) 
		{
			if(i == 1) System.out.print(value2);
			else 
			{
				for (int j = 0; j < len; j++) 
				{
					System.out.print(value1);
				}
			}
			System.out.println();
		}
	}

}
