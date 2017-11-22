package homeWork_20170914;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

class Theater
{
	String printStr = "";
	int seat = 30;
	int reservedCount = 0;
	int reservedSet = 0;
	TreeMap<Integer, String> seatMap = new TreeMap<>();
	
	public Theater() 
	{
		makeSeat();
	}
	
	private void makeSeat()
	{
		for (int i = 0; i < seat; i++) 
		{
			seatMap.put(i, "activation");
		}
	}
	
	public synchronized int remainingSeat()
	{
		int seat = 0;
		
		try
		{
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return seat = (int)(Math.random() * 29) + 1;	
	}
	
	public void editReserved(String name, ArrayList<Integer> seats)
	{
		printStr += name;
		
		for (Integer s : seats) 
		{
			printStr += "\t 좌석" + s + " 번";
		}
		
		printStr += "\n";
	}
	
	public void print()
	{
		System.out.println();
		System.out.println();
		System.out.println("*****   좌석 예약 완료   *****");
		System.out.println(printStr);
	}

}
class Reserved extends Thread
{
	Theater theater;
	String reservedName;
	int reservedSeats;
	ArrayList<Integer> seatList = new ArrayList<>();
	
	public Reserved(Theater theater, String reservedName) 
	{
		++theater.reservedSet;
		this.theater = theater;
		this.reservedName = reservedName;
		reservedSeats = (int)(Math.random() * 5) + 1;
		System.out.println(reservedName + " : 요청 좌석 숫자 : " + reservedSeats);
	}	
	
	
	public void run() 
	{
		while(true)
		{
			int seat = theater.remainingSeat();
			
			if(theater.seatMap.get(seat) != "activation")
			{
				continue;
			} else 
			{
				theater.seatMap.put(seat, "reserved");
				
				if(this.reservedSeats > this.seatList.size()) 
				{
					this.seatList.add(seat);
					
				} else 
				{
					
					if(this.reservedSeats == this.seatList.size()) 
					{
						theater.editReserved(this.reservedName, this.seatList);
						break;
					}
				}
			}
			
		}
		
		++theater.reservedCount;
		if(theater.reservedCount == theater.reservedSet) theater.print();
	
	}

}

public class HomeWorkMain
{

	public static void main(String[] args)
	{		
		Theater theater = new Theater();
		ArrayList<Reserved> reservedList = new ArrayList<>();
		reservedList.add(new Reserved(theater, "예약자-1"));
		reservedList.add(new Reserved(theater, "예약자-2"));
		reservedList.add(new Reserved(theater, "예약자-3"));
		reservedList.add(new Reserved(theater, "예약자-4"));
		reservedList.add(new Reserved(theater, "예약자-5"));
		
		for (Reserved reserved : reservedList) 
		{
			reserved.start();
		}
	}

}
