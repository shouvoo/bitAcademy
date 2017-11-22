package pac.local;

import pac.abroad.Battery;
import pac.abroad.Camera;
import pac.abroad.Mic;

class HandPhone{
	
	String name;
	Camera cam;
	Mic mic;
	Battery bat;
	

	public HandPhone(String name, Camera cam, Mic mic, Battery bat) {
		super();
		this.name = name;
		this.cam = cam;
		this.mic = mic;
		this.bat = bat;
	}

	void pic(String target)
	{
		System.out.println(
				name+":"+
				cam.picture(target));
	}
	
	void print()
	{
		String res = name+","+
				cam.str()+","+
				mic.str()+","+
				bat.str();
		System.out.println(res);
	}
}

public class HandPoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HandPhone s7 = new HandPhone(
				"기래기7", 
				new Camera("광학카메라", 1500), 
				new Mic("무선마이크", "블루투스"), 
				new Battery("인마살상용", 100));
		
		s7.print();
		s7.pic("여친");
	}

}
