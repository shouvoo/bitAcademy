package arr;

public class MulDynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arr4 = new int[3][4];
		int [] arr2 = {100,200};
		int [] arr3;
		int [][] arr1 = {
				{2,3,4,5},
				new int[8],
				{10,20,30,40,50},
				arr2,
				//arr3
				arr4[2]
		};
		arr3 = arr2;
		
		System.out.println(arr2+":"+arr2[1]);
		System.out.println(arr3+":"+arr3[1]);
		System.out.println(arr1[3]+":"+arr1[3][1]);
		
		arr2[1]=50;
		System.out.println(arr2+":"+arr2[1]);
		System.out.println(arr3+":"+arr3[1]);
		System.out.println(arr1[3]+":"+arr1[3][1]);
		
		int [] arr5 = {10,20,30,40,50};
		arr5[1]=2345;
		System.out.println(arr5+":"+arr5[1]);
		System.out.println(arr1[2]+":"+arr1[2][1]);
		
		int [] arr6 ;//= {1111,2222,333};
		//arr6 = {1111,2222,333};
		arr6 = new int[]{1111,2222,333};
		System.out.println(arr6[1]);
		
		
		
		int [] arr7 = new int[3];
		int [][] arr8 = new int[3][];
		//int [][] arr9 = new int[][3];
		int [][][] arr10 = new int[3][][];
		//int [][][] arr11 = new int[3][][4];
		
		System.out.println(arr8);
		System.out.println(arr8[0]);
		
		
	}

}
