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
			return  "Ȧ�ֹ� " + order + " �ֽ��ϴ�";
		}
	}
	
	public void CR() 
	{
		// TODO Auto-generated constructor stub
	}
	
	String takeOut(String order)
	{
		return "�ֹ��Ͻ� " + order + " ���� ���Խ��ϴ�!!";
	}
}




public class TestInnerClass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CR cr = new CR();
		CR.InnerCR ic = cr.new InnerCR();
		
		System.out.println(cr.takeOut("¥���"));
		System.out.println(ic.takeHall("�Ⱥ�ä"));
	}

}

