package jdbc;

public class Test3VO
{
	Integer id, kor, eng, sid;
	@Override
	public String toString() {
		return id + " : " + kor  + " : " + eng  + " : " + sid;
	}

	public Test3VO() 
	{
		// TODO Auto-generated constructor stub
	}

	public Test3VO(Integer id, Integer kor, Integer eng, Integer sid) 
	{
		super();
		this.id = id;
		this.kor = kor;
		this.eng = eng;
		this.sid = sid;
	}
	
}
