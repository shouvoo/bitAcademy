package util_p;

import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r1 = new Random();
		Random r2 = new Random(100);
		
		System.out.println(r1.nextInt());
		System.out.println(r1.nextInt(10));
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextBoolean());
		System.out.println(r1.nextFloat());
		System.out.println(r1.nextLong());
		
		System.out.println("------------------");
		
		for (int i = 0; i <5; i++) {
			System.out.println(r1.nextInt());
		}
		
		System.out.println("------------------");
		
		for (int i = 0; i <5; i++) {
			System.out.println(r2.nextInt());
		}
		
	}

}
