package oops;

class City
{
	static int total;
	static String now = "부산", res="";
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
		City [] wide = {new City("부산", 5, new City[] {
						new City("해운대", 10),
						new City("광안리", 15)}),
				
						new City("춘천여행", 20, new City[] {
						new City("소양강", 25),
						new City("닭갈비", 30)}),
				
						new City("수원성", 5, new City[] {
						new City("수원산", 20),
						new City("수원집", 10),
						new City("수원강", 10)}),
				
						new City("액스포", 5, new City[] {
						new City("대전역", 20),
						new City("대전강", 10),
						new City("대전집", 10),
						new City("대전산", 10)})};
						
		String [] tour = {"해운대", "소양강", "수원산", "대전산"};
		
		for (String tt : tour) 
		{
			for (City ww : wide) 
			{
				ww.sch(tt);
			}
			
		}
	}

}
