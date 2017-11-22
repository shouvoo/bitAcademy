package dynamic;

class CapStud
{
	private String name, grade;
	private int [] jum;
	private double [] rate = {0.5, 0.3, 0.2};
	private int sum, rank;
	public int getRank() {
		return rank;
	}
	
	void rankCal(CapStud [] arr)
	{
		rank = 1;
		for (CapStud you : arr) 
		{
			if(res < you.getRes())
			{
				rank++;
			}
		}
	}

	public double getRes() {
		return res;
	}

	private double res;
	
	
	public CapStud(String name, int kor, int eng, int math) 
	{
		// TODO Auto-generated constructor stub
		this.name = name;
		this.jum = new int [] {kor, eng, math};
		cal();
	}
	
	private void cal()
	{
		sum = 0;
		res = 0;
		for (int i = 0; i < jum.length; i++) 
		{
			sum += jum[i];
			res += rate[i] * jum[i];
		}
		
		grade = new String[] {"��", "��", "��", "��", "��", "��", "��", "��", "��", "��"}[(int)res / 10];
	}
	
	void print()
	{
		String str = name + "\t";
		for (int i : jum) 
		{
			str += i + "\t";
		}
		
		str += sum + "\t" + res + "\t" + grade + "\t" + rank;
		System.out.println(str);
	}
	
	
}

public class CapsuleStudMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CapStud [] arr = {new CapStud("�ι�Ʈ", 58, 88, 75),
							new CapStud("�Ҹ�", 78, 64, 56),
							new CapStud("���Ҷ�", 68, 78, 54),
							new CapStud("����", 46, 45, 76),
							new CapStud("����Ʈ", 84, 76, 34),
							new CapStud("���", 57, 77, 87)};
		
		for (CapStud cs : arr) 
		{
			cs.rankCal(arr);
		}
		
		for (CapStud cs : arr) 
		{
			cs.print();
		}
	}

}















