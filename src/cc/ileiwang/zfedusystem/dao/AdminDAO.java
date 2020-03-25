package cc.ileiwang.zfedusystem.dao;

import java.util.List;

import cc.ileiwang.zfedusystem.vo.Admin;
import cc.ileiwang.zfedusystem.vo.Course;

/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2017年12月5日 下午3:14:26
*/
public interface AdminDAO {
	
	//根据姓名查询
	public Admin findAdminByName(String name);
	
	//根据学号查询
	public Admin findAdminByNum(String num);
	
	//根据ID查询
	public Admin findAdminById(int id);
	
	//添加
	public boolean addAdmin(Admin admin);
	
	//根据管理员工号删除
	public boolean delAdminByNum(String num);
	
	//根据姓名删除
	public boolean delAdminByName(String name);
	
	//根据ID删除
	public boolean delAdminById(int id);
	
	//列出所有管理员
	public List<Admin> listAllAdmin();
	
	//修改信息
	public boolean updateAdmin(Admin admin);
	
	//是否已注册
	public boolean isAdmin(String name,String num);
	
	//找回密码
	public String findPass(String name,String num);
	
	//登录
	public boolean loginAdmin(String num,String password);
	
	//添加课表
	public boolean addCourse(Course course);
	
}
