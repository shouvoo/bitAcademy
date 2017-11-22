package lamda;

import java.util.HashMap;

interface Notice
{
	void execute(Object obj);
}

public class LamdaNoticeMain
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMap<String, Notice> map = new HashMap<>();
		Notice list = (obj)->{System.out.println("Notice list : " + obj);};
		map.put("list", list);
		map.put("detail", (obj)->{System.out.println("Notice detail : " + obj);});
		map.put("insert", (obj)->{System.out.println("Notice insert : " + obj);});
		
		map.get("list").execute(11);
	}

}
