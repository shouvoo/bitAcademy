package arr;

public class ArrayMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		
		int [] arr1 = {90,90,90,100,90};
		//              0  1  2  3  4
		int [] arr2 = new int[4];
		int [] arr3 = null;
		
		System.out.println(a);
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		//System.out.println(arr3[0]);
		System.out.println(arr1[4]);
		System.out.println(arr2[3]);
		
		
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		
		System.out.println("====================");
		
		int sum =0;
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
			sum+=arr1[i];
		}
		int avg = sum/arr1.length;
		String [] grade = {"가","가","가","가","가","가","양","미","우","수","수"};
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(grade[avg/10]);
		
	}

}
