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
		gender = "��";
		
	}
	
	OverStud(String name, int kor,int eng, int mat, int lol) {
		
		this.name = name;
		this.jum = new int [] {kor, eng, mat, lol};
		gender = "��";
		
	}
	
	void print()
	{
		String str = name+"\t"+gender+"\t";
		for (int i : jum) {
			str+=i+"\t";
		}
		
		if(gender=="��") str+="\t";
		
		str+=jj+"\t"+res;
		System.out.println(str);
	}
}

class OverUniv{
	
	String kind ="�Ϲݴ�",name;
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
				st.res="�հ�";
			else
				st.res="���հ�";

			st.print();
		}
	}	
}

class Art extends OverUniv{
	
	public Art(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		kind="��ü�ɴ�";
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
		kind="����";
		cutline=80;
	}
	
	@Override
	void cal(OverStud[] stArr) {
		System.out.println(kind+"\t"+name);
		double [] rate = {0.5,0.2,0.3};
		// TODO Auto-generated method stub
		for (OverStud st : stArr) {
			
			if(st.gender=="��")
			{
				st.jj=0;
				for (int i = 0; i < rate.length; i++) {
					st.jj+=rate[i]*st.jum[i];
				}
				
				if(st.jj>=cutline)
					st.res="�հ�";
				else
					st.res="���հ�";
				
				
			}else {
				st.res="���úҰ�";
				
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
				new OverStud("���ǿ�", 78,89,90,91),
				new OverStud("�̸̹�", 97,47,86),
				new OverStud("������", 65,78,89,93),
				new OverStud("������", 58,90,97),
				new OverStud("�ڿ���", 100,99,89,56)
		};
		
		OverUniv seoul = new OverUniv("�����");
		Art hyj = new Art("�ѱ��������մ�");
		OverGirl ih = new OverGirl("��ȭ����");
		seoul.cal(stArr);
		hyj.cal(stArr);
		ih.cal(stArr);
	}

}
