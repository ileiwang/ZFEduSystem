package cc.ileiwang.zfedusystem.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cc.ileiwang.zfedusystem.factory.DAOFactory;
import cc.ileiwang.zfedusystem.vo.*;

/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2017锟斤拷12锟斤拷4锟斤拷 锟斤拷锟斤拷9:27:48
*/
public class RegisterServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String type = request.getParameter("type");
		HttpSession session = request.getSession();
		if(type.equals("student"))
		{
			Student stu = new Student(request.getParameter("num"),request.getParameter("name"),request.getParameter("birthday"),request.getParameter("sex"),request.getParameter("major"),request.getParameter("college"),request.getParameter("grade"),request.getParameter("password"));
			if(DAOFactory.getStudentDAOInstance().addStu(stu))
			{
				session.setAttribute("type", type);
				session.setAttribute("num", request.getParameter("num"));
				request.getRequestDispatcher("/student/main.jsp").forward(request, response);
			}
			else
			{
				request.getRequestDispatcher("logerror.jsp?error=注册失败").forward(request, response);
			}
		}
		else if(type.equals("teacher"))
		{
			Teacher tea = new Teacher(request.getParameter("num"),request.getParameter("name"),request.getParameter("birthday"),request.getParameter("sex"),request.getParameter("major"),request.getParameter("college"),request.getParameter("grade"),request.getParameter("password"));
			if(DAOFactory.getTeacherDAOInstance().addTeacher(tea))
			{
				session.setAttribute("type", type);
				session.setAttribute("num", request.getParameter("num"));
				request.getRequestDispatcher("/teacher/main.jsp").forward(request, response);
			}
			else
			{
				request.getRequestDispatcher("logerror.jsp?error=注册失败").forward(request, response);
			}
		}
		else if(type.equals("admin"))
		{
			Admin admin = new Admin(request.getParameter("num"),request.getParameter("name"),request.getParameter("birthday"),request.getParameter("sex"),request.getParameter("password"));
			if(DAOFactory.getAdminDAOInstance().addAdmin(admin))
			{
				session.setAttribute("type", type);
				session.setAttribute("num", request.getParameter("num"));
				request.getRequestDispatcher("/admin/main.jsp").forward(request, response);
			}
			else
			{
				request.getRequestDispatcher("logerror.jsp?error=注册失败").forward(request, response);
			}
		}
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request,response);
	}
}
