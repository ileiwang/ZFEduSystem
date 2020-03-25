package cc.ileiwang.zfedusystem.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cc.ileiwang.zfedusystem.factory.DAOFactory;
import cc.ileiwang.zfedusystem.vo.Admin;
import cc.ileiwang.zfedusystem.vo.Student;
import cc.ileiwang.zfedusystem.vo.Teacher;

/**
 * @author Lei Wang
 * @email 3970111@gmail.com
 * @blog www.ileiwang.cc
 * @version 2017年12月4日 上午9:27:26
 */
public class UpdateServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String type = request.getParameter("type");
		if (type.equals("stu")) {
			String num = request.getParameter("num");
			String name = request.getParameter("name");
			String sex = request.getParameter("sex");
			String birthday = request.getParameter("birthday");
			String major = request.getParameter("major");
			String college = request.getParameter("college");
			String grade = request.getParameter("grade");
			Student stu = new Student(num, name, birthday, sex, major, college, grade,
					DAOFactory.getStudentDAOInstance().findPass(name, num));
			if (DAOFactory.getStudentDAOInstance().updateStu(stu)) {
				// request.getRequestDispatcher("/admin/listStu.jsp").forward(request,
				// response);
				response.sendRedirect("/ZFEduSystem/admin/listStu.jsp");
			} else {
				request.getRequestDispatcher("logerror.jsp?error=ѧ�Ż�������������µ�¼��").forward(request, response);
			}
		} else if (type.equals("tea")) {
			String num = request.getParameter("num");
			String name = request.getParameter("name");
			// System.out.println(name);
			String sex = request.getParameter("sex");
			String birthday = request.getParameter("birthday");
			String major = request.getParameter("major");
			String college = request.getParameter("college");
			String grade = request.getParameter("grade");
			Teacher tea = new Teacher(num, name, birthday, sex, major, college, grade,
					DAOFactory.getTeacherDAOInstance().findPass(name, num));
			if (DAOFactory.getTeacherDAOInstance().updateTeacher(tea)) {
				// request.getRequestDispatcher("/teacher/main.jsp").forward(request, response);
				response.sendRedirect("/ZFEduSystem/admin/listTea.jsp");
			} else {
				request.getRequestDispatcher("logerror.jsp?error=�̹��Ż�������������µ�¼��").forward(request, response);
			}
		} else if (type.equals("admin")) {
			String num = request.getParameter("num");
			String name = request.getParameter("name");
			String sex = request.getParameter("sex");
			String birthday = request.getParameter("birthday");
			Admin admin = new Admin(num, name, birthday, sex, DAOFactory.getAdminDAOInstance().findPass(name, num));
			if (DAOFactory.getAdminDAOInstance().updateAdmin(admin)) {
				// request.getRequestDispatcher("/admin/main.jsp").forward(request, response);
				response.sendRedirect("/ZFEduSystem/admin/listAdmin.jsp");
			} else {
				request.getRequestDispatcher("logerror.jsp?error=����Ż�������������µ�¼��").forward(request, response);
			}
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}
