package homeWork_20170811;
import homeWork_20170811.BasicStudent;
import homeWork_20170811.BasicUniversity;
import homeWork_20170811.ArtUniversity;

public class HomeWorkMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BasicStudent [] bsArr = {new BasicStudent("�극��", "��", "�Ϲ�", new int [] {78, 87, 61, 53, 57, 73}),
									new BasicStudent("�����", "��", "�Ϲ�", new int [] {98, 87, 91, 98, 78, 38}),
									new BasicStudent("����", "��", "Ư������", new int [] {38, 67, 51, 38, 78, 88}),
									new BasicStudent("�����", "��", "����", new int [] {54, 76, 52, 53, 73, 93}),
									new BasicStudent("����", "��", "���ü", new int [] {99, 85, 95, 93, 53, 73}),
									new BasicStudent("�ڳڸ�", "��", "����", new int [] {95, 63, 74, 93, 43, 53}),
									new BasicStudent("Ű�ƴ�", "��", "�ܱ���", new int [] {25, 64, 95, 55, 75, 8}),
									new BasicStudent("������", "��", "���ü", new int [] {89, 98, 99, 35, 83, 73}),
									new BasicStudent("���ϵ�", "��", "Ư������", new int [] {63, 85, 77, 73, 83, 43}),
									new BasicStudent("��ư", "��", "�ܱ���", new int [] {96, 74, 85, 83, 93, 73})};
		
		
		
		BasicUniversity [] bu = {new BasicUniversity(), 
				                  new ArtUniversity(),
				                  new ArmyUniversity(),
				                  new HanbitUniversity()};
		PassResult pr = new PassResult();
		
		for (int i = 0; i < bu.length; i++) 
		{	
			System.out.println();
			
			for (int j = 0; j < bsArr.length; j++) 
			{
				bu[i].init(bsArr[j]);
				pr.init(bu[i], j);
			}
			System.out.println();
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		}
		
	}

}
