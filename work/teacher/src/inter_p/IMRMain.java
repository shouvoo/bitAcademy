package inter_p;
/// 엄마를 만날때 - 밥 줘요, 잔소리좀 
/// 선생님 만날때 - 가르쳐주세요, 잔소리좀
/// 남친을 만날때 - 놀러가자, 게임하자
interface Mom
{
	void bob(String bb);
	void zsr();
}

interface Teacher
{
	void teaching(String bb);
	void zsr();
}

interface Honey
{
	void play(String bb);
	void game(String title);
}

class IMRImpl implements Mom, Teacher, Honey{
	
	String name;

	public IMRImpl(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void bob(String bb) {
		// TODO Auto-generated method stub
		System.out.println(name+"에게 "+bb+"을 차려주세요");
	}
	
	@Override
	public void teaching(String bb) {
		// TODO Auto-generated method stub
		System.out.println(name+"에게 "+bb+"을 가르쳐 주세요");
	}
	
	@Override
	public void zsr() {
		System.out.println(name+"에게 잔소리좀 ");
		
	}
	
	@Override
	public void game(String title) {
		// TODO Auto-generated method stub
		System.out.println(name+"와 "+title+" 게임하자");	
	}
	
	@Override
	public void play(String bb) {
		// TODO Auto-generated method stub
		System.out.println(name+"랑 "+bb+"하며 놀자");
	}
}

public class IMRMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IMRImpl imr = new IMRImpl("이미르");
		Honey hh= imr;
		Mom mm= imr;
		Teacher tt= imr;
		
		hh.game("NBA");
		hh.play("영화");
		
		mm.bob("김밥");
		mm.zsr();
		
		tt.teaching("java");
		tt.zsr();
	}

}
