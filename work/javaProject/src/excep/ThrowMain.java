package excep;

public class ThrowMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		try 
		{
			/*Exception ex = new Exception("������ ����");
			throw ex;*/
			throw new Exception("�޷� �޷�");
			//System.out.println("������ ����� �Ұ���");
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
