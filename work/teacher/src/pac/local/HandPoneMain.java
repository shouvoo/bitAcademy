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
				"�ⷡ��7", 
				new Camera("����ī�޶�", 1500), 
				new Mic("��������ũ", "�������"), 
				new Battery("�θ�����", 100));
		
		s7.print();
		s7.pic("��ģ");
	}

}
