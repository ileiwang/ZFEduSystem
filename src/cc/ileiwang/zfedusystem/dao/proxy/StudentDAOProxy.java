package cc.ileiwang.zfedusystem.dao.proxy;

import cc.ileiwang.zfedusystem.vo.*;
import cc.ileiwang.zfedusystem.dbc.*;
import cc.ileiwang.zfedusystem.dao.impl.*;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cc.ileiwang.zfedusystem.dao.*;
/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2017��12��4�� ����9:00:29
*/
public class StudentDAOProxy implements StudentDAO {
	private DatabaseConnection dbc = null;
	private StudentDAO dao = null;
	
	public StudentDAOProxy()
	{
		try
		{
			this.dbc = new DatabaseConnection();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		this.dao = new StudentDAOImpl(this.dbc.getConnection());
	}
	
	//����������ѯ
	public Student findStuByName(String name)
	{
		Student stu = null;
		stu = dao.findStuByName(name);
		return stu; 
	}
	
	//����ѧ�Ų�ѯ
	public Student findStuByNum(String num)
	{
		Student stu = null;
		stu = dao.findStuByNum(num);
		return stu; 
	}
	
	//����ID��ѯ
	public Student findStuById(int id)
	{
		Student stu = null;
		stu = dao.findStuById(id);
		return stu; 
	}
	
	//���
	public boolean addStu(Student stu)
	{
		boolean result = false;
		result = dao.addStu(stu);
		return result; 
	}
	
	//����ѧ��ɾ��
	public boolean delStuByNum(String num)
	{
		boolean result = false;
		result = dao.delStuByNum(num);
		return result; 
	}
	
	//��������ɾ��
	public boolean delStuByName(String name)
	{
		boolean result = false;
		result = dao.delStuByName(name);
		return result; 
	}
	
	//����IDɾ��
	public boolean delStuById(int id)
	{
		boolean result = false;
		result = dao.delStuById(id);
		return result; 
	}
	
	//�г�����ѧ��
	public List<Student> listAllStu()
	{
		List<Student> stus = new ArrayList<Student>();
		stus = dao.listAllStu();
		return stus;
	}
	
	//�޸���Ϣ
	public boolean updateStu(Student stu)
	{
		boolean result = false;
		result = dao.updateStu(stu);
		return result; 
	}
	
	//�Ƿ���ע��
	public boolean isStu(String name,String num)
	{
		boolean result = false;
		result = dao.isStu(name,num);
		return result;
		
	}
	
	//�һ�����
	public String findPass(String name,String num)
	{
		String password = null;
		password = dao.findPass(name,num);
		
		return password;
	}
	
	//��¼
	public boolean loginStu(String num,String password)
	{
		boolean result = false;
		result = dao.loginStu(num, password);
		return result;
	}
	
	public String findNameByNum(String num)
	{
		String name = dao.findNameByNum(num);
		return name;
	}
}
