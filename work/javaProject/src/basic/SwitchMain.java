package basic;

public class SwitchMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		switch("두부")
		{
			case "인사부" :
				System.out.println("바다");
				break;
			case "영업부" : 
				System.out.println("산");
				break;
			case "부부" : 
				System.out.println("안방");
				break;
			default :
				System.out.println("콩받");
				break;
		}
		
		int salary = 300;
		String rank = "부장"; 
		double salaryResult = 1;
		
		switch(rank)
		{
			case "부장" :
				salaryResult = salary + (salary * .5);
				break;
			case "과장" :
				salaryResult = salary + (salary * .3);
				break;
			case "대리" :
				salaryResult = salary + (salary * .2);
				break;
			case "사원" :
				salaryResult = salary + (salary * .1);
				break;
		}
		
		System.out.println(rank + "  :  " + (salary + (salary * .5)));
		
	}

}







































