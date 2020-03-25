package cc.ileiwang.zfedusystem.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cc.ileiwang.zfedusystem.factory.DAOFactory;
import cc.ileiwang.zfedusystem.vo.Blog;


/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2018年1月4日 下午1:24:27
*/
public class AddBlogServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String date = request.getParameter("date");
		String title = request.getParameter("title");
		String body = request.getParameter("body");
		String num = request.getParameter("num");
		String name = DAOFactory.getStudentDAOInstance().findNameByNum(num);
		Blog blog = new Blog();
		blog.setAuthor(name);
		blog.setBody(body);
		blog.setNum(num);
		blog.setTitle(title);
		blog.setDate(date);
		DAOFactory.getBlogDAOInstance().addBlog(blog);
		request.getRequestDispatcher("/student/blogindex.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		this.doGet(request,response);
	}
}
