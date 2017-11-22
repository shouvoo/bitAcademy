package dynamic;

class Ref
{
	private int [] arr;

	Ref(int[] arr) 
	{
		this.arr = arr;
	}

	/*public int[] getArr() 
	{
		return arr;
	}*/
	
	public int getArr(int cnt)
	{
		if(cnt < 0 || cnt >= arr.length)
		{
			System.out.println("범위 에러");
			return 0;
		}
		return arr[cnt];
	}
	
	
}

public class ReferenceMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Ref rr = new Ref(new int [] {111, 222, 333});
		/*rr.getArr()[0] = 1234;
		System.out.println(rr.getArr()[0]);
		System.out.println(rr.getArr()[1]);
		System.out.println(rr.getArr()[2]);*/
		
		System.out.println(rr.getArr(0));
		System.out.println(rr.getArr(1));
		System.out.println(rr.getArr(2));
		System.out.println(rr.getArr(6));
	}

}
