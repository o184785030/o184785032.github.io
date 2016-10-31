package dubboservice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ThreadPoolExecutor;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import dao.HumanDao;
import entity.Human;
import utils.SpringBeanUtils;

public class HumanDaoTest {
	
	public static void main(String[] args) {
//		System.out.println("dssss");
//		DataSource dataSource = (DataSource) new ClassPathXmlApplicationContext("application.xml").getBean("dataSource");
//		
//		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//		sqlSessionFactoryBean.setDataSource(dataSource);
//		
//		String resource = "sqlmap.xml";
//		Resource res = new ClassPathXmlApplicationContext().getResource("humansqlmap.xml");
//		
//		sqlSessionFactoryBean.setMapperLocations(new Resource[]{res});
//		
//		try {
//			SqlSession sqlSession = sqlSessionFactoryBean.getObject().openSession();
//			Human human = sqlSession.selectOne("selectHumanById");
//			
//			System.out.println(human.getName());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//HumanDao humanDao = (HumanDao) SpringBeanUtils.getBean("humanDao");
		//System.out.println(((HumanDao)SpringBeanUtils.getBean("humanDao")).queryHumanById(1).getName());
		System.out.println(System.getProperty("wcc.root.path"));
		System.out.println(System.getenv("wcc.root.path"));
		
		System.out.println(("ssssss".split("_"))[1]);
	}
}
