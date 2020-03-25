package cc.ileiwang.zfedusystem.dao;

import java.util.List;

import cc.ileiwang.zfedusystem.vo.Score;
import cc.ileiwang.zfedusystem.vo.Teacher;

/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2017年12月5日 下午2:08:36
*/
public interface TeacherDAO {
	
	
	//根据姓名查询
	public Teacher findTeacherByName(String name);
	
	//根据学号查询
	public Teacher findTeacherByNum(String num);
	
	//根据ID查询
	public Teacher findTeacherById(int id);
	
	//添加
	public boolean addTeacher(Teacher tea);
	
	//根据学号删除
	public boolean delTeacherByNum(String num);
	
	//根据姓名删除
	public boolean delTeacherByName(String name);
	
	//根据ID删除
	public boolean delTeacherById(int id);
	
	//列出所有教师
	public List<Teacher> listAllTeacher();
	
	//修改信息
	public boolean updateTeacher(Teacher tea);
	
	//是否已注册
	public boolean isTeacher(String name,String num);
	
	//找回密码
	public String findPass(String name,String num);
	
	//登录
	public boolean loginTeacher(String num,String password);
	
	//添加成绩
	public boolean addScore(Score score,String num,String name);
	
	//修改成绩
	public boolean editScore(Score score,String num,String name);

}
