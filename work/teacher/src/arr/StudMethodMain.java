package arr;

class StudMethod{
	
	String name;
	
	int [] jum;
	
	int sum, avg, rank;
	
	//// 입력부
	void input(String name, int kor, int eng, int mat)
	{
		this.name = name;
		jum = new int[] {kor, eng, mat};
		cal();
		//print();
	}
	
	///계산부 - 점수계산
	void cal(){
		
		sum =0;
		for (int i : jum) {
			sum+=i;
		}
		avg = sum/jum.length;
	}
	///계산부 - 등수계산
	void rankCal(StudMethod [] arr)
	{
		rank=1;
		for (StudMethod you : arr) {
			if(avg < you.avg)
				rank++;
		}
		print();
	}
	
	///출력부
	void print()
	{
		String res=name+"\t";
		for (int i : jum) {
			res+=i+"\t";
		}
		res+=sum+"\t"+avg+"\t"+
		new String[] {"가","가","가","가","가","가","양","미","우","수","수"}[avg/10]+"\t"+
		rank;
		
		System.out.println(res);	
	}
}
class StudReturn{
	
	StudMethod topRanker(StudMethod [] arr)
	{
		StudMethod res = arr[0];
		
		for (StudMethod you : arr) {
			if(res.avg < you.avg)
				res = you;
		}
		
		return res;
	}
}
public class StudMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudMethod [] arr = {
				
				new StudMethod(),
				new StudMethod(),
				new StudMethod(),
				new StudMethod(),
				new StudMethod()
		};
		
		arr[0].input("정우성",77,78 , 76);
		arr[1].input("조인성",65, 64, 63);
		arr[2].input("김일성",91, 92, 93);
		arr[3].input("감우성",56, 57, 58);
		arr[4].input("김보성",88, 87, 84);
		
		
		///등수계산
		for (StudMethod me : arr) {
			me.rankCal(arr);	
		}
		System.out.println("----------------------");
		StudReturn sr = new StudReturn();
		sr.topRanker(arr).print();
	}
}
