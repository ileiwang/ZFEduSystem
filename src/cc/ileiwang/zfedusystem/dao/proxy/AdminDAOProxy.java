package cc.ileiwang.zfedusystem.dao.proxy;

import java.util.ArrayList;
import java.util.List;

import cc.ileiwang.zfedusystem.dao.AdminDAO;
import cc.ileiwang.zfedusystem.dao.impl.AdminDAOImpl;
import cc.ileiwang.zfedusystem.dbc.DatabaseConnection;
import cc.ileiwang.zfedusystem.vo.Admin;
import cc.ileiwang.zfedusystem.vo.Course;

/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2017锟斤拷12锟斤拷5锟斤拷 锟斤拷锟斤拷3:14:52
*/
public class AdminDAOProxy implements AdminDAO {
	private DatabaseConnection dbc = null;
	private AdminDAO dao = null;
	
	public AdminDAOProxy()
	{
		try
		{
			this.dbc = new DatabaseConnection();
			this.dao = new AdminDAOImpl(this.dbc.getConnection());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷询
	public Admin findAdminByName(String name)
	{
		Admin admin = null;
		admin = dao.findAdminByName(name);
		return admin; 
	}
	
	//锟斤拷锟斤拷学锟脚诧拷询
	public Admin findAdminByNum(String num)
	{
		Admin admin = null;
		admin = dao.findAdminByNum(num);
		return admin; 
	}
	
	//锟斤拷锟斤拷ID锟斤拷询
	public Admin findAdminById(int id)
	{
		Admin admin = null;
		admin = dao.findAdminById(id);
		return admin; 
	}
	
	//锟斤拷锟�
	public boolean addAdmin(Admin admin)
	{
		boolean result = false;
		result = dao.addAdmin(admin);
		return result; 
	}
	
	//锟斤拷锟斤拷学锟斤拷删锟斤拷
	public boolean delAdminByNum(String num)
	{
		boolean result = false;
		result = dao.delAdminByNum(num);
		return result; 
	}
	
	//锟斤拷锟斤拷锟斤拷锟斤拷删锟斤拷
	public boolean delAdminByName(String name)
	{
		boolean result = false;
		result = dao.delAdminByName(name);
		return result; 
	}
	
	//锟斤拷锟斤拷ID删锟斤拷
	public boolean delAdminById(int id)
	{
		boolean result = false;
		result = dao.delAdminById(id);
		return result; 
	}
	
	//锟叫筹拷锟斤拷锟斤拷学锟斤拷
	public List<Admin> listAllAdmin()
	{
		List<Admin> admins = new ArrayList<Admin>();
		admins = dao.listAllAdmin();
		return admins;
	}
	
	//锟睫革拷锟斤拷息
	public boolean updateAdmin(Admin admin)
	{
		boolean result = false;
		result = dao.updateAdmin(admin);
		return result; 
	}
	
	//锟角凤拷锟斤拷注锟斤拷
	public boolean isAdmin(String name,String num)
	{
		boolean result = false;
		result = dao.isAdmin(name,num);
		return result;
		
	}
	
	//锟揭伙拷锟斤拷锟斤拷
	public String findPass(String name,String num)
	{
		String password = null;
		password = dao.findPass(name,num);
		
		return password;
	}
	
	//锟斤拷录
	public boolean loginAdmin(String num,String password)
	{
		boolean result = false;
		result = dao.loginAdmin(num, password);
		return result;
	}
	
	public boolean addCourse(Course course)
	{
		boolean result = false;
		result = dao.addCourse(course);
		return result;
	}
}
