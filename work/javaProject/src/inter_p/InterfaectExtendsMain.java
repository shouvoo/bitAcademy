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
		
		mm2.rice(name + "맛있는 스테이크 주세요");
		mm2.zsr("잔소리 그만~~");
		
		mt2.teaching("노가리그만!! 실력을 높여주세요");
		mt2.zsr("노가리!! 노가리!! 노가리!!  그놈의 노가리!!!!");
		
		mf.game(name + "스타 리마스터 하러가자~");
		mf.play(name + "스타한판 후에 한잔~~");
	}*/
}

public class InterfaectExtendsMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//		MeetTotal mt = new MeetTotal("한빛");
		MeetTotal mt = new MeetTotal();
		
		MeetMom2 mm2 = mt;
		MeetTeacher2 mt2 = mt;
		MeetFrined2 mf = mt;
		
		mm2.rice("맛있는 스테이크 주세요");
		mm2.zsr("잔소리 그만~~");
		
		mt2.teaching("실력을 높여주세요");
		mt2.zsr("자자 주목~~");
		
		mf.game("스타 리마스터 하러가자~");
		mf.play("스타한판 후에 한잔~~");
	}

}
