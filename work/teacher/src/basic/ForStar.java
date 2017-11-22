package basic;

public class ForStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line=10;
		for (int i = 0; i <line; i++) {
			for (int h = 0; h <=i; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i <line; i++) {
			for (int h = i; h <line; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	    /*
	 ----* 
	 ---**
	 --***
	 -****
	 *****
	 */
		
		System.out.println();
		for (int i = 0; i <line; i++) {
			for (int h = i; h <line-1; h++) {
				//  ºóÄ­           º°
				//0 -> 4      0 -> 0
				//1 -> 4      0 -> 1
				//2 -> 4      0 -> 2
				//3 -> 4      0 -> 3
				//4 -> 4      0 -> 4
				System.out.print("-");
			}
			for (int h = 0; h <=i; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i = 0; i <line; i++) {
			
			for (int h = 0; h <i; h++) {
				System.out.print(" ");
			}
			
			for (int h = i; h <line; h++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		
		System.out.println();
		for (int i = 0; i <line; i++) {
			String str = "-";
			for (int h = 0; h <line; h++) {
				if(h == line-1-i)
					str="*";
				
				System.out.print(str);
			}
			System.out.println();
		}
		
		System.out.println();
		for (int i = 0; i <line; i++) {
			String str = "-";
			for (int h = 0; h <line; h++) {
				if(h == i)
					str="*";
				
				System.out.print(str);
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		for (int i = 0; i <line; i++) {
			
			for (int h = 0; h <line; h++) {
				
				
				System.out.print(h+",");
			}
			System.out.println("=>"+i);
		}
		
		
		
		System.out.println();
		for (int i = 0; i <line; i++) {
			for (int h = i; h <line-1; h++) {
				System.out.print("-");
			}
			for (int h = 0; h <=i*2; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		for (int i = 0; i <line; i++) {
			
			for (int h = 0; h <i; h++) {
				System.out.print(" ");
			}
			
			for (int h = 1; h <(line-i)*2; h++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	
	

}
