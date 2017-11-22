package excep;

import java.io.IOException;


class LoginExcep extends Exception
{
	String [] arr = {"id�� �����ϴ�", "id����", "pw����"};
	int num;

	public LoginExcep(int num) 
	{
		super();
		this.num = num;
	}	
	
	public String getMessage()
	{
		return arr[this.num];
	}

}

//������ ���
class LoginData2
{
	String id, pw, name;

	LoginData2(String id, String pw, String name) 
	{
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	boolean logChk(String id, String pw)
	{
		return this.id.equals(id) && this.pw.equals(pw);
	}
}

public class LoginMain2 
{	
	//������ ���
	static String getStr()
	{
		String res = "";
		while(true)
		{
			try
			{
				char buf;
				buf = (char)System.in.read();
				
				if(buf == '\r')
				{	
					System.in.read();
					break;
				}
				res += buf;
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		return res;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		LoginData2 [] arr = {new LoginData2("aaa", "111", "�̸�1"),
							new LoginData2("bbb", "222", "�̸�2"),
							new LoginData2("ccc", "333", "�̸�3"),
							new LoginData2("ddd", "444", "�̸�4"),
							new LoginData2("eee", "555", "�̸�5")};
		
		while(true)
		{
			try 
			{
				System.out.print("id : ");
				String id = getStr();
				
				if(id.equals("")) throw new LoginExcep(0);
				
				LoginData2 chk = null;
				for (LoginData2 dd : arr) 
				{
					if(dd.id.equals(id))
					{
						chk = dd;
					}
				}
				
				if(chk == null) throw new LoginExcep(1);
				
				System.out.print("pw : ");
				String pw = getStr();
				
				
				if(chk.pw.equals(pw)) throw new LoginExcep(2);
				System.out.println(chk.name + "�α��� ����!");
				break;
			} catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}

	}
}
