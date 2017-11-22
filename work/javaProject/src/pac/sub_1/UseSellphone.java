package pac.sub_1;
import pac.sub_1.MakeSellphone;
import pac.sub_2.SellPhoneParts;

public class UseSellphone 
{
	
	public UseSellphone() 
	{
		// TODO Auto-generated constructor stub
		SellPhoneParts spp = new SellPhoneParts();
		MakeSellphone msp = new MakeSellphone();		
		System.out.println(spp.print());
		System.out.println(msp.print());
		System.out.println(print());
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		new UseSellphone();
	}
	
	String setPicture()
	{
		return "사진찍기";
	}
	
	String setCall()
	{
		return "전화하기";
	}
	
	String setBoom()
	{
		return "폭발하자~!!";
	}
	
	 String print()
	{	
		String res = setPicture() + "\t" + setCall() + "\t" + setBoom() + "\t";
		res += "사용 완료!!";
		return res;
	}

}
