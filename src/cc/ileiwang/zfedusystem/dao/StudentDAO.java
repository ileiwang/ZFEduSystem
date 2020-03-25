package cc.ileiwang.zfedusystem.dao;
/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2017��12��4�� ����7:41:00
*/
import java.util.List;

import cc.ileiwang.zfedusystem.vo.*;

public interface StudentDAO {
	
	//����������ѯ
	public Student findStuByName(String name);
	
	//����ѧ�Ų�ѯ
	public Student findStuByNum(String num);
	
	//����ID��ѯ
	public Student findStuById(int id);
	
	//���
	public boolean addStu(Student stu);
	
	//����ѧ��ɾ��
	public boolean delStuByNum(String num);
	
	//��������ɾ��
	public boolean delStuByName(String name);
	
	//����IDɾ��
	public boolean delStuById(int id);
	
	//�г�����ѧ��
	public List<Student> listAllStu();
	
	//�޸���Ϣ
	public boolean updateStu(Student stu);
	
	//�Ƿ���ע��
	public boolean isStu(String name,String num);
	
	//�һ�����
	public String findPass(String name,String num);
	
	//��¼
	public boolean loginStu(String num,String password);
	
	public String findNameByNum(String num);
}
