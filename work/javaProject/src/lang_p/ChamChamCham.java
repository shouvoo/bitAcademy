package lang_p;

import java.io.IOException;

public class ChamChamCham 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//������
		/*String [] index = {"����", "������", "����"};
		System.out.println("�߾��� ���� ������");
		while(true)
		{
			try 
			{
				for (int i = 0; i < index.length; i++) 
				{
					System.out.println(i + "." + index[i]);
					
				}
				System.out.print("\n �Է� : ");
				int user = System.in.read() - '0';
				System.in.read();
				System.in.read();
				
				if(user == index.length - 1) break;
				
				int com = (int)(Math.random() * 2);
				String res = "��";
				if(com == user) res = "��";
				
				System.out.println("���̸� : " + index[user]);
				System.out.println("��ǻ�� : " + index[com]);
				System.out.println("��� : " + res);
				
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("���� ����");*/
		
		//���� ���� ��
		/*String [] index = {"����", "����", "��", "����"};
		int [][] match = {{2, 0, 1}, {2, 1, 0}, {0, 1, 2}};
		System.out.println("���� ���� ��");
		while(true)
		{
			try 
			{
				for (int i = 0; i < index.length; i++) 
				{
					System.out.println(i + "." + index[i]);
					
				}
				System.out.println("�Է� \n");
				int user = System.in.read() - '0';
				System.in.read();
				System.in.read();
				
				int com = (int)(Math.random() * 3);
				
				String res = "���º�";
				
				if(user == com) res = "���º�";
				else if(user < match[user][com]) res = "��";
				else res = "��";
				
				System.out.println("���̸� : " + index[user]);
				System.out.println("��ǻ�� : " + index[com]);
				System.out.println("��� : " + res);
				
				if(user == index.length - 1) break;
				
			} catch (Exception e) 
			{
				// TODO: handle exception
			}
		}
		
		System.out.println("���� ����");*/
		
		//���� ���� �� ������ ���
		/*String [][] res = {{"���", "��", "��"}, {"��", "���", "��"}, {"��", "��", "���"}};
		String [] index = {"����", "����", "��", "����"};
		
		while(true)
		{
			try 
			{
				for (int i = 0; i < index.length; i++) 
				{
					System.out.println(i + "." + index[i]);
					
				}
				System.out.println("�Է� \n");
				int user = System.in.read() - '0';
				System.in.read();
				System.in.read();
				
				int com = (int)(Math.random() * (index.length - 1));
				
				System.out.println("���̸� : " + index[user]);
				System.out.println("��ǻ�� : " + index[com]);
				System.out.println("��� : " + res[user][com]);
				
				if(user == index.length - 1) break;
				
			} catch (Exception e) 
			{
				// TODO: handle exception
			}
		}
		System.out.println("���� ����");*/
		
		//�����
		String [][] res = {{"���", "��", "��"}, {"��", "���", "��"}, {"��", "��", "���"}};
		String [] index = {"����", "����", "��", "����"};
		
		try
		{
			aaa:while(true)
			{
				System.out.println("�������ϱ�");
				System.out.println("�Է� \n");
				int user = System.in.read() - '0';
				System.in.read();
				System.in.read();
				
				int com = (int)(Math.random() * (index.length - 1));
				
				System.out.println("���̸� : " + index[user]);
				System.out.println("��ǻ�� : " + index[com]);
				System.out.println("��� : " + res[user][com]);
				
				if(user == index.length - 1) break aaa;
			} 
		
			bbb:while(true)
			{
				
			}
		} catch(Exception e)
		{
			
		}
		
		
	}

}
