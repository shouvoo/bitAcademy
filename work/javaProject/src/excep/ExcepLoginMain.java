package excep;

import java.io.IOException;

class ExtendsExcep extends Exception
{
	String [] arr = {"���̵� ����", "��й�ȣ ����", "���̵� ��й�ȣ ����ġ"};
	int num;
	
	public ExtendsExcep(String msg) 
	{
		super(msg);
	}
	
	public ExtendsExcep(int num) 
	{
		this.num = num;
	}
	
	public String getMessage()
	{
		return arr[num];
	}
}

class LogData
{
	String id, pw, name;

	LogData(String id, String pw, String name) 
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

public class ExcepLoginMain 
{

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
		
		LoginData [] arr = {new LoginData("aaa", "111", "�̸�1"),
							new LoginData("bbb", "222", "�̸�2"),
							new LoginData("ccc", "333", "�̸�3"),
							new LoginData("ddd", "444", "�̸�4"),
							new LoginData("eee", "555", "�̸�5")};
		
		while(true)
		{
			System.out.print("id : ");
			String id = getStr();
			
			if(id == "")
			{
				try 
				{
					
					throw new ExtendsExcep(0);
				} catch (Exception e) 
				{
					System.out.println(e.getMessage());
					continue;
				}
			} else 
			{
				System.out.println(id);
			}
			
			System.out.print("pw : ");
			String pw = getStr();
			
			if(pw == "")
			{
				try 
				{
					
					throw new ExtendsExcep(1);
				} catch (Exception e) 
				{
					System.out.println(e.getMessage());
					continue;
				}
			} else 
			{
				System.out.println(pw);
			}

			try 
			{
				LoginData chk = null;
				for (LoginData dd : arr) 
				{
					if(dd.logChk(id, pw)) 
					{
						chk = dd;
					}
				}
				
				if(chk == null) throw new ExtendsExcep(2);
				System.out.println(chk.name + "�α��� ����!");
				break;
			} catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}

	}

}
