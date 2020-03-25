package cc.ileiwang.zfedusystem.dao;

import java.util.List;

import cc.ileiwang.zfedusystem.vo.Admin;
import cc.ileiwang.zfedusystem.vo.Course;

/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2017��12��5�� ����3:14:26
*/
public interface AdminDAO {
	
	//����������ѯ
	public Admin findAdminByName(String name);
	
	//����ѧ�Ų�ѯ
	public Admin findAdminByNum(String num);
	
	//����ID��ѯ
	public Admin findAdminById(int id);
	
	//���
	public boolean addAdmin(Admin admin);
	
	//���ݹ���Ա����ɾ��
	public boolean delAdminByNum(String num);
	
	//��������ɾ��
	public boolean delAdminByName(String name);
	
	//����IDɾ��
	public boolean delAdminById(int id);
	
	//�г����й���Ա
	public List<Admin> listAllAdmin();
	
	//�޸���Ϣ
	public boolean updateAdmin(Admin admin);
	
	//�Ƿ���ע��
	public boolean isAdmin(String name,String num);
	
	//�һ�����
	public String findPass(String name,String num);
	
	//��¼
	public boolean loginAdmin(String num,String password);
	
	//��ӿα�
	public boolean addCourse(Course course);
	
}
