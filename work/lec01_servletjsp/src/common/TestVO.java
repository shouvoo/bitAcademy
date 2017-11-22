package common;

public class TestVO {
	private String name;
	private String id;
	private String pass;
	private String age;
	private String addr;
	public String getName() {
		return name;
	}
	public TestVO setName(/* TestVO this, */String name) {
		this.name = name;
		return this;
	}
	public String getId(/* TestVO this */) {
		return id;
	}
	public TestVO setId(/* TestVO this, */String id) {
		this.id = id;
		return this;
	}
	public String getPass() {
		return pass;
	}
	public TestVO setPass(String pass) {
		this.pass = pass;
		return this;
	}
	public String getAge() {
		return age;
	}
	public TestVO setAge(String age) {
		this.age = age;
		return this;
	}
	public String getAddr() {
		return addr;
	}
	public TestVO setAddr(String addr) {
		this.addr = addr;
		return this;
	}
	
}












