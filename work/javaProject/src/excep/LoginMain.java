package excep;

import java.io.IOException;

//������ ���
class LoginData
{
	String id, pw, name;

	LoginData(String id, String pw, String name) 
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

public class LoginMain 
{
	static String [] idArr = {"aaa", "bbb", "ccc", "ddd", "eee"};
	static String [] pwArr = {"111", "222", "333", "444", "555"};
	
	
	/*static String getStr()
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
		while(true)
		{
			try 
			{
				System.out.print("id : ");
				String id = getStr();
				
				System.out.print("pw : ");
				String pw = getStr();
				
				if(!id.equals(pw))
				{
					throw new Exception("�α��� ����");
				}
				
				System.out.println(id + "�α��� ����!");
				
				break;
			} catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}

	}*/
	
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
		
		LoginData [] arr = {new LoginData("aaa", "111", "�̸�1"),
							new LoginData("bbb", "222", "�̸�2"),
							new LoginData("ccc", "333", "�̸�3"),
							new LoginData("ddd", "444", "�̸�4"),
							new LoginData("eee", "555", "�̸�5")};
		
		while(true)
		{
			try 
			{
				System.out.print("id : ");
				String id = getStr();
				
				System.out.print("pw : ");
				String pw = getStr();
				
				LoginData chk = null;
				for (LoginData dd : arr) 
				{
					if(dd.logChk(id, pw)) 
					{
						chk = dd;
					}
				}
				if(chk == null) throw new Exception("�α��� ����");
				System.out.println(chk.name + "�α��� ����!");
				break;
			} catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}

	}
	
	/*//�����
	 * static int cnt = 0;
	
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
	
	static int getId(String name)
	{
		
		int id = -1;
		
		for (int i = 0; i < idArr.length; i++) 
		{			
			if(name.equals(idArr[i])) id = i;
		}
		
		return id;
	}
	
	static String getPw(String name)
	{
		
		String id = "";
		
		for (int i = 0; i < pwArr.length; i++) 
		{			
			if(name.equals(pwArr[i])) id = pwArr[i];
		}
		
		return id;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		aaa:while(true)
		{
			try 
			{
				System.out.print("id : ");
				String id = getStr();
				
				if(getId(id) == -1) throw new Exception("���̵� Ȯ���ϼ���");
				
				System.out.print("pw : ");
				String pw = getStr();
				
				if(!pw.equals(getPw(pwArr[getId(id)])))
				{
					throw new Exception("�α��� ����");
				}
				
				System.out.println(id + "�α��� ����!");
				cnt++;
				
				if(cnt > 4) break aaa;
			} catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}

	}*/

}
