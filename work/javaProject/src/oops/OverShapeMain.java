package oops;

class OverShape
{
	String name;
	
	double area, border;
	
	void cal(int w, int h)
	{
		name = "�簢��";
		area = w * h;
		border = (w + h) * 2;
		print();
	}
	
	void cal(int r)
	{
		double pi = 3.141592;
		name = "��";
		area = r * r * pi;
		border = r * pi * 2;
		print();
	}
	
	void print()
	{
		System.out.println(name + " �� ����  : " + area  );
		System.out.println(name + " �� �ѷ�  : " + border  );
	}
}

public class OverShapeMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		OverShape os = new OverShape();
		os.cal(20, 30);
		os.cal(20);
	}

}
































