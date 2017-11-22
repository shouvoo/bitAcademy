package oops;

class StudMethod
{
	String name;
	int  [] jum;
	int sum, avg;
	int rank = 0;
	
	//입력부
	void input(String name, int kor, int eng, int mat)
	{
		this.name = name;
		jum = new int[] {kor, eng, mat};
		cal();
		//print();
	}
	
	//총점계산
	void cal()
	{
		sum = 0;
		for (int i = 0; i < jum.length; i++) 
		{
			sum += jum[i];
		}
		avg = sum / jum.length;
	}
	
	//등수계산
	void rankCal(StudMethod [] arr)
	{
		rank = 1;
		for (StudMethod you : arr) 
		{
			if(avg < you.avg)
			{
				rank++;
			}
		}
		print();
	}
	
	//출력부
	void print()
	{
		String res = name + "\t";
		for (int i : jum) 
		{
			res += i + "\t";
		}
		res += sum + "\t" + avg + "\t" + 
				new String [] {"가", "가", "가", "가", "가", "가", "양", "미", "우", "수"}[avg / 10] + 
						"\t" + rank;
		
		System.out.println(res);
	}
}

class StudReturn
{
	StudMethod topRanker(StudMethod [] arr)
	{
		StudMethod sr = arr[0];
				
		for (StudMethod you : arr) 
		{
			if(sr.rank < you.rank)			
			{
				sr = you;
			}
		}
		
		return sr;
	}
}

public class StudMethodMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StudMethod [] arr = {new StudMethod(), 
							new StudMethod(),
							new StudMethod(),
							new StudMethod(),
							new StudMethod()};
		
		arr[0].input("1우성", 40, 90, 58);
		arr[1].input("2우성", 50, 80, 78);
		arr[2].input("3우성", 60, 70, 68);
		arr[3].input("4우성", 70, 60, 88);
		arr[4].input("5우성", 80, 50, 98);
		
		for (StudMethod me : arr) 
		{
			me.rankCal(arr);
		}
		
		StudReturn sr = new StudReturn();
		sr.topRanker(arr).print();
		//new StudReturn().topRanker(arr).print();
	}
}
