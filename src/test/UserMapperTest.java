package test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;

import dao.MyBatisUtil;
import dao.UserMapper;
import entity.Spare;
import entity.User;

public class UserMapperTest {
	
	private Logger logger = Logger.getLogger("UserMapperTest");
	
	@Test
	public void Test3(){
		SqlSession sqlSession = null;
		List<Spare> list = new ArrayList<Spare>();
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			list = sqlSession.getMapper(UserMapper.class).query1();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
		System.out.println("型号\t出厂价格\t出厂日期");
		for (Spare s : list) {
			System.out.println(s.getType()+"\t"+s.getFactoryprice()+"\t"+s.getDateproduction());
		}
	}
	
	@Test
	public void Test2(){
		SqlSession sqlSession = null;
		List<User> userList = new ArrayList<User>();
		try {
			sqlSession = MyBatisUtil.createSqlSession();
			//userList = sqlSession.selectList("dao.UserMapper.query");
			userList = sqlSession.getMapper(UserMapper.class).query();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
		
		for (User user : userList) {
			System.out.println("用户列表"+user.getUserName()+"\n"+user.getUserCode());
		}
	}
	
	@Test
	public void Test1(){
		SqlSession sqlSession = null;
		try {
			String resource = "mybatis-config.xml";
			InputStream is = Resources.getResourceAsStream(resource);
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			int count = 0;
			sqlSession = factory.openSession();
			count = sqlSession.selectOne("dao.UserMapper.count");
			//count = sqlSession.getMapper(dao.UserMapper.class).count();
			logger.debug("UserMapper count--->"+count);
			System.out.println("count="+count);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
	}
}
