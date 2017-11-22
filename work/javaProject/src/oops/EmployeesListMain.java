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
		System.out.println("사원 이름  : " + name + " 사원번호 :  " + num + " 연봉 : " + money  );
		System.out.println("사원 이름  : " + name + " 사원번호 :  " + num + " 연봉 : " + money + " 특기 : " + hobby   );
		System.out.println("사원 이름  : " + name + " 사원번호 :  " + num + " 실적건수 : " + jobCount);
	}
}

public class EmployeesListMain 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EmployeesList el = new EmployeesList();
		el.department("이름1", 1, 300);
		el.department("이름2", 2, 400, "달리기");
		el.department(3, 1000, "이름3");
		el.print();
	}

}
