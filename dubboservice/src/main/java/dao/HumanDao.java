package dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

import dal.DalUtils;
import entity.Human;

public class HumanDao implements InitializingBean{
	//private SqlSessionFactoryBuilder sqlSessionBuilder;
	//DalSqlSessionFactoryBean dalSqlSessionFactoryBean;
	DalUtils dalUtils;
	Logger logger = LoggerFactory.getLogger(HumanDao.class);
	
	public void setDalUtils(DalUtils dalUtils) {
		this.dalUtils = dalUtils;
	}

	public HumanDao(){
		System.out.println("开始添加");
		addHuman();
	}
	
	public void addHuman(){
	}
	
	public Human queryHumanById(Integer id){
		System.out.println("+++++++++++++++");
		return dalUtils.selectOne("selectHumanById");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		SqlSessionFactory sqlSessionFactory;
		try {
			
			//mybatis的配置文件
//			String resource = "sqlmap.xml";
//			Resource res = new ClassPathXmlApplicationContext().getResource("humansqlmap.xml");
			//使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
			//InputStream is = HumanDao.class.getClassLoader().getResourceAsStream(resource);
			//构建sqlSession的工厂
			//sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			//sqlSessionFactoryBean.setConfigLocation(res);
			//SqlSession sss=sqlSessionFactoryBean.getObject().openSession();
			
			//Object object = new ClassPathXmlApplicationContext("application.xml").getBean("sqlSessionFactoryBean");
			//sqlSessionFactoryBean = (SqlSessionFactoryBean) object;
			//使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
			//InputStream is = HumanDao.class.getClassLoader().getResourceAsStream(resource);
			//构建sqlSession的工厂
			//sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			//sqlSessionFactoryBean.setConfigLocation(res);
			
			//SqlSession sss1=dalSqlSessionFactoryBean.getSqlSession();
			//Human human = new Human();
			//human.setAge(20);
			//human.setName(new SimpleDateFormat("yy-mm-dd hh:mm:ss").format(new Date()));
			
			
//			Human human = dalUtils.selectOne("selectHumanById");
//			logger.error(String.valueOf(human.getAge()));
//			System.out.println(human.getName());
//			System.setProperty("log4j.configuration", "log4j.properties");
//			System.out.println(System.getProperty("log4j.configuration"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
