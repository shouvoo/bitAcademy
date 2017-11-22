package kr.co.mlec.list;

public class ListDomain 
{
	int staffNo;
	String staffName;
	String gender;
	String religionName;
	String sGraduationDate;
	String eGraduationDate;
	String graduateDay;
	String juminNo;
	int schoolCode;
	int religionCode;

	
	
	public int getSchoolCode() {
		return schoolCode;
	}
	public void setSchoolCode(int schoolCode) {
		this.schoolCode = schoolCode;
	}
	public int getReligionCode() {
		return religionCode;
	}
	public void setReligionCode(int religionCode) {
		this.religionCode = religionCode;
	}
	public String getGraduateDay() {
		return graduateDay;
	}
	public void setGraduateDay(String graduateDay) {
		this.graduateDay = graduateDay;
	}
	public String getJuminNo() {
		return juminNo;
	}
	public void setJuminNo(String juminNo) {
		this.juminNo = juminNo;
	}
	public int getStaffNo() {
		return staffNo;
	}
	public void setStaffNo(int staffNo) {
		this.staffNo = staffNo;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String name) {
		this.staffName = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getReligionName() {
		return religionName;
	}
	public void setReligionName(String religionName) {
		this.religionName = religionName;
	}
	public String getsGraduationDate() {
		return sGraduationDate;
	}
	public void setsGraduationDate(String sGraduationDate) {
		this.sGraduationDate = sGraduationDate;
	}
	public String geteGraduationDate() {
		return eGraduationDate;
	}
	public void seteGraduationDate(String eGraduationDate) {
		this.eGraduationDate = eGraduationDate;
	}
}
