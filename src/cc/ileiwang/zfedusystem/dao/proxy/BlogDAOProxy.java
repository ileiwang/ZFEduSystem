package cc.ileiwang.zfedusystem.dao.proxy;

import java.util.ArrayList;
import java.util.List;

import cc.ileiwang.zfedusystem.dao.BlogDAO;
import cc.ileiwang.zfedusystem.dao.impl.BlogDAOImpl;
import cc.ileiwang.zfedusystem.dbc.DatabaseConnection;
import cc.ileiwang.zfedusystem.vo.Blog;

/**
 * @author Lei Wang
 * @email 3970111@gmail.com
 * @blog www.ileiwang.cc
 * @version 2017年12月23日 下午5:17:38
 */
public class BlogDAOProxy implements BlogDAO {
	private DatabaseConnection dbc = null;
	private BlogDAO dao = null;

	public BlogDAOProxy() {
		try {
			this.dbc = new DatabaseConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.dao = new BlogDAOImpl(this.dbc.getConnection());
	}

	public Blog findBlogByAuthor(String author) {
		Blog blog = dao.findBlogByAuthor(author);
		return blog;
	}

	public Blog findBlogByNum(String num) {
		Blog blog = dao.findBlogByNum(num);
		return blog;
	}

	public Blog newBlog(String author, String num, String title, String body, String date) {
		Blog blog = dao.newBlog(author, num, title, body, date);
		return blog;
	}

	public boolean deleteBlogByNum(String title, String num) {
		boolean result = dao.deleteBlogByNum(title, num);
		return result;
	}

	public boolean modifyBlog(String title, String num, String newbody) {
		boolean result = dao.modifyBlog(title, num, newbody);
		return result;
	}

	public List<Blog> listAllBlog() {
		List<Blog> blogs = dao.listAllBlog();
		return blogs;
	}

	public List<Blog> listAllByNum(String num) {
		List<Blog> blogs = new ArrayList<Blog>();
		blogs = dao.listAllByNum(num);
		return blogs;
	}

	public boolean addBlog(Blog blog) {
		boolean result = dao.addBlog(blog);
		return result;
	}
}
