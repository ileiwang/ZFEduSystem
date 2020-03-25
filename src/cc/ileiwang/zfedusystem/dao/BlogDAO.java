package cc.ileiwang.zfedusystem.dao;

import java.util.List;

import cc.ileiwang.zfedusystem.vo.Blog;

/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2017年12月23日 下午12:09:51
*/
public interface BlogDAO {
	public Blog findBlogByAuthor(String author);
	public Blog findBlogByNum(String num);
	public Blog newBlog(String author,String num,String title,String body,String date);
	public boolean deleteBlogByNum(String title,String num);
	public boolean modifyBlog(String title,String num,String newbody);
	public List<Blog> listAllBlog();
	public List<Blog> listAllByNum(String num);
	public boolean addBlog(Blog blog);
}
