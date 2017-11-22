package dynamic;

class CapStud{
	private String name, grade;
	
	private int [] jum;
	
	private double [] rate = {0.5,0.3,0.2};
	
	private int sum, rank;
	private double res;
	
	

	public int getRank() {
		return rank;
	}

	void rankCal(CapStud [] arr)
	{
		rank =1;
		for (CapStud you : arr) {
			if(res < you.getRes())
			{
				rank++;
			}
		}
	}
	
	public double getRes() {
		return res;
	}

	public CapStud(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.jum = new int [] {kor, eng, mat};
		cal();
	}
	
	private void cal()
	{
		sum=0;
		res=0;
		
		for (int i = 0; i < jum.length; i++) {
			sum+= jum[i];
			
			res += rate[i]*jum[i];
		}
		
		grade=new String[] {"가","가","가","가","가","가","양","미","우","수","수"}[(int)res/10];
		
	}
	
	void print()
	{
		String str = name+"\t";
		for (int i : jum) {
			str+=i+"\t";
		}
		str+=sum+"\t"+res+"\t"+grade+"\t"+rank;
		
		System.out.println(str);
	}
}

public class CapsuleStudMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CapStud [] arr = {
				new CapStud("장동건", 90,87,20),
				new CapStud("장서건", 50,87,20),
				new CapStud("장남건", 20,87,20),
				new CapStud("장북건", 60,87,20)
		};
		
		for (CapStud cs : arr) {
			cs.rankCal(arr);
		}
		
		for (CapStud cs : arr) {
			cs.print();
		}
		
	}

}
