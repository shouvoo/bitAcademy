package dynamic;

class SellPhone
{
	String call, takePic, internet, returnStr;
	
	SellPhone() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	void calling()
	{
	}
	
	void takePicture()
	{
	}
	
	void useInternet()
	{
	}
	
	void print()
	{
		System.out.println(returnStr);
	}
}

class LgV30 extends SellPhone
{
	
	String call, takePic, internet;
	public LgV30(String call, String takePic, String internet) 
	{
		// TODO Auto-generated constructor stub
		this.call = call;;
		this.takePic = takePic;
		this.internet = internet;
	}
	
	void calling()
	{
		returnStr = this.call;
	}
	
	void takePicture()
	{
		returnStr = this.takePic;
	}
	
	void useInternet()
	{
		returnStr = this.internet;
	}
}

public class MakeSellPhoneMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SellPhone sp = new LgV30("Lg v30 통화", "Lg v30 사진찍어줘", "Lg v30 인터넷 서핑하자");
		sp.calling();
		sp.print();
	}

}
