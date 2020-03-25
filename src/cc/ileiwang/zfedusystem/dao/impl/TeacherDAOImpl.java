package cc.ileiwang.zfedusystem.dao.impl;

import java.util.List;

import cc.ileiwang.zfedusystem.vo.Score;
import cc.ileiwang.zfedusystem.vo.Teacher;
import cc.ileiwang.zfedusystem.vo.Teacher;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cc.ileiwang.zfedusystem.vo.Teacher;
import cc.ileiwang.zfedusystem.dao.*;
import cc.ileiwang.zfedusystem.dbc.*;

/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2017��12��5�� ����2:13:48
*/
public class TeacherDAOImpl implements TeacherDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private Teacher tea = null;
	public TeacherDAOImpl(Connection conn) {
		this.conn = conn;
	}
	//����������ѯ
	public Teacher findTeacherByName(String name)
	{
		try
		{
			String sql = "select * from Teacher where name=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1,name);
			ResultSet rs = this.pstmt.executeQuery();
			if(rs.next())
			{
				tea = new Teacher(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
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
		
		return tea; 
	}
	
	//����ѧ�Ų�ѯ
	public Teacher findTeacherByNum(String num)
	{
		try
		{
			String sql = "select * from Teacher where num=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1,num);
			ResultSet rs = this.pstmt.executeQuery();
			if(rs.next())
			{
				tea = new Teacher(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
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
		
		return tea; 
	}
	
	//����ID��ѯ
	public Teacher findTeacherById(int id)
	{
		try
		{
			String sql = "select * from Teacher where id=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setInt(1,id);
			rs = this.pstmt.executeQuery();
			if(rs.next())
			{
				tea = new Teacher(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
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
		
		return tea; 
	}
	
	//���
	public boolean addTeacher(Teacher tea)
	{
		boolean result = false;
		try
		{
			String sql = "insert into Teacher values (?,?,?,?,?,?,?,?,?)";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setInt(1,tea.getId());
			this.pstmt.setString(2, tea.getNum());
			this.pstmt.setString(3, tea.getName());
			this.pstmt.setString(4, tea.getBirthday());
			this.pstmt.setString(5, tea.getSex());
			this.pstmt.setString(6, tea.getMajor());
			this.pstmt.setString(7, tea.getCollege());
			this.pstmt.setString(8, tea.getGrade());
			this.pstmt.setString(9, tea.getPassword());
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
	public boolean delTeacherByNum(String num)
	{
		boolean result = false;
		try
		{
			String sql = "delete from Teacher where num=?";
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
	public boolean delTeacherByName(String name)
	{
		boolean result = false;
		try
		{
			String sql = "delete from Teacher where name=?";
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
	public boolean delTeacherById(int id)
	{
		boolean result = false;
		try
		{
			String sql = "delete from Teacher where id=?";
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
	public List<Teacher> listAllTeacher()
	{
		List<Teacher> teas = new ArrayList<Teacher>();
		try
		{
			String sql = "select * from Teacher";
			this.pstmt = this.conn.prepareStatement(sql);
			this.rs = this.pstmt.executeQuery();
			while(rs.next())
			{
				tea = new Teacher(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
				teas.add(tea);
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
		
		return teas;
		
	}
	
	//�޸���Ϣ
	public boolean updateTeacher(Teacher tea)
	{
		boolean result = false;
		try
		{
			String sql = "update Teacher set num=?,name=?,birthday=?,sex=?,major=?,college=?,grade=?,password=? where num=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, tea.getNum());
			this.pstmt.setString(2, tea.getName());
			this.pstmt.setString(3, tea.getBirthday());
			this.pstmt.setString(4, tea.getSex());
			this.pstmt.setString(5, tea.getMajor());
			this.pstmt.setString(6, tea.getCollege());
			this.pstmt.setString(7, tea.getGrade());
			this.pstmt.setString(8, tea.getPassword());
			this.pstmt.setString(9, tea.getNum());
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
	public boolean isTeacher(String name,String num)
	{
		boolean result = false;
		try
		{
			String sql = "select * from Teacher where name=? and num=?";
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
		int flag = 0;
		try
		{
			String sql = "select * from Teacher where name=? and num = ?";
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
	
	public boolean loginTeacher(String num,String password)
	{
		boolean result = false;
		try
		{
			String sql = "select * from Teacher where num=?";
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
	
	//��ӳɼ�
	public boolean addScore(Score score,String num,String name)
	{
		boolean result = false;
		
		try
		{
			String sql = "insert into Score (num,name,c,cpp,java,python) values (?,?,?,?,?,?)";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, num);
			this.pstmt.setString(2, name);
			this.pstmt.setString(3, score.getC());
			this.pstmt.setString(4, score.getCpp());
			this.pstmt.setString(5, score.getJava());
			this.pstmt.setString(6, score.getPython());
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
	
	//�޸ĳɼ�
	public boolean editScore(Score score,String num,String name)
	{
		boolean result = false;
		
		try
		{
			String sql = "update Score set c=?,cpp=?,java=?,python=? where num=? and name=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1,score.getC());
			this.pstmt.setString(2, score.getCpp());
			this.pstmt.setString(3, score.getJava());
			this.pstmt.setString(4, score.getPython());
			this.pstmt.setString(5, num);
			this.pstmt.setString(6, name);
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

}
