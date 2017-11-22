package oops;


/*//전체 자동차 여행거리를 계산하세요

// 자동차 클래스 - 주행거리


// 부산여행 - 해운대, 광안리, 자갈치시장
     300        20     10        10
//춘천여행 - 소양강, 닭갈비, 춘천호, 
     200        10    20      30
//수원 여행 - 수원성, 수원역, 수원집, 수원강, 수원공항, 수원 운동장, 수원산
     200         10   10         5      15       10       20         10
//대전 여행 - 엑스포, 대전역, 대전강, 대전집, 대전산, 대전공항
                 5      7       5      10      20      15

//투어 일정 ---> 해운대,     춘천호,       수원집,  수원강,       대전역
                 20 + 300 +   30 +   200 +  5  +    15 +   200 +  7*/
class City
{
	static int total;
	static String now="부산", res="";
	
	
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
				new City("부산",0, new SubCity[]{
					new SubCity("해운대",20),
					new SubCity("광안리",10),
					new SubCity("자갈치시장",10)
				} ),
				
				new City("춘천",300, new SubCity[]{
						new SubCity("소양강",10),
						new SubCity("닭갈비",20),
						new SubCity("춘천호",30)
					} ),
				new City("수원",200, new SubCity[]{
						new SubCity("수원성",10),
						new SubCity("수원역",10),
						new SubCity("수원집",5),
						new SubCity("수원강",15)
					} ),
				new City("대전",200, new SubCity[]{
						new SubCity("엑스포",5),
						new SubCity("대전역",7),
						new SubCity("대전강",5),
						new SubCity("대전집",10),
						new SubCity("대전산",20)
					} )
		};
		
		String [] tour = {"해운대","춘천호","수원집","수원강","대전역"};
		
		for (String tt : tour) {
			for (City ww : wide) {
				ww.sch(tt);
			}
		}
	}

}
