package dynamic;

class OverStud
{
	String name;
	int [] jum;
	String res;
	int  jj;
	String gender;
	OverStud(String name, int kor, int eng, int mat) 
	{
		super();
		this.name = name;
		this.jum = new int[] {kor, eng, mat};
		gender = "여";
	};
	
	OverStud(String name, int kor, int eng, int mat, int lol) 
	{
		super();
		this.name = name;
		this.jum = new int[] {kor, eng, mat, lol};
		gender = "남";
	};

	
	void print()
	{
		String str = name +"\t"+ gender +"\t";
		for (int i : jum) 
		{
			str += i+"\t";
		}
		if(gender =="여") str+="\t";
		
		str += jj+"\t"+res;
		System.out.println(str);
	}
}

class Art extends OverUniv
{
	public Art(String name) 
	{
		// TODO Auto-generated constructor stub
		super(name);
		kind = "예술대학교";
		cutline = 70;
	}
	
	void subcal(OverStud [] stArr)
	{
		double [] rate = {.3, .4, .5};
		for (OverStud st : stArr) 
		{
			st.jj = 0;
			for (int i = 0; i < rate.length; i++) 
			{
				st.jj += rate[i] * st.jum[i]; 
			}
		}
	}
}

class OverUniv
{
	String kind = "일반대학교", name;
	int cutline = 80;
	
	OverUniv(String name) 
	{
		super();
		this.name = name;
	}
	
	void cal(OverStud [] stArr)
	{
		System.out.println(kind + "\t" + name);
		subCal(stArr);
		curlineChk(stArr);
	}
	
	void subCal(OverStud [] stArr)
	{
		for (OverStud st : stArr) 
		{
			int sum = 0;
			for (int i : st.jum) 
			{
				sum +=i;
			}
			st.jj = sum/st.jum.length;
		}
	}
	
	void curlineChk(OverStud [] stArr)
	{
		for (OverStud st : stArr) 
		{
			if(st.jj >= cutline) st.res = "합격";
			else  st.res = "불합격";
			st.print();
		}
	}
}

public class OverUnivMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		OverStud [] stArr= {new OverStud("11", 12, 13, 14, 14),new OverStud("22", 12, 13, 14),
							new OverStud("33", 12, 13, 14),new OverStud("44", 12, 13, 14, 14),
							new OverStud("55", 12, 13, 14),new OverStud("66", 12, 13, 14, 14)};
		
		OverUniv seoul = new OverUniv("서울대");
		seoul.cal(stArr);
		
		Art hyj = new Art("한예종");
		hyj.cal(stArr);
	}

}
