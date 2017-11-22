package dynamic;
/*�θ�Ŭ���� : �ڵ��� - ����, ���̸�, �׸��, ����

�ڽ�Ŭ���� : 
������ī   -- �ӵ�  60, ���� 40
        ������ -- ���� 30, ž���ο� 30, ������ 40
        Ʈ��    -- ���� 50, ���緮 50, ȭ������*/
class Air{
	
}

class Car{
	String kind, name;
	int [] jum;
	double [] rate;
	double res;
	
	
	
	
	public Car(String kind, String name, int[] jum) {
		
		this.kind = kind;
		this.name = name;
		this.jum = jum;
	}


	void cal()
	{
		res=0;
		for (int i = 0; i < jum.length; i++) {
			res+= rate[i]*jum[i];
		}
	}

	void print() {
		String str = kind+"\t"+name+"\t";
		
		for (int i : jum) {
			str+=i+"\t";
		}
		str+=res+"\t";
		
		System.out.println(str);
	}
}

class Sports extends Car{
	
	public Sports(String name,int speed, int eff) {
		// TODO Auto-generated constructor stub
		super("������ī", name, new int [] {speed, eff});
		rate = new double[] {0.6,0.4};
		cal();
		print();
	}
}

class Van extends Car{
	
	public Van(String name,int eff, int cnt, int safe) {
		// TODO Auto-generated constructor stub
		super("������", name, new int [] {eff, cnt, safe});
		rate = new double[] {0.3,0.3,0.4};
		cal();
		print();
	}
}

class Truck extends Car{
	
	public Truck(String name, int eff, int cnt ,String goods) {
		// TODO Auto-generated constructor stub
		super("Ʈ��", name, new int [] { eff, cnt});
		rate = new double[] {0.5,0.5};
		cal();
		print(goods);
	}
	
	void print(String etc) {
		String str = kind+"\t"+name+"\t";
		
		for (int i : jum) {
			str+=i+"\t";
		}
		str+=res+"\t"+etc;
		
		System.out.println(str);
	}
}


public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Sports("���������", 87,76);
		new Van("��Ÿ����",77,66,55);
		new Truck("Ÿ��ź",78,75,"�ø�Ʈ");
	}

}
