package dynamic;

class CarPerformance
{
	String carName;
	String res;
	CarPerformance(String carName) 
	{
		super();
		this.carName = carName;
	}
	
	void cal()
	{
		
	}
	
	void print()
	{
		cal();
		
		String str = "";
		str += this.carName + "\t" + res;
		System.out.println(str);
	}
}

class SportsCar extends CarPerformance
{
	double [] averageNumArr = {0.5, 0.2, 0.3};
	int [] score;
	
	SportsCar(int speed, int eff, int design) 
	{
		super("람보르기니");
		score = new int [] {speed, eff, design};
		// TODO Auto-generated constructor stub
	}
	
	void cal()
	{
		res = "";
		for (int i = 0; i < score.length; i++) 
		{
			res += (int)(score[i] + averageNumArr[i]) + "\t"; 
		}
	}
	
}

class TruckCar extends CarPerformance
{
	double [] averageNumArr = {0.6, 0.4};
	int [] score;
	
	TruckCar(int eff, int cargo) 
	{
		super("볼보트럭");
		score = new int [] {eff, cargo};
		// TODO Auto-generated constructor stub
	}
	
	void cal()
	{
		res = "";
		for (int i = 0; i < score.length; i++) 
		{
			res += (int)(score[i] + averageNumArr[i]) + "\t"; 
		}
	}
	
}


class VansCar extends CarPerformance
{
	double [] averageNumArr = {0.15, 0.35, 0.5};
	int [] score;
	
	VansCar(int speed, int eff, int passengers) 
	{
		super("봉고");
		score = new int [] {speed, eff, passengers};
		// TODO Auto-generated constructor stub
	}
	
	void cal()
	{
		res = "";
		for (int i = 0; i < score.length; i++) 
		{
			res += (int)(score[i] + averageNumArr[i]) + "\t"; 
		}
	}
	
}

public class CarPerformanceMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CarPerformance [] arr = {new SportsCar(100, 30, 95), 
								 new TruckCar(50, 95), 
								 new VansCar(50, 65, 85)};
		for (CarPerformance cpf : arr) 
		{
			cpf.print();
		}
	}

}
