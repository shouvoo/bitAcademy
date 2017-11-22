package pac.sub_1;
import pac.sub_2.SellPhoneParts;

public class MakeSellphone 
{
	public String country = "한국 LG";
	String cameraParts, micParts, betteryParts;
	SellPhoneParts sp;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
	}
	
	public MakeSellphone() 
	{
		// TODO Auto-generated constructor stub
		sp = new SellPhoneParts();
		camAssembly();
		micAssembly();
		betteryAssembly();
		//print();
	}
	
	void camAssembly()
	{
		this.cameraParts = sp.cameraParts();
	}
	
	void micAssembly()
	{
		this.micParts = sp.micParts();
	}
	
	void betteryAssembly()
	{
		this.betteryParts = sp.betteryParts();
	}
	
	public String print()
	{
		String res = "핸드폰 제조국 : " + country + "\t"; 
		res += cameraParts + "\t" + micParts + "\t" + betteryParts + "\t";
		res += "부품조립 완료!!";
		return res;
	}

}
