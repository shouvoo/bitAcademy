package oops;

class SmartPhone
{
	String camera = "�Ϲ� ī�޶�", ear = "�Ϲ� �̾���";
}

public class SmartPhoneMain 
{

	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SmartPhone [] arr = {new SmartPhone(), new SmartPhone()};
		
		arr[0].camera = "���� ī�޶�";
		arr[1].ear = "������� �̾���";
		
		arr[0] = new SmartPhone();
		
		for (SmartPhone sp : arr) 
		{
			System.out.println(sp + "  :  " + sp.camera + "  :  " + sp.ear);
		}
	}

}
