package oops;

class Trip
{
	static int baseDistance;
	String [] townArr;
	String [] tripList;
	int [] distanceArr;
	int [] townDistanceArr;
	String destination;
	
	public Trip(int baseDistance, String destination, String [] townArr, int [] distanceArr)
	{
		this.destination = destination;
		this.baseDistance = baseDistance;
		this.townArr = townArr;
		this.distanceArr = distanceArr;
	}
	
	void setTripList(String [] tripList)
	{
		
		this.townDistanceArr = new int [tripList.length];
		this.tripList = tripList;
		cal();
	}
	
	void cal()
	{
		for (int i = 0; i < this.tripList.length; i++) 
		{
			for (int j = 0; j < this.townArr.length; j++) 
			{
				if(this.tripList[i] == this.townArr[j])
				{
					this.townDistanceArr[i] = this.distanceArr[j];
				}
			}
		}
	}
	
	void returnTown()
	{
		String res = "";
		for (String tl : this.tripList) 
		{
			res += tl + "-->";
		};
		System.out.print(res);
	}
	
	void returnDistance()
	{
		
		String res = "";
		for (int td : townDistanceArr) 
		{
			res += td + "\t";
		};
		
		System.out.print(res);
	}
}


public class HomeWorkTripMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Trip [] tt = {	new Trip(0, "부산여행", new String [] {"해운대", "광안리", "자갈치시장"},
								new int [] {20, 10, 10}),
						new Trip(300, "춘천여행", new String [] {"소양강", "닭갈비", "춘천호"},
								new int [] {10, 20, 30}),
						new Trip(200, "수원여행", new String [] {"수원성", "수원산", "수원집", "수원강", "수원공항", "수원운동장", "수원산"},
								new int [] {10, 15, 5, 15, 10, 20, 10}),
						new Trip(200, "대전여행", new String [] {"액스포", "대전역", "대전강", "대전집", "대전산", "대전공항"},
								new int [] {5, 7, 5, 10, 20, 15})};
		
		String [][] tripRoad = {{"해운대", "광안리"}, 
								{"소양강", "닭갈비"}, 
								{"수원성", "수원산", "수원집"}, 
								{"액스포", "대전강", "대전공항"}};
		
		for (int i = 0; i < tt.length; i++) 
		{
			tt[i].setTripList(tripRoad[i]);	
			tt[i].returnTown();
		}
		System.out.println();
		for (int i = 0; i < tt.length; i++) 
		{
			tt[i].setTripList(tripRoad[i]);	
			tt[i].returnDistance();
		}
		System.out.println();
		
		int plusDistance = 0;
		for (int i = 0; i < tt.length; i++) 
		{
			if(i > 0) plusDistance += tt[i].baseDistance;
			
			for (int j = 0; j < tt[i].townDistanceArr.length; j++) 
			{
				plusDistance += tt[i].townDistanceArr[j];
				System.out.print(plusDistance + "\t"); 
			}
		}


	}

}
