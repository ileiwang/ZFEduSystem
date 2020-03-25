package cc.ileiwang.zfedusystem.dao.proxy;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cc.ileiwang.zfedusystem.dao.TeacherDAO;
import cc.ileiwang.zfedusystem.dao.impl.StudentDAOImpl;
import cc.ileiwang.zfedusystem.dao.impl.TeacherDAOImpl;
import cc.ileiwang.zfedusystem.dbc.DatabaseConnection;
import cc.ileiwang.zfedusystem.vo.Score;
import cc.ileiwang.zfedusystem.vo.Teacher;

/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2017年12月5日 下午2:36:19
*/
public class TeacherDAOProxy implements TeacherDAO {
	private DatabaseConnection dbc = null;
	private TeacherDAO dao = null;
	
	public TeacherDAOProxy()
	{
		try
		{
			this.dbc = new DatabaseConnection();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		this.dao = new TeacherDAOImpl(this.dbc.getConnection());
	}
	
	//根据姓名查询
	public Teacher findTeacherByName(String name)
	{
		Teacher tea = null;
		tea = dao.findTeacherByName(name);
		return tea; 
	}
	
	//根据学号查询
	public Teacher findTeacherByNum(String num)
	{
		
		Teacher tea = null;
		tea = dao.findTeacherByNum(num);
		return tea; 
	}
	
	//根据ID查询
	public Teacher findTeacherById(int id)
	{
		Teacher tea = null;
		tea = dao.findTeacherById(id);
		return tea; 
	}
	
	//添加
	public boolean addTeacher(Teacher tea)
	{
		boolean result = false;
		result = dao.addTeacher(tea);
		return result; 
	}
	
	//根据学号删除
	public boolean delTeacherByNum(String num)
	{
		boolean result = false;
		result = dao.delTeacherByNum(num);
		return result; 
	}
	
	//根据姓名删除
	public boolean delTeacherByName(String name)
	{
		boolean result = false;	
		result = dao.delTeacherByName(name);
		return result; 
	}
	
	//根据ID删除
	public boolean delTeacherById(int id)
	{
		boolean result = false;
		result = dao.delTeacherById(id);
		return result; 
	}
	
	//列出所有学生
	public List<Teacher> listAllTeacher()
	{
		List<Teacher> teas = new ArrayList<Teacher>();
		teas = dao.listAllTeacher();
		return teas;
		
	}
	
	//修改信息
	public boolean updateTeacher(Teacher tea)
	{
		boolean result = false;
		result = dao.updateTeacher(tea);
		return result; 
		
	}
	
	//是否已注册
	public boolean isTeacher(String name,String num)
	{
		boolean result = false;
		result = dao.isTeacher(name, num);
		return result;
		
	}
	
	//找回密码
	public String findPass(String name,String num)
	{
		String password = null;
		password = dao.findPass(name, num);
		return password;
	}
	
	public boolean loginTeacher(String num,String password)
	{
		boolean result = false;
		result = dao.loginTeacher(num, password);
		return result;
	}
	
	//添加成绩
	public boolean addScore(Score score,String num,String name)
	{
		boolean result = false;
		result = dao.addScore(score, num, name);
		return result; 
	}
	
	//修改成绩
	public boolean editScore(Score score,String num,String name)
	{
		boolean result = false;
		result = dao.editScore(score, num, name);
		return result; 
	}


}
