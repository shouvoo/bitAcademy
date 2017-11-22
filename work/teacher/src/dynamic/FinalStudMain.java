package dynamic;

import java.util.Arrays;

class FinalStud{
	private String name;
	
	private int [] jum;

	public FinalStud(String name, int kor, int eng, int mat) {
		
		this.name = name;
		jum = new int[] {kor, eng, mat};
	}

	public int getJum(int i) {
		return jum[i];
	}

	public String getName() {
		return name;
	}

	
	
	
	
}

class FinalExam{
	private String name, school, res;
	private int [] jum;
	public FinalExam(String name, String school,  int kor, int eng, int mat, String res) {
		super();
		this.name = name;
		this.school = school;
		this.jum =  new int[] {kor, eng, mat};
		this.res = res;
	}
	
	public void print() {
		System.out.println(name
				+ ","+ school 
				+ ", " + Arrays.toString(jum)
				+ ", " + res);
	}
	
	
}

class FinalSchool{
	double [] rate;
	
	final int cutline = 70;
	
	String name;

	public FinalSchool(String name, int kor, int eng, int mat) {
		super();
		this.rate = new double[] {
				(double)kor/100, 
				(double)eng/100, 
				(double)mat/100};
		this.name = name;
	}
	
	FinalExam exam(FinalStud st)
	{
		double sum =0;
		
		for (int i = 0; i < rate.length; i++) {
			sum += rate[i]*st.getJum(i);
			
		}
		String res = "불합격";
		
		if(sum>=cutline)
			res = "합격";
		
		return new FinalExam(st.getName(), name, 
				st.getJum(0),st.getJum(1),st.getJum(2), 
				res);
	}
	
}


public class FinalStudMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalStud [] stArr = {
				new FinalStud("장동건", 96,78,77),
				new FinalStud("장중건", 66,68,67),
				new FinalStud("장북건", 86,88,87),
				new FinalStud("장남건", 36,98,97),
				new FinalStud("장서건", 96,58,57)
		};
		
		FinalSchool [] schArr = {
			new FinalSchool("A대", 30,30,40),
			new FinalSchool("B대", 50,20,30)
		};
		
		for (FinalSchool fs : schArr) {
			for (FinalStud st : stArr) {
				fs.exam(st).print();
			}
			System.out.println("-----------------------");
		}
		
		
	}

}
