package dynamic;

class AbsStud{
	
	AbsStud(String name, String kind, int gender, int[] jum) {
		super();
		this.name = name;
		this.kind = kind;
		this.gender = gender;
		this.jum = jum;
	}

	public AbsStud(String name, int kor, int eng, int mat) {
		this(name, "�Ϲ�", 1, new int[] {kor,  eng,  mat});
	}
	
	public AbsStud(String name, int kor, int eng, int mat, int lol) {
		this(name, "�Ϲ�", 0, new int[] {kor,  eng,  mat, lol});
	}
 
	String name, kind;
	int gender;
	
	int [] jum;
	
	double res;
	
	void print()
	{
		String str = kind +"\t"+name+"\t"+new String [] {"��","��"}[gender]+"\t";
		
		for (int i : jum) {
			str+=i+"\t";
		}
		
		if(gender==1)
			str+="\t";
		
		str+=res;
		
		System.out.println(str);
	}
}
//��ü��...
class ArtStud extends AbsStud{
	
	
	public  ArtStud(String name, int kor, int eng, int mat, int art) {
		this(name, kor, eng, mat,0, art);
		gender=1;
	}
	
	public  ArtStud(String name, int kor, int eng, int mat,int lol, int art) {
		super(name, kor, eng, mat, art);
		kind="��ü��";
	}
}

//û�ʹ�...
class BlueHouse extends AbsStud{
	
	
	public BlueHouse(String name, int kor, int eng, int mat) {
		super(name, kor, eng, mat);
		kind="û�ʹ�";
	}
	
	public BlueHouse(String name, int kor, int eng, int mat,int lol) {
		this(name, kor, eng, mat);
		gender=1;
		
	}
}


abstract class Univ{
	
	String kind, name;
	
	int cutline;
	
	abstract void cal(AbsStud [] arr);

	public Univ(String kind, String name, int cutline) {
		super();
		this.kind = kind;
		this.name = name;
		this.cutline = cutline;
	}
	
	void print()
	{
		String res = kind+"\t"+name+"\t"+cutline;
		System.out.println(res);
	}
	
	void calPrint(AbsStud[] arr)
	{
		print();
		for (AbsStud st : arr) {
			st.print();
		}
		System.out.println("----------------------------");
	}
	
	AbsStud [] calCutline(AbsStud[] arr )
	{
		cal(arr);
		AbsStud [] res = new AbsStud [0];
		for (AbsStud st : arr) {
			if(st.res>=cutline)
			{
				AbsStud [] buf = new AbsStud [res.length+1];
				for (int i = 0; i < res.length; i++) {
					buf[i]= res[i];
				}
				buf[res.length]=st;
				res = buf;
			}
		}
		calPrint(res);
		return res;
	}
}

class NomalUniv extends Univ{

	double [][] rate =new double[2][];
	public NomalUniv(String name, int cutline, int kor, int eng, int mat) {
		super("�Ϲ�", name, cutline);
		// TODO Auto-generated constructor stub
		rate[0] = new double []{(double)kor/100, (double)eng/100, (double)mat/200, (double)mat/200};
		rate[1] = new double []{(double)kor/100, (double)eng/100, (double)mat/100};
	}

	@Override
	void  cal(AbsStud[] arr) {
		// TODO Auto-generated method stub

		for (AbsStud st : arr) {
			st.res =0;
			for (int i = 0; i < rate[st.gender].length; i++) {
				st.res+= rate[st.gender][i]*st.jum[i];
			}			
		}
		
	}
	
}


class ArtUniv extends Univ{

	double [] rate;
	public ArtUniv(String name, int cutline, int kor, int eng, int mat, int art) {
		super("��ü��", name, cutline);
		// TODO Auto-generated constructor stub
		
		rate= new double []{(double)kor/100, (double)eng/100, (double)mat/100, (double)art/100};
	}

	@Override
	void  cal(AbsStud[] arr) {
		// TODO Auto-generated method stub

		for (AbsStud st : arr) {
			st.res =-100;
			if(kind==st.kind)
			{
				st.res =0;
				for (int i = 0; i < rate.length; i++) {
					st.res+= rate[i]*st.jum[i];
				}
			}
		}
		
	}
	
}


class MilUniv extends Univ{

	double [] rate;
	public MilUniv(String name, int cutline, int kor, int eng, int mat, int lol) {
		super("����", name, cutline);
		// TODO Auto-generated constructor stub
		
		rate= new double []{(double)kor/100, (double)eng/100, (double)mat/100, (double)lol/100};
	}

	@Override
	void  cal(AbsStud[] arr) {
		// TODO Auto-generated method stub

		for (AbsStud st : arr) {
			st.res =-100;
			if(st.gender==0)
			{
				st.res =0;
				for (int i = 0; i < rate.length; i++) {
					st.res+= rate[i]*st.jum[i];
				}
			}
		}
		
	}
	
}

public class AbstractExamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbsStud [] stArr = {
				
				new AbsStud("�嵿��", 57,56,58),
				new ArtStud("�ҳ�ô�", 65,66,67,68,64),
				new BlueHouse("����", 77,78,79),
				new AbsStud("���߰�", 87,86,88,85),
				new ArtStud("�߳�ô�", 95,96,97,98,92),
				new BlueHouse("����", 47,48,49,46),
				new AbsStud("�弭��", 97,86,78),
				new ArtStud("ó��ô�", 35,46,57,68),
				new BlueHouse("�̽��ͺ�", 57,98,79),
				new AbsStud("�峲��", 87,66,68,97),
				new ArtStud("�ҳ�ô�", 95,86,57,48),
				new BlueHouse("Ŀ�Ǻ�", 27,98,69,0),
		};
		
		
		Univ [] unArr= {
				new NomalUniv("��ݴ�", 80, 40,30,30),
				new ArtUniv("���￹��", 66, 30,10,20,40),
				new NomalUniv("��ݴ�", 70, 5,90,5),
				new MilUniv("6���", 0, 20,20,20,40)
		};
		
		for (Univ univ : unArr) {
			univ.calCutline(stArr);
		}
		
		/*for (AbsStud absStud : stArr) {
			absStud.print();
		}*/
		
		
		
	}

}
