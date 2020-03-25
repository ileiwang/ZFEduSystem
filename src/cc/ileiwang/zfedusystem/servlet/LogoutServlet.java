package cc.ileiwang.zfedusystem.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2017��12��4�� ����9:27:02
*/
public class LogoutServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		
		String operation = request.getParameter("operation");
		if(operation.equals("logout"))
		{
			HttpSession session = request.getSession(false);// ��ֹ������Session
			if (session == null) {
				System.out.println("��ǰδ��¼");
				request.getRequestDispatcher("login.jsp").forward(request, response);
				return;
			}
			session.invalidate();
			System.out.println("�˳���¼");
			Cookie[] cookies = request.getCookies();
			if (cookies == null) {
				System.out.println("no cookie");
			} else {
				System.out.println("cookie:" + cookies[0].getName() + " " + cookies[0].getValue());
			}
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}

	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request,response);
	}

}
