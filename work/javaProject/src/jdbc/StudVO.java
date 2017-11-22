package jdbc;

public class StudVO 
{
	private String id, name, tel, email, jumin, pw;
	private int grade;
	
	void print() 
	{
		String str = id + "," + name + "," + jumin + "," + pw;
		System.out.println(str);
	}
	
	public String getId() 
	{
		return id;
	}
	public void setId(String id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getTel() 
	{
		return tel;
	}
	public void setTel(String tel) 
	{
		this.tel = tel;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getJumin() 
	{
		return jumin;
	}
	public void setJumin(String jumin) 
	{
		this.jumin = jumin;
	}
	public String getPw() 
	{
		return pw;
	}
	public void setPw(String pw) 
	{
		this.pw = pw;
	}
	public int getGrade() 
	{
		return grade;
	}
	public void setGrade(int grade) 
	{
		this.grade = grade;
	}
}
