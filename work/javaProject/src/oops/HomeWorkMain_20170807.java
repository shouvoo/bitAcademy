package oops;

class HomeWork_20170807
{
	/*String [] parts;
	String [] finished = {"�º�", "��Ʈ��", "����ũž"};
	
	void init(String [] res)
	{
		this.parts = res;
	}
	
	void print()
	{
		String res = finished[this.parts.length - 1];
		System.out.println(res);
	}*/
	
	String [] finished = {"�º�", "��Ʈ��", "����ũž"};
	String [][] parts;
	
	void init(String [][] res)
	{
		this.parts = res;
	}
	
	void print()
	{
		String res = finished[this.parts.length - 1] + "\t";
		
		for (String [] parts : this.parts) 
		{
			for (String p : parts) 
			{
				res += p + "\t";
			}
		}
		
		System.out.println(res);
	}
}

class HomeWorks_20170807
{	
	/*HomeWork_20170807 init(String [] res)
	{
		HomeWork_20170807 hw = new HomeWork_20170807();
		hw.parts = res;
		return hw;
	}*/
	
	HomeWork_20170807 init(String [][] res)
	{
		HomeWork_20170807 hw = new HomeWork_20170807();
		hw.parts = res;
		return hw;
	}
}

public class HomeWorkMain_20170807 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub.
		/*��ǻ�͸� �����ϼ���

		�º� - ��ü
		��Ʈ�� - ��ü, ���콺
		����ũž - ��ü, ���콺, Ű����

		��ǻ�͸� �����ϼ���
		�º� - ��ü(�̸�, ����)
		��Ʈ�� - ��ü(�̸�, ����), ���콺(�̸�, ����)
		����ũž - ��ü(�̸�, ����), ���콺(�̸�, ����), Ű����(�̸�, ����)
		��ǻ�� - ��ǰ��, ����, ��ǰ � ���������� ���ϰ�
*/
		/*HomeWorks_20170807 hws = new HomeWorks_20170807();
		HomeWork_20170807 [] hw = {hws.init(new String [] {"��ü"}),
									 hws.init(new String [] {"��ü", "���콺"}),
									 hws.init(new String [] {"��ü", "���콺", "Ű����"})};
		
		for (HomeWork_20170807 homeWork : hw) 
		{
			homeWork.print();
		}*/
		
		String [][][] parts = {{{"iPad", "980,000"}},
								{{"lgNodteBook", "1,870,000"},{"iRock", "13,000"}}, 
								{{"tower", "1,300,000"}, {"samsungMouse", "6,000"}, {"iRock", "13,000"}}};
		HomeWorks_20170807 hws = new HomeWorks_20170807();
		HomeWork_20170807 [] hw = {hws.init(parts[0]),
									 hws.init(parts[1]),
									 hws.init(parts[2])};
		
		for (HomeWork_20170807 homeWork : hw) 
		{
			homeWork.print();
		}
	}

}
