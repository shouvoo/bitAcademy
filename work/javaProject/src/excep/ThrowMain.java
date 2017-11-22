package excep;

public class ThrowMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		try 
		{
			/*Exception ex = new Exception("에러다 에러");
			throw ex;*/
			throw new Exception("메로 메로");
			//System.out.println("에러후 출력은 불가능");
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
