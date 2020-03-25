package cc.ileiwang.zfedusystem.vo;
/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2017��12��5�� ����2:07:00
*/
public class Score {
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
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getCpp() {
		return cpp;
	}
	public void setCpp(String cpp) {
		this.cpp = cpp;
	}
	public String getJava() {
		return java;
	}
	public void setJava(String java) {
		this.java = java;
	}
	public String getPython() {
		return python;
	}
	public void setPython(String python) {
		this.python = python;
	}
	public Score(int id, String num, String name, String c, String cpp, String java, String python) {
		super();
		this.id = id;
		this.num = num;
		this.name = name;
		this.c = c;
		this.cpp = cpp;
		this.java = java;
		this.python = python;
	}
	
	public Score(String num, String name, String c, String cpp, String java, String python) {
		super();
		this.num = num;
		this.name = name;
		this.c = c;
		this.cpp = cpp;
		this.java = java;
		this.python = python;
	}
	
	public Score()
	{
		super();
	}
	int id;
	String num;
	String name;
	String c;
	String cpp;
	String java;
	String python;

}
