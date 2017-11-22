package oops;


/*//��ü �ڵ��� ����Ÿ��� ����ϼ���

// �ڵ��� Ŭ���� - ����Ÿ�


// �λ꿩�� - �ؿ��, ���ȸ�, �ڰ�ġ����
     300        20     10        10
//��õ���� - �Ҿ簭, �߰���, ��õȣ, 
     200        10    20      30
//���� ���� - ������, ������, ������, ������, ��������, ���� ���, ������
     200         10   10         5      15       10       20         10
//���� ���� - ������, ������, ������, ������, ������, ��������
                 5      7       5      10      20      15

//���� ���� ---> �ؿ��,     ��õȣ,       ������,  ������,       ������
                 20 + 300 +   30 +   200 +  5  +    15 +   200 +  7*/
class City
{
	static int total;
	static String now="�λ�", res="";
	
	
	String name;
	int dist;
	SubCity [] subCity;
	
	void sch(String sub)
	{
		for (SubCity city : subCity) {
			if(city.name == sub)
			{
				total+= city.dist;
				
				if(now!=name)
				{
					total+= dist;
					now=name;	
				}
				res += sub+"("+now+")"+total+"\t";
				System.out.println(res);
			}
			
		}
	}
	

	public City(String name, int dist, SubCity [] subCity) {//wide
		
		this.name = name;
		this.dist = dist;
		this.subCity = subCity;
	}
	
}

class SubCity{
	String name;
	int dist;
	
	SubCity(String name, int dist) {//subCity
		
		this.name = name;
		this.dist = dist;
	}
}

public class TravelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		City [] wide = {
				new City("�λ�",0, new SubCity[]{
					new SubCity("�ؿ��",20),
					new SubCity("���ȸ�",10),
					new SubCity("�ڰ�ġ����",10)
				} ),
				
				new City("��õ",300, new SubCity[]{
						new SubCity("�Ҿ簭",10),
						new SubCity("�߰���",20),
						new SubCity("��õȣ",30)
					} ),
				new City("����",200, new SubCity[]{
						new SubCity("������",10),
						new SubCity("������",10),
						new SubCity("������",5),
						new SubCity("������",15)
					} ),
				new City("����",200, new SubCity[]{
						new SubCity("������",5),
						new SubCity("������",7),
						new SubCity("������",5),
						new SubCity("������",10),
						new SubCity("������",20)
					} )
		};
		
		String [] tour = {"�ؿ��","��õȣ","������","������","������"};
		
		for (String tt : tour) {
			for (City ww : wide) {
				ww.sch(tt);
			}
		}
	}

}
