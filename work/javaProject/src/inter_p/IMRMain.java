package inter_p;

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

class IMRImpl implements Mom, Teacher, Honey
{
	String name;
	public IMRImpl(String name) 
	{
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
	}
	
	
	@Override
	public void bob(String bb) 
	{
		// TODO Auto-generated method stub
		System.out.println(name + "���� " + bb + "�� �����ּ���");
		
	}
	
	@Override
	public void teaching(String bb) 
	{
		// TODO Auto-generated method stub
		System.out.println(name + "���� " + bb + "�� ������ �ּ���");
		
	}
	
	@Override
	public void play(String bb) 
	{
		// TODO Auto-generated method stub
		System.out.println(name + "�� " + bb + "�ϸ� ����");
		
	}
	
	@Override
	public void game(String title) 
	{
		// TODO Auto-generated method stub
		System.out.println(name + "���� " + title + "��������");
		
	}
	
	@Override
	public void zsr() 
	{
		// TODO Auto-generated method stub
		System.out.println(name + "���� �ܼҸ�");
		
	}
}

public class IMRMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		IMRImpl imr = new IMRImpl("�̸̹�");
		
		 Honey hh = imr;
		 Mom mm = imr;
		 Teacher tt = imr;
		 
		 hh.game("NBA");
		 hh.play("��ȭ");
		 mm.bob("���");
		 mm.zsr();
		 tt.teaching("java");
		 tt.zsr();
		
	}

}