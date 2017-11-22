package dynamic;

class OverStud{
	String name;
	
	int [] jum;
	String res;
	int jj;
	String gender;
	OverStud(String name, int kor,int eng, int mat) {
		
		this.name = name;
		this.jum = new int [] {kor, eng, mat};
		gender = "여";
		
	}
	
	OverStud(String name, int kor,int eng, int mat, int lol) {
		
		this.name = name;
		this.jum = new int [] {kor, eng, mat, lol};
		gender = "남";
		
	}
	
	void print()
	{
		String str = name+"\t"+gender+"\t";
		for (int i : jum) {
			str+=i+"\t";
		}
		
		if(gender=="여") str+="\t";
		
		str+=jj+"\t"+res;
		System.out.println(str);
	}
}

class OverUniv{
	
	String kind ="일반대",name;
	int cutline = 80;
	public OverUniv(String name) {
		super();
		this.name = name;
	}
	
	void cal(OverStud [] stArr )
	{
		System.out.println(kind+"\t"+name);
		
		subcal(stArr);
		cutlineChk(stArr);
		System.out.println("----------------------------");
	}
	
	void subcal(OverStud [] stArr)
	{
		for (OverStud st : stArr) {
			int sum=0;
			for (int i : st.jum) {
				sum += i;
			}
			st.jj = sum/st.jum.length;
		}
	}
	
	void cutlineChk(OverStud [] stArr)
	{
		for (OverStud st : stArr) {
			
			if(st.jj>=cutline)
				st.res="합격";
			else
				st.res="불합격";

			st.print();
		}
	}	
}

class Art extends OverUniv{
	
	public Art(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		kind="예체능대";
		cutline=70;
	}
	
	@Override
	void subcal(OverStud[] stArr) {
		double [] rate = {0.3,0.3,0.4};
		
		for (OverStud st : stArr) {
			st.jj=0;
			for (int i = 0; i < rate.length; i++) {
				st.jj+=rate[i]*st.jum[i];
			}
		}
	}
}


class OverGirl extends OverUniv{
	
	public OverGirl(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		kind="여대";
		cutline=80;
	}
	
	@Override
	void cal(OverStud[] stArr) {
		System.out.println(kind+"\t"+name);
		double [] rate = {0.5,0.2,0.3};
		// TODO Auto-generated method stub
		for (OverStud st : stArr) {
			
			if(st.gender=="여")
			{
				st.jj=0;
				for (int i = 0; i < rate.length; i++) {
					st.jj+=rate[i]*st.jum[i];
				}
				
				if(st.jj>=cutline)
					st.res="합격";
				else
					st.res="불합격";
				
				
			}else {
				st.res="응시불가";
				
			}
			st.print();
		}	
		System.out.println("----------------------------");
		
	}
	
	
}

public class OverUnivMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverStud [] stArr = {
				new OverStud("이의영", 78,89,90,91),
				new OverStud("이미르", 97,47,86),
				new OverStud("석성희", 65,78,89,93),
				new OverStud("양희정", 58,90,97),
				new OverStud("박원서", 100,99,89,56)
		};
		
		OverUniv seoul = new OverUniv("서울대");
		Art hyj = new Art("한국예술종합대");
		OverGirl ih = new OverGirl("이화여대");
		seoul.cal(stArr);
		hyj.cal(stArr);
		ih.cal(stArr);
	}

}
