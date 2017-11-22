package excep;

class MyExcep extends Exception{
	String [] arr = {"id 에러","pw 에러", "전화번호 에러"};
	int num;
	String str = "아기상어";
	public MyExcep(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
	
	public MyExcep(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return arr[num];
	}
	
}

public class UerExcepMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new MyExcep(0);
		} catch (MyExcep e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
