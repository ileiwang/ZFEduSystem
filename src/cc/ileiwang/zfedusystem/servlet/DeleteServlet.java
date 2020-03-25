package cc.ileiwang.zfedusystem.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cc.ileiwang.zfedusystem.factory.DAOFactory;
import cc.ileiwang.zfedusystem.vo.Admin;
import cc.ileiwang.zfedusystem.vo.Student;
import cc.ileiwang.zfedusystem.vo.Teacher;

/**
 * @author Lei Wang
 * @email 3970111@gmail.com
 * @blog www.ileiwang.cc
 * @version 2017年12月4日 上午9:28:06
 */
public class DeleteServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String type = request.getParameter("type");
		String num = request.getParameter("num");
		if (type.equals("stu")) {
			DAOFactory.getStudentDAOInstance().delStuByNum(num);
			request.getRequestDispatcher("/admin/listStu.jsp").forward(request, response);
		} else if (type.equals("tea")) {
			DAOFactory.getTeacherDAOInstance().delTeacherByNum(num);
			request.getRequestDispatcher("/admin/listTea.jsp").forward(request, response);
		} else if (type.equals("admin")) {
			DAOFactory.getAdminDAOInstance().delAdminByNum(num);
			request.getRequestDispatcher("/admin/listAdmin.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}
