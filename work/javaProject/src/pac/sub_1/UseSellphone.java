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
		return "�������";
	}
	
	String setCall()
	{
		return "��ȭ�ϱ�";
	}
	
	String setBoom()
	{
		return "��������~!!";
	}
	
	 String print()
	{	
		String res = setPicture() + "\t" + setCall() + "\t" + setBoom() + "\t";
		res += "��� �Ϸ�!!";
		return res;
	}

}
