package basic;

public class ForMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i=0;
		for(int i=5;i<10;i++)
		{
			System.out.println("¼±»ý´ÔÀº ±Í¿©¿ö¿ä"+i);
		}
		
		//System.out.println(i);
		
		int sum =0;
		//for (int i = 0; i <=100; i++) {
		for (int i = 0; i <=100; i+=3) {
			//sum+=i;
			//if(i%3==0)
				sum = sum +i;
			System.out.println(i+","+sum);
		}
		
		System.out.println(sum);
		
		
		
		for (int i = 1; i <=100; i++) {
			
			String res = "";
			int ten = i/10;
			int one = i%10;
			
			if(ten%3==0 && ten%10!=0)
				res+="Â¦";
			
			if(one%3==0 && one!=0)
				res+="Â¦";
			
			if(res=="")
				res+=i;
			
			System.out.println(res);
		}
		
		
		
	}

}
