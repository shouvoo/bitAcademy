package inter_p;

interface MeetMom2
{
	void rice(String str);
	void zsr(String str);
}

interface MeetTeacher2
{
	void teaching(String str);
	void zsr(String str);
}

interface MeetFrined2
{
	void play(String str);
	void game(String str);
}

interface InterfaceExtends extends MeetMom2, MeetTeacher2, MeetFrined2
{	
	
}

class MeetMomImpl implements MeetMom2
{
	@Override
	public void rice(String str) 
	{
		// TODO Auto-generated method stub
		System.out.println(str);
	}
	
	@Override
	public void zsr(String str) 
	{
		// TODO Auto-generated method stub
		System.out.println(str);
	}
}

class MeetTeacherImpl extends MeetMomImpl implements MeetTeacher2
{
	@Override
	public void teaching(String str) 
	{
		// TODO Auto-generated method stub
		System.out.println(str);
	}
}

class MeetFriendImpl extends MeetTeacherImpl implements MeetFrined2
{
	@Override
	public void play(String str) 
	{
		// TODO Auto-generated method stub
		System.out.println(str);
	}
	
	@Override
	public void game(String str) 
	{
		// TODO Auto-generated method stub
		System.out.println(str);
	}
}

class MeetTotal extends MeetFriendImpl implements InterfaceExtends
{
	/*String name;
	public MeetTotal(String name) 
	{
		// TODO Auto-generated constructor stub
		MeetMom2 mm2 = this;
		MeetTeacher2 mt2 = this;
		MeetFrined2 mf = this;
		
		mm2.rice(name + "���ִ� ������ũ �ּ���");
		mm2.zsr("�ܼҸ� �׸�~~");
		
		mt2.teaching("�밡���׸�!! �Ƿ��� �����ּ���");
		mt2.zsr("�밡��!! �밡��!! �밡��!!  �׳��� �밡��!!!!");
		
		mf.game(name + "��Ÿ �������� �Ϸ�����~");
		mf.play(name + "��Ÿ���� �Ŀ� ����~~");
	}*/
}

public class InterfaectExtendsMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		MeetTotal mt = new MeetTotal("�Ѻ�");
		MeetTotal mt = new MeetTotal();
		
		MeetMom2 mm2 = mt;
		MeetTeacher2 mt2 = mt;
		MeetFrined2 mf = mt;
		
		mm2.rice("���ִ� ������ũ �ּ���");
		mm2.zsr("�ܼҸ� �׸�~~");
		
		mt2.teaching("�Ƿ��� �����ּ���");
		mt2.zsr("���� �ָ�~~");
		
		mf.game("��Ÿ �������� �Ϸ�����~");
		mf.play("��Ÿ���� �Ŀ� ����~~");
	}

}
