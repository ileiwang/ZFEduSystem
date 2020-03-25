package cc.ileiwang.zfedusystem.factory;

import cc.ileiwang.zfedusystem.dao.*;
import cc.ileiwang.zfedusystem.dao.proxy.*;
/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2017��12��4�� ����9:15:32
*/
public class DAOFactory {
	public static StudentDAO getStudentDAOInstance()
	{
		return new StudentDAOProxy();
	}
	
	public static TeacherDAO getTeacherDAOInstance()
	{
		return new TeacherDAOProxy();
	}
	
	public static AdminDAO getAdminDAOInstance()
	{
		return new AdminDAOProxy();
	}
	
	public static BlogDAO getBlogDAOInstance()
	{
		return new BlogDAOProxy();
	}
}
