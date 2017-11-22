package common;

public class VOTest {
	public static void main(String[] args) {
		TestVO vo = new TestVO();
		vo.setAddr("서울시")
		  .setAge("11")
		  .setId("seoul")
		  .setName("홍길동")
		  .setPass("234");
	}
}
