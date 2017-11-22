package arr;

public class ArrayMain1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a = 10;
		
		int [] arr1 = {30 ,20, 40, 100, 50};
		int [] arr2 = new int[4];
		int [] arr3 = null;
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(arr1[0]);
		System.out.println(arr2[1]);
		//System.out.println(arr3[0]);
		System.out.println(arr1[4]);
		System.out.println(arr2[3]);
		
		
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		//System.out.println(arr3.length);
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		
		int result = 0;
		int avg = 0;
		
		for (int i = 0; i < arr1.length; i++) 
		{
			result += arr1[i];
		}
		avg = result / arr1.length;
		String [] grade = {"가", "가", "가", "가", "가", "가", "양", "미", "우", "수"};
		
		
		System.out.println("합  :  " + result);
		System.out.println("등급  : " + grade[avg / 10]);
		System.out.println("평균  : " + avg);
		
	}

}














