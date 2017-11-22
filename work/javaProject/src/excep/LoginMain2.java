package excep;

import java.io.IOException;


class LoginExcep extends Exception
{
	String [] arr = {"id가 없습니다", "id에러", "pw에러"};
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

//선생님 방법
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
	//선생님 방법
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
		
		LoginData2 [] arr = {new LoginData2("aaa", "111", "이름1"),
							new LoginData2("bbb", "222", "이름2"),
							new LoginData2("ccc", "333", "이름3"),
							new LoginData2("ddd", "444", "이름4"),
							new LoginData2("eee", "555", "이름5")};
		
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
				System.out.println(chk.name + "로그인 성공!");
				break;
			} catch (Exception e) 
			{
				System.out.println(e.getMessage());
			}
		}

	}
}
