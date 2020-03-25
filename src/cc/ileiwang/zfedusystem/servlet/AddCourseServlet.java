package cc.ileiwang.zfedusystem.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cc.ileiwang.zfedusystem.factory.DAOFactory;
import cc.ileiwang.zfedusystem.vo.Admin;
import cc.ileiwang.zfedusystem.vo.Course;
import cc.ileiwang.zfedusystem.vo.Student;
import cc.ileiwang.zfedusystem.vo.Teacher;

/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2017年12月13日 上午10:39:23
*/
public class AddCourseServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String num = request.getParameter("num");
		String major = request.getParameter("major");
		String college = request.getParameter("college");
		String grade = request.getParameter("grade");
		String day = request.getParameter("day");
		String one = request.getParameter("one");
		String two = request.getParameter("two");
		String three = request.getParameter("three");
		String four = request.getParameter("four");
		Course course = new Course(num,day,one,two,three,four,major,college,grade);
		DAOFactory.getAdminDAOInstance().addCourse(course);
		request.getRequestDispatcher("/admin/main.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request,response);
	}
}
