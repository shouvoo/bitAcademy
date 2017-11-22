package dynamic;

import java.util.Iterator;

class ExtendsTest
{
	
	String carType, carName;
	String cargoType = "";
	int [] items;
	double [] compare;
	double [] scoreArr;
	int score;
	String [] compareType;
	
	void main()
	{
		scoreArr = new double[items.length];
		cal();
		print();
	}
	
	void print()
	{
		System.out.print("\t" + "\t");
		for (String ct : compareType) 
		{
			System.out.print(ct + "\t");
		}
		
		System.out.println();
		
		String res = carType + "\t" + carName + "\t";
		
		for (double i : scoreArr) 
		{
			res += i + "\t";
		};
		
		res += cargoType;
		System.out.println(res);
		System.out.println();
	}
	
	void cal()
	{
		for (int i = 0; i < items.length; i++) 
		{
			scoreArr[i] = items[i] * compare[i];
		}
	}
	
}

class SprotsCar extends ExtendsTest
{
	public SprotsCar(String cn, String ct, int [] arr, double [] ca)
	{
		compareType = new String [] {"�ӵ�", "����"};
		carName = cn;
		carType = ct;
		items = arr;
		compare = ca;
		main();
	}
}

class Vans extends ExtendsTest
{
	public Vans(String cn, String ct, int [] arr, double [] ca)
	{
		compareType = new String [] {"����", "ž���ο�", "������"};
		carName = cn;
		carType = ct;
		items = arr;
		compare = ca;
		main();
	}
}

class Truck extends ExtendsTest
{
	public Truck(String cn, String ct, String cargo, int [] arr, double [] ca)
	{
		compareType = new String [] {"����", "���緮", "ȭ������"};
		carName = cn;
		carType = ct;
		items = arr;
		compare = ca;
		cargoType = cargo;
		main();
	}
}

public class ExtendsTestMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*�θ�Ŭ���� : �ڵ��� - ����, ���̸�, �׸��, ����
		
		�ڽ�Ŭ���� : ������ī - �ӵ� 60, ���� 40
					������ - ���� 30, ž���ο� 30, ������ 40
					Ʈ�� - ���� 50, ���緮, 50 ȭ������*/
		new SprotsCar("������ī", "���������",new int [] {90, 50}, new double [] {0.6, 0.4});
		new Vans("������", "����",new int [] {70, 90, 60}, new double [] {0.3, 0.3, 0.4});
		new Truck("Ʈ��", "����Ʈ��", "�������", new int [] {20, 100}, new double [] {0.5, 0.5});

	}
	
	

}
