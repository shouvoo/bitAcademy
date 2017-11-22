package oops;

class SmartMethod
{
	String name;
	int price;
	
	int [] parts;
	
	void cal()
	{
		for (int pp : parts) 
		{
			price += pp;
		}
		
		price *= 1000;
		
		print();
	}
	
	void print()
	{
		System.out.println(name + "  :  " + price);
	}
}

public class SmartMethodMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SmartMethod sm = new SmartMethod();
		sm.name = "°¶·°½Ã";
		sm.parts = new int [] {100, 50, 40};
		
		/*for (int pp : sm.parts) 
		{
			sm.price += pp;
		}
		
		sm.price *= 1000;
		
		System.out.println(sm.name + "  :  " + sm.price);*/
		sm.cal();
	//	sm.print();
	}
}
