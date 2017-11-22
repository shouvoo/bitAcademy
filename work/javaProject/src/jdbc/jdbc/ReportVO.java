package jdbc;

import java.util.Arrays;

public class ReportVO {

	private String id, name, jumin, pw, title;
	
	private Integer grade ;
	
	private Integer[] jum;
	
	public void setJum(Integer kor, Integer eng, Integer mat)
	{
		jum = new Integer[] {kor, eng,mat};
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getGrade() {
		return grade;
	}

	public void setGrade(Integer grade) {
		this.grade = grade;
	}

	
	@Override
	public String toString() {
		return id + ", " + name + ", " + jumin
				+ ", " + pw + ", " + title + ", " + grade + ", "
				+ Arrays.toString(jum);
	}
	
	
	
}
