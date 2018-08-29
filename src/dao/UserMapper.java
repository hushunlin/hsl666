package dao;

import java.util.List;

import entity.Spare;
import entity.User;

public interface UserMapper {
	
	/**
	 * 查询记录数
	 * @return
	 */
	public int count();
	/**
	 * 查询用户
	 * @return
	 */
	public List<User> query();
	
	/**
	 * 输出设备列表
	 * @return
	 */
	public List<Spare> query1();
}
