package lang_p;

public class MathMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		System.out.println(Math.ceil(-123.456));
		System.out.println(Math.ceil(-978.654));
		System.out.println(Math.floor(-123.456));
		System.out.println(Math.floor(-978.654));
		System.out.println(Math.round(-123.456));
		System.out.println(Math.round(-978.654));
		
		System.out.println(Math.abs(123.456));
		System.out.println(Math.abs(-123.456));
		
		System.out.println(Math.max(10,20));
		System.out.println(Math.min(10,20));
		System.out.println(Math.pow(2,3));
		
		System.out.println(Math.sqrt(2));
		
		System.out.println(Math.cos(60*Math.PI/180));
		
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*10));
	}

}
