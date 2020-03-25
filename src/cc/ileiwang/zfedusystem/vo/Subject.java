package cc.ileiwang.zfedusystem.vo;
/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2018年1月4日 下午4:49:01
*/
public class Subject {
	
	public Subject(int id, String name, String teacher, String credit, String xueshi, String time, String place) {
		super();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		this.credit = credit;
		this.xueshi = xueshi;
		this.time = time;
		this.place = place;
	}
	public Subject(String name, String teacher, String credit, String xueshi, String time, String place) {
		super();
		this.name = name;
		this.teacher = teacher;
		this.credit = credit;
		this.xueshi = xueshi;
		this.time = time;
		this.place = place;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getXueshi() {
		return xueshi;
	}
	public void setXueshi(String xueshi) {
		this.xueshi = xueshi;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	int id;
	String name;
	String teacher;
	String credit;
	String xueshi;
	String time;
	String place;
	

}
