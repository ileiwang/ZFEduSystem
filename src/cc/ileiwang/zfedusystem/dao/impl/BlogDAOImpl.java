package cc.ileiwang.zfedusystem.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cc.ileiwang.zfedusystem.dao.BlogDAO;
import cc.ileiwang.zfedusystem.dbc.DatabaseConnection;
import cc.ileiwang.zfedusystem.vo.Admin;
import cc.ileiwang.zfedusystem.vo.Blog;
import cc.ileiwang.zfedusystem.vo.Student;

/**
 * @author Lei Wang
 * @email 3970111@gmail.com
 * @blog www.ileiwang.cc
 * @version 2017年12月23日 下午12:12:37
 */
public class BlogDAOImpl implements BlogDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private Blog blog = null;

	public BlogDAOImpl(Connection conn) {
		this.conn = conn;
	}

	public Blog findBlogByAuthor(String author) {
		try {
			String sql = "select * from Blog where author= ?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, author);
			ResultSet rs = this.pstmt.executeQuery();
			if (rs.next()) {
				blog = new Blog(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.close(conn, pstmt, rs);
		}

		return blog;
	}

	public Blog findBlogByNum(String num) {
		try {
			String sql = "select * from Blog where num= ?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, num);
			ResultSet rs = this.pstmt.executeQuery();
			if (rs.next()) {
				blog = new Blog(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.close(conn, pstmt, rs);
		}

		return blog;
	}

	public Blog newBlog(String author, String num, String title, String body, String date) {
		return new Blog(author, num, title, body, date);
	}

	public boolean deleteBlogByNum(String title, String num) {
		boolean result = false;
		try {
			String sql = "delete from Blog where title=? and num = ?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, title);
			this.pstmt.setString(2, num);
			this.pstmt.execute();
			result = true;
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.close(conn, pstmt, rs);
		}

		return result;
	}

	public boolean modifyBlog(String title, String num, String newbody) {

		boolean result = false;
		try {
			String sql = "update Blog set body= ? where num= ? and title= ?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, newbody);
			this.pstmt.setString(2, num);
			this.pstmt.setString(3, title);
			this.pstmt.execute();
			result = true;
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.close(conn, pstmt, rs);
		}
		return result;
	}

	public List<Blog> listAllBlog() {
		List<Blog> blogs = new ArrayList<Blog>();
		try {
			String sql = "select * from Blog";
			this.pstmt = this.conn.prepareStatement(sql);
			this.rs = this.pstmt.executeQuery();
			while (rs.next()) {
				blog = new Blog(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				blogs.add(blog);
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.close(conn, pstmt, rs);
		}

		return blogs;
	}

	public List<Blog> listAllByNum(String num) {
		List<Blog> blogs = new ArrayList<Blog>();
		try {
			String sql = "select * from Blog where num = ?";

			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, num);
			this.rs = this.pstmt.executeQuery();
			while (rs.next()) {
				blog = new Blog(rs.getString(2), rs.getString(1), rs.getString(3), rs.getString(4), rs.getString(5));// author
																														// num
																														// title
																														// body
																														// date
				blogs.add(blog);
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.close(conn, pstmt, rs);
		}

		return blogs;
	}

	public boolean addBlog(Blog blog) {
		boolean result = false;
		try {
			String sql = "insert into Blog (num,author,title,body,date) VALUES(?,?,?,?,?)";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, blog.getNum());
			this.pstmt.setString(2, blog.getAuthor());
			this.pstmt.setString(3, blog.getTitle());
			this.pstmt.setString(4, blog.getBody());
			this.pstmt.setString(5, blog.getDate());
			this.pstmt.executeUpdate();
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			return result;
		} finally {
			DatabaseConnection.close(conn, pstmt, rs);
		}
		return result;
	}
}
