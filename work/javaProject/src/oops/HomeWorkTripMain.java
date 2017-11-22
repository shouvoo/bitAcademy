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
		
		Trip [] tt = {	new Trip(0, "�λ꿩��", new String [] {"�ؿ��", "���ȸ�", "�ڰ�ġ����"},
								new int [] {20, 10, 10}),
						new Trip(300, "��õ����", new String [] {"�Ҿ簭", "�߰���", "��õȣ"},
								new int [] {10, 20, 30}),
						new Trip(200, "��������", new String [] {"������", "������", "������", "������", "��������", "�������", "������"},
								new int [] {10, 15, 5, 15, 10, 20, 10}),
						new Trip(200, "��������", new String [] {"�׽���", "������", "������", "������", "������", "��������"},
								new int [] {5, 7, 5, 10, 20, 15})};
		
		String [][] tripRoad = {{"�ؿ��", "���ȸ�"}, 
								{"�Ҿ簭", "�߰���"}, 
								{"������", "������", "������"}, 
								{"�׽���", "������", "��������"}};
		
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
