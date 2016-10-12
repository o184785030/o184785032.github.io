package utils;

import java.util.Properties;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

public class PropertiesUtils implements InitializingBean{
	PropertyPlaceholderConfigurer propertyConfigurer = new PropertyPlaceholderConfigurer();
	
	void loadProperties(String path){
		propertyConfigurer.setLocation(new FileSystemResource(path));
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		loadProperties("E:/data/temp.properties");
	}
}
