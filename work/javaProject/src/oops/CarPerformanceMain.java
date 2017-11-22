package oops;

class CarPerFormance
{
	String carName;
	double speed;
	double average;
	double persnal;
	double safe;
	double cargo;
	String cargoType;
	String printStr;
	CarPerFormance(int speed, int average)
	{
		carName = "스포츠카";
		this.speed = speed * .6;
		this.average = average * .4;
		printStr = "차종류 : " + carName + " : " + this.speed + " , " + this.average;
	}
	
	CarPerFormance(int speed, int persnal, int safe)
	{
		carName = "승합차";
		this.speed = speed * .6;
		this.persnal = persnal * .3;
		this.safe = safe * .4;
		printStr = "차종류 : " + carName + " : " + this.speed + " , " + 
						this.persnal + " , " + this.safe;
	}
	
	CarPerFormance(int average, int cargo, String cargoType)
	{
		carName = "트럭";
		this.average = average * .5;
		this.cargo = cargo * .5;
		this.cargoType = cargoType;
		printStr = "차종류 : " + carName + " : " + this.average + " , " + 
				this.cargo + " , " + this.cargoType;
	}
	
	void print()
	{
		System.out.println(printStr);
	}
}

public class CarPerformanceMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CarPerFormance [] arr = {new CarPerFormance(280, 15), 
								new CarPerFormance(120, 5, 56),
								new CarPerFormance(8, 100, "바이크")};
		
		for (CarPerFormance carPerFormance : arr) 
		{
			carPerFormance.print();
		}
	}

}
