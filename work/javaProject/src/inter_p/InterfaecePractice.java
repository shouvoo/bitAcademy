package inter_p;

interface MeetMom
{
	String meethMom();
}

interface MeetTeacher
{
	void meethTeacher();
}

interface MeetFriend
{
	void meethFriend();
}

class Mir implements MeetMom, MeetTeacher, MeetFriend
{
	@Override
	public String meethMom() 
	{
		// TODO Auto-generated method stub
		//System.out.println("�� ���, �ܼҸ���");
		return "�� ���, �ܼҸ���";
	}
	
	@Override
	public void meethTeacher() 
	{
		// TODO Auto-generated method stub
		System.out.println("������ �ּ���, �ܼҸ���");
	}
	
	@Override
	public void meethFriend() 
	{
		// TODO Auto-generated method stub
		System.out.println("�����, ��������");
	}
	
}

public class InterfaecePractice 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Mir mir = new Mir();
		System.out.println(mir.meethMom());
		mir.meethTeacher();
		mir.meethFriend();
	}

}
