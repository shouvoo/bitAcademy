package oops;
//�ڵ��� ���� �׽�Ʈ Ŭ������ �����ϼ���
//��³��� : ����, ���̸�, �׸��, ����

//���� : ������ī   -- �ӵ�  60, ���� 40
       //������ -- ���� 30, ž���ο� 30, ������ 40
       //Ʈ��    -- ���� 50, ���緮 50, ȭ������

//�����ڸ� �̿��Ͽ� �͸� Ŭ������  �����ϼ���
class ConstCar
{
	String name, kind, goods="";
	int [] jum;
	double [] rate;
	double total;
	
	ConstCar(String name,int speed, int eff)
	{
		kind = "������ī";
		this.name =name;
		jum = new int [] {speed, eff};
		rate = new double[] {0.6, 0.4};
		cal();
	}
	
	ConstCar(String name, int eff, int cnt, int safe)
	{
		kind = "������";
		jum = new int [] {eff, cnt, safe};
		rate = new double[] {0.3, 0.3,0.4};
		this.name =name;
		cal();
	}
	
	ConstCar(String name, int eff, int cnt, String goods)
	{
		kind = "Ʈ��";
		jum = new int [] {eff, cnt};
		rate = new double[] {0.5,0.5};
		this.goods = goods+"\t";
		this.name =name;
		cal();
	}
	
	void cal()
	{
		total=0;
		for (int i = 0; i < jum.length; i++) {
			total+= rate[i]*jum[i];
		}
	}
	
	void print()
	{
		String res = kind+"\t"+name+"\t";
		
		for (int i : jum) {
			res += i+"\t";
		}
		
		res+=goods+total;
		
		System.out.println(res);
	}
}
public class ConstCarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstCar [] arr = {
				new ConstCar("������",88,76),
				new ConstCar("��Ÿ����",77,75,73),
				new ConstCar("Ÿ��ź",65,62,"�⼮"),
				new ConstCar("���������",77,72)
		};
		
		for (ConstCar constCar : arr) {
			constCar.print();
		}
	}

}
