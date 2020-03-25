package cc.ileiwang.zfedusystem.vo;
/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2017年12月5日 下午2:05:24
*/
public class Admin {
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin(int id, String num, String name, String birthday, String sex, String password) {
		super();
		this.id = id;
		this.num = num;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
		this.password = password;
	}
	
	public Admin(String num, String name, String birthday, String sex, String password) {
		super();
		//this.id = id;
		this.num = num;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
		this.password = password;
	}
	
	public Admin()
	{
		super();
	}
	int id;
	String num;
	String name;
	String birthday;
	String sex;
	String password;

}
