package basic;

public class SwitchMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		switch("�κ�")
		{
			case "�λ��" :
				System.out.println("�ٴ�");
				break;
			case "������" : 
				System.out.println("��");
				break;
			case "�κ�" : 
				System.out.println("�ȹ�");
				break;
			default :
				System.out.println("���");
				break;
		}
		
		int salary = 300;
		String rank = "����"; 
		double salaryResult = 1;
		
		switch(rank)
		{
			case "����" :
				salaryResult = salary + (salary * .5);
				break;
			case "����" :
				salaryResult = salary + (salary * .3);
				break;
			case "�븮" :
				salaryResult = salary + (salary * .2);
				break;
			case "���" :
				salaryResult = salary + (salary * .1);
				break;
		}
		
		System.out.println(rank + "  :  " + (salary + (salary * .5)));
		
	}

}






































