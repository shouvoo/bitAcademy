package homeWork_20170830;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HomeWorkMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * ȸ������
		 * �̸�Ȯ�� - �ѱ� 4���� ���ϸ� ����
		 * �ֹε�� Ȯ�� - ���� - ����
		 * id Ȯ�� - ���ĺ� ��ҹ��� ���� ����
		 * ��밡���� ���̵����� üũ
		 * �̸��� �ּ�
		 * ��й�ȣ - !@#$%^&*���������ѱ۰���
		 * ��й�ȣ Ȯ��
		 * ��ȭ��ȣ - ���ڸ�- ����
		 * �ּ� - �ѱ� ���ڸ� ����
		 * ���԰�� - ���ڷ� ���⳪�� (1)���ͳ� (2)ģ����õ (3)�Ź� (4)��Ÿ
		 * ����Ʈ�� �ٶ�� �� - �ѱ۸� ����
		 *  
		 */
		Scanner sc = new Scanner(System.in);
		String name = "", countryId = "", nickName = "", select = "", mail = "", pw = "",
				rePw = "", phone = "", address = "", join = "", joinComment = "";
		
		print("-", "�̸��� �Է��ϼ���*�ѱ� �Է¸� �����մϴ�*");
		nameW:while(true)
		{
			name = sc.nextLine();
			switch(check("[��-��|��-�R]{3}", name))
			{
				case "true":
					break nameW;
				default :
					print("*", "�Է��� �̸��� Ȯ���Ͻð� �ٽ� �Է��ϼ���");
					continue;
			}
		}
		
		print("-", "�ֹε�� ��ȣ�� �Է��ϼ���");
		idW:while(true)
		{
			countryId = sc.nextLine();
			switch(check("[0-9]{6}-[0-9]{7}", countryId))
			{
				case "true":
					break idW;
				default :
					print("*", "�Է��� �ֹε�� ��ȣ�� Ȯ���Ͻð� �ٽ� �Է��ϼ���");
					continue;
			}
		}
		
		print("-", "E-mail �ּҸ� �Է��ϼ���");
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
					print("*", "�����ּҰ� �����ϴ�. �ٽ� E-mail �ּҸ� �Է��ϼ���");
					continue;
			}
		}	
		
		print("-", "����Ͻ� ID�� �Է��ϼ���*Ư����ȣ�� ����ϽǼ� �����ϴ�*");
		nickNameW:while(true)
		{
			nickName = sc.nextLine();
			switch(check("[0-9a-zA-Z��-�R]{4,10}", nickName))
			{
				case "true":
					print("*", "ID ����� �����մϴ�. ��� : 1, ���Է� : 2");
					print("#", "����Ͻ� ��ȣ�� �Է��ϼ���");
					select = sc.nextLine();
					if(select.equals("1")) break nickNameW;
				default :
					print("*", "�Է��� ID�� Ȯ���Ͻð� �ٽ� �Է��ϼ���");
					continue;
			}
		}
		
		print("-", "����Ͻ� ��й�ȣ�� �Է��ϼ���*Ư����ȣ ����� �����մϴ�!@#$%^&*");
		pwW:while(true)
		{
			pw = sc.nextLine();
			switch(check("[!@#$%^&*|a-zA-Z0-9]*", pw))
			{
				case "true":
					print("*", "��й�ȣ Ȯ�������� �ٽ� �Է��ϼ���");
					rePw = sc.nextLine();
					System.out.println(pw + " : " + rePw);
					if(pw.equals(rePw))
					{
						print("-", "��й�ȣ�� �����Ǿ����ϴ�");
						break pwW;
					}
					else 
					{
						print("*", "��й�ȣ�� Ʋ���ϴ� ���� �Է��� �ּ���");
						continue;
					}
				default :
					print("*", "�Է��� ��й�ȣ�� Ȯ���Ͻð� �ٽ� �Է��ϼ���");
					continue;
			}
		}

		print("-", "��ȭ��ȣ�� �Է��ϼ���");
		phoneW:while(true)
		{
			phone = sc.nextLine();
			switch(check("[0-9]{2,3}-[0-9]{3,4}-[0-9]{3,4}", phone))
			{
				case "true":
					break phoneW;
				default :
					print("*", "��ȭ��ȣ�� Ȯ���Ͻð� �ٽ� �Է��ϼ���");
					continue;
			}
		}
		
		print("-", "�ּҸ� �Է��ϼ���");
		addresW:while(true)
		{
			address = sc.nextLine();
			switch(check("[��-�R]*" + " " + "[��-�R]*" + " " + "[��-�R]*" + " " + "[0-9]{1,5}-[0-9]{1,5}", address))
			{
				case "true":
					break addresW;
				default :
					print("*", "�ּҸ� Ȯ���Ͻð� �ٽ� �Է��ϼ���");
					continue;
			}
		}
		
		print("-", "���� ��θ� ������ �ּ��� - (1)���ͳ� (2)ģ����õ (3)�Ź� (4)��Ÿ");
		joinW:while(true)
		{
			join = sc.nextLine();
			switch(check("[0-9]{1}", join))
			{
				case "true":
					break joinW;
				default :
					print("*", "��ȣ�� Ȯ���Ͻð� �ٽ� �Է��ϼ���");
					continue;
			}
		}
		
		print("-", "����Ʈ�� �ٶ�� ���� �ۼ��� �ּ���");
		commW:while(true)
		{
			joinComment = sc.nextLine();
			switch(check("[0-9]{1}", join))
			{
				case "true":
					if(joinComment.trim().length() <= 0) print("*", "����Ʈ�� �ٶ�� ���� �ۼ��� �ּ���");
					else break commW;
				default :
					print("*", "����Ʈ�� �ٶ�� ���� �ۼ��� �ּ���");
					continue;
			}
		}

		print("@", name + "�� ������ �Ϸ�Ǿ����ϴ�");
		print("^", "          ȸ������               ");
		
		System.out.println("�̸� : " + name + "\n�ֹι�ȣ : " + name + "\n���� : " + nickName + "\n�̸��� : " + 
				mail + "\n��й�ȣ : " + pw + "\n��ȭ��ȣ : " + phone + "\n�ּ� : " + address);
		
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
