package cc.ileiwang.zfedusystem.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cc.ileiwang.zfedusystem.factory.DAOFactory;

public class FindPassServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String num = request.getParameter("num");
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		//HttpSession session = request.getSession();
		if(type.equals("student"))
		{
			String pass = DAOFactory.getStudentDAOInstance().findPass(name, num);
			if(pass.equals("nousermatch"))
			{
				request.getRequestDispatcher("findErro.jsp?error=没有匹配的用户！").forward(request, response);
			}
			else
			{
				String url = "findOK.jsp?pass="+pass+"";
				request.getRequestDispatcher(url).forward(request, response);
			}
		}
		else if(type.equals("teacher"))
		{
			String pass = DAOFactory.getTeacherDAOInstance().findPass(name, num);
			if(pass.equals("nousermatch"))
			{
				request.getRequestDispatcher("findErro.jsp?error=没有匹配的用户！").forward(request, response);
			}
			else
			{
				String url = "findOK.jsp?pass="+pass+"";
				request.getRequestDispatcher(url).forward(request, response);
			}
		}
		else if(type.equals("admin"))
		{
			String pass = DAOFactory.getAdminDAOInstance().findPass(name, num);
			if(pass.equals("nousermatch"))
			{
				request.getRequestDispatcher("findErro.jsp?error=没有匹配的用户！").forward(request, response);
			}
			else
			{
				String url = "findOK.jsp?pass="+pass+"";
				request.getRequestDispatcher(url).forward(request, response);
			}
		}
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request,response);
	}
}
