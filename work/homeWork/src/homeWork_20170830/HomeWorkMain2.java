package homeWork_20170830;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HomeWorkMain2 
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
		
		while(true)
		{
			try 
			{
				print("-", "�̸��� �Է��ϼ���*�ѱ� �Է¸� �����մϴ�*");
				String name = sc.nextLine();
				if(!check("[��-��|��-�R]{3}", name))
				{
					throw new Exception("�Է��� �̸��� Ȯ���Ͻð� �ٽ� �Է��ϼ���");
				}
				
				print("-", "�ֹε�� ��ȣ�� �Է��ϼ���");
				String countryId = sc.nextLine();
				if(!check("[0-9]{6}-[0-9]{7}", countryId))
				{
					throw new Exception("�Է��� �ֹε�� ��ȣ�� Ȯ���Ͻð� �ٽ� �Է��ϼ���");
				}
				
				
				print("-", "����Ͻ� ID�� �Է��ϼ���*Ư����ȣ�� ����ϽǼ� �����ϴ�*");
				String nickName = sc.nextLine();
				if(!check("[0-9a-zA-Z��-�R]{4,10}", nickName))
				{
					throw new Exception("�Է��� ID�� Ȯ���Ͻð� �ٽ� �Է��ϼ���");
				} else 
				{
					print("*", "ID ����� �����մϴ�. ��� : 1, ���Է� : 2");
					String select = sc.nextLine();
					if(select == "1") print("#", "����Ͻ� ��й�ȣ�� �Է��ϼ���");
					else continue;
				}
				
				print("-", "E-mail �ּҸ� �Է��ϼ���");
				String mail = sc.nextLine();
				if(!(check("[0-9a-zA-Z]{1,}@[0-9a-zA-Z]{1,}.[a-z]{3}", mail)) ||
					(check("[0-9a-zA-Z]{1,}@[0-9a-zA-Z]{1,}.[a-z]{2}.[a-z]{2}", mail)))
				{
					throw new Exception("�����ּҰ� �����ϴ�. �ٽ� E-mail �ּҸ� �Է��ϼ���");
				}
				
				print("-", "����Ͻ� ��й�ȣ�� �Է��ϼ���*Ư����ȣ ����� �����մϴ�!@#$%^&*");
				String pw = sc.nextLine();
				if(!check("[!@#$%^&*|a-zA-Z0-9]*", pw))
				{
					throw new Exception("�Է��� ��й�ȣ�� Ȯ���Ͻð� �ٽ� �Է��ϼ���");
				} else 
				{
					print("*", "��й�ȣ Ȯ�������� �ٽ� �Է��ϼ���");
					String rePw= sc.nextLine();
					if(pw.equals(rePw)) print("-", "��й�ȣ�� �����Ǿ����ϴ�");
					else 
					{
						print("*", "��й�ȣ�� Ʋ���ϴ� ���� �Է��� �ּ���");
						continue;
					}
				}
				
				print("-", "��ȭ��ȣ�� �Է��ϼ���");
				String phone = sc.nextLine();
				if(!check("[0-9]{2,3}-[0-9]{3,4}-[0-9]{3,4}", phone))
				{
					throw new Exception("��ȭ��ȣ�� Ȯ���Ͻð� �ٽ� �Է��ϼ���");
				}
				
				
				print("-", "�ּҸ� �Է��ϼ���");
				String address = sc.nextLine();
				if(!check("[��-�R]*" + " " + "[��-�R]*" + " " + "[��-�R]*" + " " + "[0-9]{1,5}-[0-9]{1,5}", address))
				{
					throw new Exception("�ּҸ� Ȯ���Ͻð� �ٽ� �Է��ϼ���");
				} 
				
				print("-", "���� ��θ� ������ �ּ��� - (1)���ͳ� (2)ģ����õ (3)�Ź� (4)��Ÿ");
				String join = sc.nextLine();
				if(!check("[0-9]{1}", join))
				{
					throw new Exception("��ȣ�� Ȯ���Ͻð� �ٽ� �Է��ϼ���");
				} 
				
				print("-", "����Ʈ�� �ٶ�� ���� �ۼ��� �ּ���");
				String joinComment = sc.nextLine();
				if(joinComment.trim().length() <= 0)
				{
					print("*", "����Ʈ�� �ٶ�� ���� �ۼ��� �ּ���");
				} 
				
				print("@", name + "�Կ� ������ �Ϸ�Ǿ����ϴ�");
				
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
