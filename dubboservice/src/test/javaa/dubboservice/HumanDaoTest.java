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

import entity.Human;

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
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		for(int i=0;i<list.size();i++){
			if(i==1){list.remove(2);
			}
				
			System.out.println(list.get(i));
		}
		for(Integer i:list){
			System.out.println(i);
		}
		ThreadPoolExecutor thereeee = new ThreadPoolExecutor();
		Executors.new
	}
}
