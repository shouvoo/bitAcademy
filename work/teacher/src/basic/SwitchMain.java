package basic;

public class SwitchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		switch(15)
		{
			case 10:
				System.out.println("난 10이여");
				break;
			case 7:
				System.out.println("난 7이여");
				break;
			default:
				System.out.println("난 기본이여");
				break;
			case 15:
				System.out.println("난 15이여");
				break;
			
		}
		
		
		//부서별 mt 장소를 공지하세요
		  // 인사부 - 바다, 영업부 - 산, 부부 - 안방, 두부 - 콩밭
		
		String team = "영업부";
		
		String mt = "잔업";
		
		switch(team) {
			case "인사부":
				mt="바다";
				break;
			case "영업부":
				mt="산";
				break;
			case "부부":
				mt="안방";
				break;
			case "두부":
				mt="콩밭";
				break;
		}
		
		System.out.println(team+":"+mt);
		
		int basic = 300;
		String pos = "과장";
		
		double rate=0;
		
		switch(pos)
		{
			case "부장":
				rate=0.5;
				break;
			case "과장":
				rate=0.3;
				break;
			case "대리":
				rate=0.2;
				break;
			case "사원":
				rate=0.1;
				break;
		}
		
		System.out.println(basic*(rate+1));
		
	}

}

