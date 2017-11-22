package homeWork_20170908;

public class DataBank 
{
	String name, phone, id, pass;
	
	public DataBank() 
	{
		// TODO Auto-generated constructor stub
	}

	public DataBank(String name, String id, String pass, String phone) 
	{
		super();
		this.name = name;
		this.phone = phone;
		this.id = id;
		this.pass = pass;
	}

	public void print() 
	{
		String res = "이름 : " + name + ", ID : " + id + ", "
				+ "PASS : " + pass + ",  전화번호  : " + phone;
		System.out.println(res);
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getPhone() 
	{
		return phone;
	}

	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getPass() 
	{
		return pass;
	}

	public void setPass(String pass)
	{
		this.pass = pass;
	}
}
