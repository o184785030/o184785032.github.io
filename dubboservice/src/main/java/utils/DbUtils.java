package utils;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.TransactionIsolationLevel;

public class DbUtils implements SqlSessionFactory{
	String driverName;
	String name;
	String password;
	String url;
	DataSource dataSource;
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	public DbUtils(){
		try {
			Class.forName(driverName).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	@Override
	public SqlSession openSession() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public SqlSession openSession(boolean autoCommit) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public SqlSession openSession(Connection connection) {
		return null;
	}
	@Override
	public SqlSession openSession(TransactionIsolationLevel level) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public SqlSession openSession(ExecutorType execType) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public SqlSession openSession(ExecutorType execType, boolean autoCommit) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public SqlSession openSession(ExecutorType execType, TransactionIsolationLevel level) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public SqlSession openSession(ExecutorType execType, Connection connection) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Configuration getConfiguration() {
		// TODO Auto-generated method stub
		return null;
	}
}
