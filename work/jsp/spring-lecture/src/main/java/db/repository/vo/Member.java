package db.repository.vo;

public class Member {
	private String id;
	private String name;
	private String addr;
	private String email;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email= email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id= id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String toString() {
		return this.id     + "\t" +          
		       this.name   + "\t" +   
		       this.addr   + "\t" +   
		       this.email;  
	}
}