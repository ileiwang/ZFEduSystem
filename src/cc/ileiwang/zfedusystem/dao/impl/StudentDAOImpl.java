package cc.ileiwang.zfedusystem.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cc.ileiwang.zfedusystem.vo.Student;
import cc.ileiwang.zfedusystem.dao.*;
import cc.ileiwang.zfedusystem.dbc.*;

/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2017��12��4�� ����7:48:47
*/
public class StudentDAOImpl implements StudentDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private Student stu = null;
	public StudentDAOImpl(Connection conn) {
		this.conn = conn;
	}

	//����������ѯ
	public Student findStuByName(String name)
	{
		try
		{
			String sql = "select * from Student where name=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1,name);
			ResultSet rs = this.pstmt.executeQuery();
			if(rs.next())
			{
				stu = new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DatabaseConnection.close(conn, pstmt, rs);
		}
		
		return stu; 
	}
	
	//����ѧ�Ų�ѯ
	public Student findStuByNum(String num)
	{
		try
		{
			String sql = "select * from Student where num=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1,num);
			ResultSet rs = this.pstmt.executeQuery();
			if(rs.next())
			{
				stu = new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DatabaseConnection.close(conn, pstmt, rs);
		}
		
		return stu; 
	}
	
	//����ID��ѯ
	public Student findStuById(int id)
	{
		try
		{
			String sql = "select * from Student where id=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setInt(1,id);
			rs = this.pstmt.executeQuery();
			if(rs.next())
			{
				stu = new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DatabaseConnection.close(conn, pstmt, rs);
		}
		
		return stu; 
	}
	
	//���
	public boolean addStu(Student stu)
	{
		boolean result = false;
		try
		{
			String sql = "insert into Student (num,name,birthday,sex,major,college,grade,password) values (?,?,?,?,?,?,?,?)";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, stu.getNum());
			this.pstmt.setString(2, stu.getName());
			this.pstmt.setString(3, stu.getBirthday());
			this.pstmt.setString(4, stu.getSex());
			this.pstmt.setString(5, stu.getMajor());
			this.pstmt.setString(6, stu.getCollege());
			this.pstmt.setString(7, stu.getGrade());
			this.pstmt.setString(8, stu.getPassword());
			this.pstmt.executeUpdate();
			result = true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DatabaseConnection.close(conn, pstmt, rs);
		}
		
		return result; 
	}
	
	//����ѧ��ɾ��
	public boolean delStuByNum(String num)
	{
		boolean result = false;
		try
		{
			String sql = "delete from Student where num=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1,num);
			this.pstmt.execute();
			result = true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DatabaseConnection.close(conn, pstmt, rs);
		}
		
		return result; 
	}
	
	//��������ɾ��
	public boolean delStuByName(String name)
	{
		boolean result = false;
		try
		{
			String sql = "delete from Student where name=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1,name);
			this.pstmt.execute();
			result = true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			DatabaseConnection.close(conn, pstmt, rs);
		}
		
		return result; 
	}
	
	//����IDɾ��
	public boolean delStuById(int id)
	{
		boolean result = false;
		try
		{
			String sql = "delete from Student where id=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setInt(1,id);
			this.pstmt.execute();
			result = true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DatabaseConnection.close(conn, pstmt, rs);
		}
		
		return result; 
	}
	
	//�г�����ѧ��
	public List<Student> listAllStu()
	{
		List<Student> stus = new ArrayList<Student>();
		try
		{
			String sql = "select * from Student";
			this.pstmt = this.conn.prepareStatement(sql);
			this.rs = this.pstmt.executeQuery();
			while(rs.next())
			{
				stu = new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
				stus.add(stu);
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DatabaseConnection.close(conn, pstmt, rs);
		}
		
		return stus;
		
	}
	
	//�޸���Ϣ
	public boolean updateStu(Student stu)
	{
		boolean result = false;
		try
		{
			String sql = "update Student set num=?,name=?,birthday=?,sex=?,major=?,college=?,grade=?,password=? where num=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, stu.getNum());
			this.pstmt.setString(2, stu.getName());
			this.pstmt.setString(3, stu.getBirthday());
			this.pstmt.setString(4, stu.getSex());
			this.pstmt.setString(5, stu.getMajor());
			this.pstmt.setString(6, stu.getCollege());
			this.pstmt.setString(7, stu.getGrade());
			this.pstmt.setString(8, stu.getPassword());
			this.pstmt.setString(9, stu.getNum());
			this.pstmt.executeUpdate();
			result = true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DatabaseConnection.close(conn, pstmt, rs);
		}
		
		return result; 
		
	}
	
	//�Ƿ���ע��
	public boolean isStu(String name,String num)
	{
		boolean result = false;
		try
		{
			String sql = "select * from Student where name=? and num=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, name);
			this.pstmt.setString(2, num);
			this.rs = this.pstmt.executeQuery();
			while(rs.next())
			{
				result = true;
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DatabaseConnection.close(conn, pstmt, rs);
		}
		
		return result;
		
	}
	
	//�һ�����
	public String findPass(String name,String num)
	{
		String password = null;
		int flag= 0;
		try
		{
			String sql = "select * from Student where name=? and num = ?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, name);
			this.pstmt.setString(2, num);
			this.rs = this.pstmt.executeQuery();
			while(rs.next())
			{
				password = rs.getString(9);
				flag = 1;
			}
			if(flag==0)
			{
				password = new String("nousermatch");
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DatabaseConnection.close(conn, pstmt, rs);
		}
		
		return password;
	}
	
	public boolean loginStu(String num,String password)
	{
		boolean result = false;
		try
		{
			String sql = "select * from Student where num=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, num);
			this.rs = this.pstmt.executeQuery();
			while(rs.next())
			{
				String pass = rs.getString(9);
				if(pass.equals(password))
				{
					result = true;
				}
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DatabaseConnection.close(conn, pstmt, rs);
		}
		return result;
	}
	public String findNameByNum(String num)
	{
		String name = null;
		int flag= 0;
		try
		{
			String sql = "select name from Student where num = ?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, num);
			this.rs = this.pstmt.executeQuery();
			while(rs.next())
			{
				name = rs.getString(1);
				flag = 1;
			}
			if(flag==0)
			{
				name = new String("nousermatch");
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DatabaseConnection.close(conn, pstmt, rs);
		}
		
		return name;
		
	}
}
