package oops;

class OverStud{
	
	String name;
	
	
	int [] jum;
	
	int sum,avg, gender;
	
	void init(String name, int kor, int eng, int mat)
	{
		this.name = name;
		gender = 1;
		jum = new int[] {kor,  eng,  mat};
		
		cal();
	}
	
	
	void init(String name, int kor, int eng, int mat, int lol)
	{
		this.name = name;
		gender =0;
		jum = new int[] {kor,  eng,  mat, lol};
		
		cal();
	}
	
	void init(String name, int [] jum)
	{
		this.name = name;
		gender =2;
		this.jum = jum;
		
		cal();
	}
	
	void cal()
	{
		sum=0;
		for (int i : jum) {
			sum+=i;
		}
		
		avg = sum/jum.length;
	}
	
	void print()
	{
		String res = name+"\t"+
	new String[] {"³²","¿©",""}[gender]+"\t";
		for (int i : jum) {
			res+=i+"\t";
		}
		if(gender==1)
			res+="\t";
		
		res += sum+"\t"+avg;
		
		System.out.println(res);
	}
	
}

class OverStuds{
	OverStud init(String name, int kor, int eng, int mat)
	{
		OverStud res = new OverStud();
		res.init(name, kor, eng, mat);
		return res;
	}
	
	OverStud init(String name, int kor, int eng, int mat, int lol)
	{
		OverStud res = new OverStud();
		res.init(name, kor, eng, mat,lol);
		return res;
	}
	
	OverStud init(String name, int [] jum)
	{
		OverStud res = new OverStud();
		res.init(name, jum);
		return res;
	}
}

public class OverStudMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverStuds os = new OverStuds();
		
		OverStud [] arr = {
				os.init("°­Çö¼ö", 27,28,29),
				os.init("À±Çö±¸", 77,78,99,79),
				os.init("±Ç¿ì¿ë", 47,48,49),
				os.init("±èÁ¤ÇÑ", 87,88,89),
				os.init("±è¿ëÇö", 37,98,39,39),
				os.init("±èÈ£Áø", 67,68,69),
				os.init("¾çÈñ¼®", 97,48,29,87),
				os.init("ÀÌÀÇ¿µ", 57,58,59)
		};
		int [] genderCnt = new int[2];
		OverStud [][] div = new OverStud[genderCnt.length][];
		
		for (OverStud st : arr) {
			genderCnt[st.gender]++;
		}
		
		for (int i = 0; i < div.length; i++) {
			div[i] = new OverStud[genderCnt[i]];
		}
		genderCnt = new int[genderCnt.length];
		for (OverStud st :arr) {
			div[st.gender][genderCnt[st.gender]] = st;
			genderCnt[st.gender]++;
		}
		
		
		OverStud[][] res = new OverStud[genderCnt.length][4];
		for (int i = 0; i < div.length; i++) {
			int [] jum = new int[4];
			
			res[i][2] = os.init("ÃÖ´ë", 0,0,0,0);
			res[i][3] = os.init("ÃÖ¼Ò", 100,100,100,100);
			
			for (OverStud  overStud: div[i]) {
				
				for (int j = 0; j < overStud.jum.length; j++) {
					jum[j]+=overStud.jum[j];
					
					if(res[i][2].jum[j]<overStud.jum[j]) {
						res[i][2].jum[j]=overStud.jum[j];
					}
					
					if(res[i][3].jum[j]>overStud.jum[j]) {
						res[i][3].jum[j]=overStud.jum[j];
					}
					
					
				}	
			}
			
			res[i][0] =os.init("ÃÑÁ¡", jum);
			res[i][1] =os.init("Æò±Õ", 
					jum[0]/div[i].length,
					jum[1]/div[i].length,
					jum[2]/div[i].length,
					jum[3]/div[i].length);
			
		}
		
		
		for (int i =0 ; i<div.length;i++) {
			System.out.println("----------------");
			
			for (OverStud overStud : div[i]) {
				overStud.print();
			}
			
			for (OverStud overStud : res[i]) {
				overStud.print();
			}
		}
		
		
		
	}

}
