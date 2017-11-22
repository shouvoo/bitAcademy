package oops;

import java.util.Iterator;

//20170807
class OverStud
{
	String name;
	int [] jum;
	int sum, avg, gender;
	
	void init(String name, int kor, int eng, int mat)
	{
		this.name = name;
		gender = 1;
		jum = new int[] {kor, eng, mat};
		cal();
	}
	
	void init(String name, int kor, int eng, int mat, int lol)
	{
		this.name = name;
		gender = 0;
		jum = new int[] {kor, eng, mat, lol};
		cal();
	}
	
	void init(String name, int [] jum)
	{
		this.name = name;
		gender = 2;
		this.jum = jum;
		cal();
	}
	
	void cal()
	{
		sum = 0;
		for (int i : jum) 
		{
			sum += i;
		}
		avg = sum / jum.length;
	}
	
	void print()
	{
		String res = name + "\t" + 
					 new String[] {"³²", "¿©", ""}[gender] + "\t";
	
		for (int i : jum) 
		{
			res += i + "\t";
		}
		
		if(gender == 1)
		{
			res += "\t";
		}
		
		res += sum + "\t" + avg;
		System.out.println(res);
	}
}

class OverStuds
{
	OverStud init(String name, int kor, int eng, int mat)
	{
		OverStud res = new OverStud();
		res.init(name, kor, eng, mat);
		return res;
	}
	
	OverStud init(String name, int kor, int eng, int mat, int lol)
	{
		OverStud res = new OverStud();
		res.init(name,kor, eng, mat, lol);
		return res;
	}
	
	OverStud init(String name, int [] jum)
	{
		OverStud res = new OverStud();
		res.init(name, jum);
		return res;
	}
}

public class OverStudMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		OverStuds os = new OverStuds();
		OverStud [] arr = {	os.init("ÀÏÇÑºû", 79, 86, 67),
							os.init("ÀÌÇÑºû", 99, 57, 68, 88),
							os.init("»ïÇÑºû", 59, 98, 47),
							os.init("»çÇÑºû", 69, 45, 37, 48),
							os.init("¿ÀÇÑºû", 39, 76, 75),
							os.init("À°ÇÑºû", 95, 65, 47),
							os.init("Ä¥ÇÑºû", 96, 76, 57, 98),
							os.init("ÆÈÇÑºû", 91, 73, 67)};
		
		int [] genderCnt = new int[2];
		OverStud [][] div = new OverStud[genderCnt.length][];
		
		for (OverStud st : arr) 
		{
			genderCnt[st.gender]++;
		}
		
		for (int i = 0; i < div.length; i++) 
		{
			div[i] = new OverStud[genderCnt[i]];
		}
		
		genderCnt = new int[genderCnt.length];
		
		for (OverStud st : arr) 
		{
			div[st.gender][genderCnt[st.gender]] = st;
			genderCnt[st.gender]++;
		}
		
		OverStud[][] res = new OverStud[genderCnt.length][4];
		for (int i = 0; i < div.length; i++) 
		{
			int [] jum = new int[4];
			res[i][2] = os.init("ÃÖ´ë", 0, 0, 0, 0);
			res[i][3] = os.init("ÃÖ¼Ò", 100, 100, 100, 100);
			for (OverStud overStud : div[i]) 
			{
				for (int j = 0; j < overStud.jum.length; j++) 
				{
					jum[j] += overStud.jum[j];

					if(res[i][2].jum[j] < overStud.jum[j]) // °¢°ú¸ñ ÃÖ´ë°ª ±¸ÇÏ±â
					{
						res[i][2].jum[j] = overStud.jum[j];
					};
					
					if(res[i][3].jum[j] > overStud.jum[j]) // °¢°ú¸ñ ÃÖ¼Ò°ª ±¸ÇÏ±â
					{
						res[i][3].jum[j] = overStud.jum[j];
					};
				}
			} //ÃÑÁ¡°è»ê
			
			
			res[i][0] = os.init("ÃÑÁ¡", jum);
			res[i][1] = os.init("Æò±Õ", jum[0] / div.length,
										jum[1] / div.length,
										jum[2] / div.length,
										jum[3] / div.length);
		}

		for (int i = 0; i<div.length; i++) 
		{
			System.out.println("------------------------------------");
			for (OverStud overStud : div[i]) 
			{
				overStud.print();
			}
			
			
			for (OverStud overStud : res[i]) 
			{
				overStud.print();
			}
		}
	}

}



















