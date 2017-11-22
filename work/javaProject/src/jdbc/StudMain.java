package jdbc;

public class StudMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String id = "ccc"; //"' or 1=1 --";
		String pw = "333";
		StudVO one = new StudDAO().detail(id, pw);
		if(one != null)
		{
			one.print();
		} else 
		{
			System.out.println("데이터 없음");
		}
		
		StudVO [] list = new StudDAO().list();
		
		for (StudVO st : list) 
		{
			st.print();
		}
		
	}
}
