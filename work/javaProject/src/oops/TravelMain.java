package oops;

class City
{
	static int total;
	static String now = "�λ�", res="";
	City [] subCity;
	String name;
	int dist;
	
	void sch(String sub)
	{
		
		for (City city : subCity) 
		{
			if(city.name == sub)
			{
				total += city.dist;
				
				if(now != name)
				{
					total += dist;
					now = name;
					
				}
				res += sub+"("+now+")" + total + "\t";
				System.out.println(res + "\t");
			}
			
			
		}
	}
	
	void print()
	{
		System.out.println(res + total+ "\t");
	}
	
	
	
	public City(String name, int dist)
	{
		this.name = name;
		this.dist = dist;
	};
	
	public City(String name, int dist, City [] subCity) 
	{

		this.name = name;
		this.dist = dist;
		this.subCity = subCity;
	};
	
	
	
}

public class TravelMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		City [] wide = {new City("�λ�", 5, new City[] {
						new City("�ؿ��", 10),
						new City("���ȸ�", 15)}),
				
						new City("��õ����", 20, new City[] {
						new City("�Ҿ簭", 25),
						new City("�߰���", 30)}),
				
						new City("������", 5, new City[] {
						new City("������", 20),
						new City("������", 10),
						new City("������", 10)}),
				
						new City("�׽���", 5, new City[] {
						new City("������", 20),
						new City("������", 10),
						new City("������", 10),
						new City("������", 10)})};
						
		String [] tour = {"�ؿ��", "�Ҿ簭", "������", "������"};
		
		for (String tt : tour) 
		{
			for (City ww : wide) 
			{
				ww.sch(tt);
			}
			
		}
	}

}
