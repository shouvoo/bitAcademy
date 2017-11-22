package oops;

class SmartPhone
{
	String camera = "일반 카메라", ear = "일반 이어폰";
}

public class SmartPhoneMain 
{

	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SmartPhone [] arr = {new SmartPhone(), new SmartPhone()};
		
		arr[0].camera = "광학 카메라";
		arr[1].ear = "블루투스 이어폰";
		
		arr[0] = new SmartPhone();
		
		for (SmartPhone sp : arr) 
		{
			System.out.println(sp + "  :  " + sp.camera + "  :  " + sp.ear);
		}
	}

}
