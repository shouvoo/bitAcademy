package homeWork_20170830;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HomeWorkMain2 
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
		
		while(true)
		{
			try 
			{
				print("-", "이름을 입력하세요*한글 입력만 가능합니다*");
				String name = sc.nextLine();
				if(!check("[ㄱ-ㅎ|가-힣]{3}", name))
				{
					throw new Exception("입력한 이름을 확인하시고 다시 입력하세요");
				}
				
				print("-", "주민등록 번호를 입력하세요");
				String countryId = sc.nextLine();
				if(!check("[0-9]{6}-[0-9]{7}", countryId))
				{
					throw new Exception("입력한 주민등록 번호를 확인하시고 다시 입력하세요");
				}
				
				
				print("-", "사용하실 ID를 입력하세요*특수기호는 사용하실수 없습니다*");
				String nickName = sc.nextLine();
				if(!check("[0-9a-zA-Z가-힣]{4,10}", nickName))
				{
					throw new Exception("입력한 ID를 확인하시고 다시 입력하세요");
				} else 
				{
					print("*", "ID 사용이 가능합니다. 사용 : 1, 재입력 : 2");
					String select = sc.nextLine();
					if(select == "1") print("#", "사용하실 비밀번호를 입력하세요");
					else continue;
				}
				
				print("-", "E-mail 주소를 입력하세요");
				String mail = sc.nextLine();
				if(!(check("[0-9a-zA-Z]{1,}@[0-9a-zA-Z]{1,}.[a-z]{3}", mail)) ||
					(check("[0-9a-zA-Z]{1,}@[0-9a-zA-Z]{1,}.[a-z]{2}.[a-z]{2}", mail)))
				{
					throw new Exception("메일주소가 없습니다. 다시 E-mail 주소를 입력하세요");
				}
				
				print("-", "사용하실 비밀번호를 입력하세요*특수기호 사용이 가능합니다!@#$%^&*");
				String pw = sc.nextLine();
				if(!check("[!@#$%^&*|a-zA-Z0-9]*", pw))
				{
					throw new Exception("입력한 비밀번호를 확인하시고 다시 입력하세요");
				} else 
				{
					print("*", "비밀번호 확인을위해 다시 입력하세요");
					String rePw= sc.nextLine();
					if(pw.equals(rePw)) print("-", "비밀번호가 설정되었습니다");
					else 
					{
						print("*", "비밀번호가 틀립니다 새로 입력해 주세요");
						continue;
					}
				}
				
				print("-", "전화번호를 입력하세요");
				String phone = sc.nextLine();
				if(!check("[0-9]{2,3}-[0-9]{3,4}-[0-9]{3,4}", phone))
				{
					throw new Exception("전화번호를 확인하시고 다시 입력하세요");
				}
				
				
				print("-", "주소를 입력하세요");
				String address = sc.nextLine();
				if(!check("[가-힣]*" + " " + "[가-힣]*" + " " + "[가-힣]*" + " " + "[0-9]{1,5}-[0-9]{1,5}", address))
				{
					throw new Exception("주소를 확인하시고 다시 입력하세요");
				} 
				
				print("-", "가입 경로를 선택해 주세요 - (1)인터넷 (2)친구추천 (3)신문 (4)기타");
				String join = sc.nextLine();
				if(!check("[0-9]{1}", join))
				{
					throw new Exception("번호를 확인하시고 다시 입력하세요");
				} 
				
				print("-", "사이트에 바라는 점을 작성해 주세요");
				String joinComment = sc.nextLine();
				if(joinComment.trim().length() <= 0)
				{
					print("*", "사이트에 바라는 점을 작성해 주세요");
				} 
				
				print("@", name + "님에 가입이 완료되었습니다");
				
				break;
			} catch (Exception e) 
			{
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}

	}
	
	static Boolean check(String pt, String compare)
	{
		return Pattern.matches(pt, compare);
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
