package oops;

class EmployeesList
{
	String name;
	int num;
	double money;
	String hobby;
	int jobCount;
	
	void department(String name, int num)
	{
		this.name = name;
		this.num = num;
	}
	
	void department(String name, int num, double money)
	{
		department(name, num);
		this.money = money;
	}
	
	void department(String name, int num, double money, String hobby)
	{
		department(name, num);
		this.money = money;
		this.hobby = hobby;
	}
	
	void department(int num, int jobCount, String name)
	{
		department(name, num);
		this.jobCount = jobCount;
	}
	
	void print()
	{
		System.out.println("��� �̸�  : " + name + " �����ȣ :  " + num + " ���� : " + money  );
		System.out.println("��� �̸�  : " + name + " �����ȣ :  " + num + " ���� : " + money + " Ư�� : " + hobby   );
		System.out.println("��� �̸�  : " + name + " �����ȣ :  " + num + " �����Ǽ� : " + jobCount);
	}
}

public class EmployeesListMain 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EmployeesList el = new EmployeesList();
		el.department("�̸�1", 1, 300);
		el.department("�̸�2", 2, 400, "�޸���");
		el.department(3, 1000, "�̸�3");
		el.print();
	}

}
