package cc.ileiwang.zfedusystem.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cc.ileiwang.zfedusystem.factory.*;

/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2017��12��4�� ����9:18:11
*/
public class LoginServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String num = request.getParameter("num");
		String password = request.getParameter("password");
		String type = request.getParameter("type");
		HttpSession session = request.getSession();
		if(type.equals("student"))
		{
			if(DAOFactory.getStudentDAOInstance().loginStu(num, password))
			{
				session.setAttribute("type", type);
				session.setAttribute("num", num);
				request.getRequestDispatcher("/student/main.jsp").forward(request, response);
				//response.sendRedirect("/ZFEduSystem/student/main.jsp");
			}
			else
			{
				request.getRequestDispatcher("logerror.jsp?error=学号或密码输入错误！").forward(request, response);
			}
		}
		else if(type.equals("teacher"))
		{
			if(DAOFactory.getTeacherDAOInstance().loginTeacher(num, password))
			{
				session.setAttribute("type", type);
				session.setAttribute("num", num);
				request.getRequestDispatcher("/teacher/main.jsp").forward(request, response);
			}
			else
			{
				request.getRequestDispatcher("logerror.jsp?error=教师号或密码输入错误！").forward(request, response);
			}
		}
		else if(type.equals("admin"))
		{
			if(DAOFactory.getAdminDAOInstance().loginAdmin(num, password))
			{
				session.setAttribute("type", type);
				session.setAttribute("num", num);
				request.getRequestDispatcher("/admin/main.jsp").forward(request, response);
			}
			else
			{
				request.getRequestDispatcher("logerror.jsp?error=管理号或密码输入错误！").forward(request, response);
			}
		}
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request,response);
	}
}
