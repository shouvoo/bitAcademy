package arr;

class StudMethod{
	
	String name;
	
	int [] jum;
	
	int sum, avg, rank;
	
	//// �Էº�
	void input(String name, int kor, int eng, int mat)
	{
		this.name = name;
		jum = new int[] {kor, eng, mat};
		cal();
		//print();
	}
	
	///���� - �������
	void cal(){
		
		sum =0;
		for (int i : jum) {
			sum+=i;
		}
		avg = sum/jum.length;
	}
	///���� - ������
	void rankCal(StudMethod [] arr)
	{
		rank=1;
		for (StudMethod you : arr) {
			if(avg < you.avg)
				rank++;
		}
		print();
	}
	
	///��º�
	void print()
	{
		String res=name+"\t";
		for (int i : jum) {
			res+=i+"\t";
		}
		res+=sum+"\t"+avg+"\t"+
		new String[] {"��","��","��","��","��","��","��","��","��","��","��"}[avg/10]+"\t"+
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
		
		arr[0].input("���켺",77,78 , 76);
		arr[1].input("���μ�",65, 64, 63);
		arr[2].input("���ϼ�",91, 92, 93);
		arr[3].input("���켺",56, 57, 58);
		arr[4].input("�躸��",88, 87, 84);
		
		
		///������
		for (StudMethod me : arr) {
			me.rankCal(arr);	
		}
		System.out.println("----------------------");
		StudReturn sr = new StudReturn();
		sr.topRanker(arr).print();
	}
}
