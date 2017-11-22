package arr;

public class MulArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] arr = {			///1차원
				{"000",  "001",      "002"},//arr[0]
				{"100",  "101",      "102"},//arr[1]
				{"200",  "201",      "202"},//arr[2]
				{"300",  "301",      "302"} //arr[3]
//2차원          arr[?][0],arr[?][1],arr[?][2]
			};
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[0][1]);
		
		/*System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		System.out.println(arr[3].length);*/
		
		for (int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]+","+arr[i].length);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
		
		System.out.println(arr[3][1]);
	}

}
