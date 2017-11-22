package dynamic;

class MovieReservation
{
	
	private int id;
	private String name;
	private String phoneNumber;
	private String showTime;
	private int seatNumber;
	
	public MovieReservation(int id, String name, String phoneNumber, String showTime, int seatNumber) 
	{
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.showTime = showTime;
		this.seatNumber = seatNumber;
	}
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getPhoneNumber() 
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) 
	{
		this.phoneNumber = phoneNumber;
	}

	public int getId() 
	{
		return id;
	}

	public String getShowTime() 
	{
		return showTime;
	}

	public int getSeatNumber() 
	{
		return seatNumber;
	}

	void print()
	{
		String str = "";
		str += id + "\t" + this.name + "\t" + 
			   this.seatNumber + "\t" + this.showTime + "\t" + 
			   this.phoneNumber;
		
		System.out.print(str);
		System.out.println();
	}
}

class ReservationManage
{
	private MovieReservation [] mr;
	
	public ReservationManage(MovieReservation [] mr) 
	{
		// TODO Auto-generated constructor stub
		this.mr = mr;
	}
	
	void changeReservation(String [][] changeArr)
	{
		int changeId = 0;
		for (int i = 0; i < changeArr.length; i++) 
		{
			for (int j = 0; j < mr.length; j++) 
			{
				if(changeArr[i][0] == mr[j].getName())
				{
					mr[j].setName(changeArr[i][1]);
					changeId = j;
				}
				
				if(changeArr[i][0] == mr[j].getPhoneNumber())
				{
					mr[j].setPhoneNumber(changeArr[i][1]);
					changeId = j;
				}
						
			}
		}
		mr[changeId].print();
	}
}

public class MovieReservationMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub		
		String [] index = {"ID", "이름", "좌석번호", "상영시간", "전화번호"};
		for (int i = 0; i < index.length; i++) 
		{
			System.out.print(index[i] + "\t");
		}
		
		MovieReservation [] mr = {new MovieReservation(32, "브레드", "010-987-3456", "8:30", 45),
									new MovieReservation(53, "졸리", "010-7542-4567", "11:30", 19),
									new MovieReservation(45, "자레드", "010-545-0778", "1:15", 56),
									new MovieReservation(64, "레토", "010-8654-0875", "3:30", 22),
									new MovieReservation(13, "피트", "010-3745-8647", "5:30", 34),
									new MovieReservation(64, "스파이크", "010-5436-4757", "7:30", 12)};
		
		System.out.println();
		for (MovieReservation show : mr) 
		{
			show.print();
		}
		
		System.out.println("===========================예약변경=========================");
		for (int i = 0; i < index.length; i++) 
		{
			System.out.print(index[i] + "\t");
		}
		System.out.println();
		
		ReservationManage manage = new ReservationManage(mr);
		manage.changeReservation(new String [][] {{"브레드", "케빈"}, {"010-987-3456", "011-245-9863"}});
		manage.changeReservation(new String [][] {{"자레드", "스피겔"}});
		manage.changeReservation(new String [][] {{"피트", "파치노"}, {"010-3745-8647", "011-7777-3333"}});
	}

}












