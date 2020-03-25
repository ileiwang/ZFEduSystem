package cc.ileiwang.zfedusystem.dao;

import java.util.List;

import cc.ileiwang.zfedusystem.vo.Score;
import cc.ileiwang.zfedusystem.vo.Teacher;

/**
* @author Lei Wang
* @email 3970111@gmail.com
* @blog www.ileiwang.cc
* @version 2017��12��5�� ����2:08:36
*/
public interface TeacherDAO {
	
	
	//����������ѯ
	public Teacher findTeacherByName(String name);
	
	//����ѧ�Ų�ѯ
	public Teacher findTeacherByNum(String num);
	
	//����ID��ѯ
	public Teacher findTeacherById(int id);
	
	//���
	public boolean addTeacher(Teacher tea);
	
	//����ѧ��ɾ��
	public boolean delTeacherByNum(String num);
	
	//��������ɾ��
	public boolean delTeacherByName(String name);
	
	//����IDɾ��
	public boolean delTeacherById(int id);
	
	//�г����н�ʦ
	public List<Teacher> listAllTeacher();
	
	//�޸���Ϣ
	public boolean updateTeacher(Teacher tea);
	
	//�Ƿ���ע��
	public boolean isTeacher(String name,String num);
	
	//�һ�����
	public String findPass(String name,String num);
	
	//��¼
	public boolean loginTeacher(String num,String password);
	
	//��ӳɼ�
	public boolean addScore(Score score,String num,String name);
	
	//�޸ĳɼ�
	public boolean editScore(Score score,String num,String name);

}
