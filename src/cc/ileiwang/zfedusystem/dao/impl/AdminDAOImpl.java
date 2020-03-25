package cc.ileiwang.zfedusystem.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cc.ileiwang.zfedusystem.dao.AdminDAO;
import cc.ileiwang.zfedusystem.dbc.DatabaseConnection;
import cc.ileiwang.zfedusystem.vo.Admin;
import cc.ileiwang.zfedusystem.vo.Course;

/**
 * @author Lei Wang
 * @email 3970111@gmail.com
 * @blog www.ileiwang.cc
 * @version 2017锟斤拷12锟斤拷5锟斤拷 锟斤拷锟斤拷3:14:38
 */
public class AdminDAOImpl implements AdminDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private Admin admin = null;

	public AdminDAOImpl(Connection conn) {
		this.conn = conn;
	}

	// 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷询
	public Admin findAdminByName(String name) {
		try {
			String sql = "select * from Admin where name=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, name);
			ResultSet rs = this.pstmt.executeQuery();
			if (rs.next()) {
				admin = new Admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6));
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.close(conn, pstmt, rs);
		}

		return admin;
	}

	// 锟斤拷锟斤拷学锟脚诧拷询
	public Admin findAdminByNum(String num) {
		try {
			String sql = "select * from Admin where num=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, num);
			ResultSet rs = this.pstmt.executeQuery();
			if (rs.next()) {
				admin = new Admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6));
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.close(conn, pstmt, rs);
		}

		return admin;
	}

	// 锟斤拷锟斤拷ID锟斤拷询
	public Admin findAdminById(int id) {
		try {
			String sql = "select * from Admin where id=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setInt(1, id);
			rs = this.pstmt.executeQuery();
			if (rs.next()) {
				admin = new Admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6));
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.close(conn, pstmt, rs);
		}

		return admin;
	}

	// 锟斤拷锟�
	public boolean addAdmin(Admin admin) {
		boolean result = false;
		try {
			String sql = "insert into Admin values (?,?,?,?,?,?)";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setInt(1, admin.getId());
			this.pstmt.setString(2, admin.getNum());
			this.pstmt.setString(3, admin.getName());
			this.pstmt.setString(4, admin.getBirthday());
			this.pstmt.setString(5, admin.getSex());
			this.pstmt.setString(6, admin.getPassword());
			this.pstmt.executeUpdate();
			result = true;
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.close(conn, pstmt, rs);
		}

		return result;
	}

	// 锟斤拷锟斤拷学锟斤拷删锟斤拷
	public boolean delAdminByNum(String num) {
		boolean result = false;
		try {
			String sql = "delete from Admin where num=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, num);
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

	// 锟斤拷锟斤拷锟斤拷锟斤拷删锟斤拷
	public boolean delAdminByName(String name) {
		boolean result = false;
		try {
			String sql = "delete from Admin where name=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, name);
			this.pstmt.execute();
			result = true;
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			DatabaseConnection.close(conn, pstmt, rs);
		}

		return result;
	}

	// 锟斤拷锟斤拷ID删锟斤拷
	public boolean delAdminById(int id) {
		boolean result = false;
		try {
			String sql = "delete from Admin where id=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setInt(1, id);
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

	// 锟叫筹拷锟斤拷锟斤拷学锟斤拷
	public List<Admin> listAllAdmin() {
		List<Admin> admins = new ArrayList<Admin>();
		try {
			String sql = "select * from Admin";
			this.pstmt = this.conn.prepareStatement(sql);
			this.rs = this.pstmt.executeQuery();
			while (rs.next()) {
				admin = new Admin(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6));
				admins.add(admin);
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.close(conn, pstmt, rs);
		}

		return admins;

	}

	// 锟睫革拷锟斤拷息
	public boolean updateAdmin(Admin admin) {
		boolean result = false;
		try {
			String sql = "update Admin set num=?,name=?,birthday=?,sex=?,password=? where num=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, admin.getNum());
			this.pstmt.setString(2, admin.getName());
			this.pstmt.setString(3, admin.getBirthday());
			this.pstmt.setString(4, admin.getSex());
			this.pstmt.setString(5, admin.getPassword());
			this.pstmt.setString(6, admin.getNum());
			this.pstmt.executeUpdate();
			result = true;
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.close(conn, pstmt, rs);
		}

		return result;

	}

	// 锟角凤拷锟斤拷注锟斤拷
	public boolean isAdmin(String name, String num) {
		boolean result = false;
		try {
			String sql = "select * from Admin where name=? and num=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, name);
			this.pstmt.setString(2, num);
			this.rs = this.pstmt.executeQuery();
			while (rs.next()) {
				result = true;
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.close(conn, pstmt, rs);
		}

		return result;

	}

	// 锟揭伙拷锟斤拷锟斤拷
	public String findPass(String name, String num) {
		String password = null;
		int flag = 0;
		try {
			String sql = "select * from Admin where name= ? and num = ?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, name);
			this.pstmt.setString(2, num);
			this.rs = this.pstmt.executeQuery();
			while (rs.next()) {
				password = rs.getString(6);
				flag = 1;
			}
			if (flag == 0) {
				password = new String("nousermatch");
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		} finally {
			DatabaseConnection.close(conn, pstmt, rs);
		}

		return password;
	}

	public boolean loginAdmin(String num, String password) {
		boolean result = false;
		try {
			String sql = "select * from Admin where num=?";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, num);
			this.rs = this.pstmt.executeQuery();
			while (rs.next()) {
				String pass = rs.getString(6);
				if (pass.equals(password)) {
					result = true;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			return result;
		} finally {
			DatabaseConnection.close(conn, pstmt, rs);
		}
		return result;
	}

	public boolean addCourse(Course course) {
		boolean result = false;
		try {
			String sql = "insert into Course (num,major,college,grade,day,one,two,three,four) VALUES(?,?,?,?,?,?,?,?,?)";
			this.pstmt = this.conn.prepareStatement(sql);
			this.pstmt.setString(1, course.getNum());
			this.pstmt.setString(2, course.getMajor());
			this.pstmt.setString(3, course.getCollege());
			this.pstmt.setString(4, course.getGrade());
			this.pstmt.setString(5, course.getDay());
			this.pstmt.setString(6, course.getOne());
			this.pstmt.setString(7, course.getTwo());
			this.pstmt.setString(8, course.getThree());
			this.pstmt.setString(9, course.getFour());
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
