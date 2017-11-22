package excep;

import java.io.IOException;

class LoginExcep extends Exception{
	
	String [] arr = {"id°¡ ¾ø½À´Ï´Ù.","id ¿¡·¯", "pw ¿¡·¯"};
	int num;
	public LoginExcep(int num) {
		super();
		this.num = num;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return arr[num];
	}
	
}

class LoginData{
	String id, pw, name;

	public LoginData(String id, String pw, String name) {
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

public class LoginMain {

	static String getStr()
	{
		String res="";
		while(true)
		{
			
			try {
				char buf;
				buf = (char)System.in.read();
				if(buf=='\r')
				{
					System.in.read();
					break;
				}
				
				res += buf;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginData [] arr = {
				new LoginData("aaa","11", "Çöºó"),
				new LoginData("bbb","22", "¿øºó"),
				new LoginData("ccc","33", "ÀåÈñºó"),
				new LoginData("ddd","44", "¹Ì½ºÅÍºó"),
				new LoginData("eee","55", "°ñºó")
				
		};
		
		
		
		while(true) {
			try {
				System.out.print("id:");
				String id=getStr();
				
				if(id.equals(""))
					throw new LoginExcep(0);
				
				LoginData chk = null;
				for (LoginData dd : arr) {
					
					if(dd.id.equals(id))
						chk = dd;
				}
				
				if(chk==null)
					throw new LoginExcep(1);
				
				System.out.print("pw:");
				String pw=getStr();
				
				if(!chk.pw.equals(pw))
					throw  new LoginExcep(2);
				
				System.out.println(chk.name+" ·Î±×ÀÎ ¼º°ø");
				
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}

	}

}
