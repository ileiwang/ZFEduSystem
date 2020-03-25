package cc.ileiwang.zfedusystem.vo;
/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2017年12月4日 下午7:20:00
*/

public class Student {
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Student()
	{
		super();
	}
		public Student(int id, String num, String name, String birthday, String sex, String major, String college,
			String grade,String password) {
		super();
		this.id = id;
		this.num = num;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
		this.major = major;
		this.college = college;
		this.grade = grade;
		this.password = password;
	}
		
		public Student(String num, String name, String birthday, String sex, String major, String college,
				String grade,String password) {
			super();
			this.num = num;
			this.name = name;
			this.birthday = birthday;
			this.sex = sex;
			this.major = major;
			this.college = college;
			this.grade = grade;
			this.password = password;
		}
		int id;
		String num;
		String name;
		String birthday;
		String sex;
		String major;
		String college;
		String grade;
		String password;
}
