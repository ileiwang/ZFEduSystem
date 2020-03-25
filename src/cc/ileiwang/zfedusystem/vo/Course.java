package cc.ileiwang.zfedusystem.vo;

public class Course {
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
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getOne() {
		return one;
	}
	public void setOne(String one) {
		this.one = one;
	}
	public String getTwo() {
		return two;
	}
	public void setTwo(String two) {
		this.two = two;
	}
	public String getThree() {
		return three;
	}
	public void setThree(String three) {
		this.three = three;
	}
	public String getFour() {
		return four;
	}
	public void setFour(String four) {
		this.four = four;
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
	
	
	public Course(int id, String num, String day, String one, String two, String three, String four, String major,
			String college, String grade) {
		super();
		this.id = id;
		this.num = num;
		this.day = day;
		this.one = one;
		this.two = two;
		this.three = three;
		this.four = four;
		this.major = major;
		this.college = college;
		this.grade = grade;
	}


	public Course(String num, String day, String one, String two, String three, String four, String major,
			String college, String grade) {
		super();
		this.num = num;
		this.day = day;
		this.one = one;
		this.two = two;
		this.three = three;
		this.four = four;
		this.major = major;
		this.college = college;
		this.grade = grade;
	}


	int id;
	String num;
	String day;
	String one;
	String two;
	String three;
	String four;
	String major;
	String college;
	String grade;
}
