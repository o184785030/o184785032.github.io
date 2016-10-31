package dal;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DalSqlSessionFactoryBean implements InitializingBean {
	private DataSource dataSource;
	private String res;
	SqlSessionFactoryBean sqlSessionFactoryBean;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public void setRes(String res) {
		this.res = res;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		Resource ress = new ClassPathXmlApplicationContext().getResource("sqlmap-config.xml") ;
		sqlSessionFactoryBean.setConfigLocation(ress);
	}
	
	public SqlSession getSqlSession(){
		try {
			return sqlSessionFactoryBean.getObject().openSession();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
