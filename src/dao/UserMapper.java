package dao;

import java.util.List;

import entity.Spare;
import entity.User;

public interface UserMapper {
	
	/**
	 * ��ѯ��¼��
	 * @return
	 */
	public int count();
	/**
	 * ��ѯ�û�
	 * @return
	 */
	public List<User> query();
	
	/**
	 * ����豸�б�
	 * @return
	 */
	public List<Spare> query1();
}
