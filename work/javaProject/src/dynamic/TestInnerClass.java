package dynamic;

import dynamic.CR.InnerCR;

class CR
{
	String jjajang, jjambbong, mandu, bokembab;
	
	class InnerCR
	{
		public InnerCR() 
		{
			// TODO Auto-generated constructor stub
		}
		
		String takeHall(String order)
		{
			return  "홀주문 " + order + " 있습니다";
		}
	}
	
	public void CR() 
	{
		// TODO Auto-generated constructor stub
	}
	
	String takeOut(String order)
	{
		return "주문하신 " + order + " 포장 나왔습니다!!";
	}
}




public class TestInnerClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CR cr = new CR();
		CR.InnerCR ic = cr.new InnerCR();
		
		System.out.println(cr.takeOut("짜장면"));
		System.out.println(ic.takeHall("팔보채"));
	}

}

