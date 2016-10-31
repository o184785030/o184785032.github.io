package Export;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.fastjson.JSONObject;

import dao.ServiceDao;
import utils.SpringBeanUtils;

@Controller
public class HumanHandle {
	
	@RequestMapping(value={"/{serviceName}/{methodName}"})
	private void handle(HttpServletRequest request, HttpServletResponse response, @PathVariable(value="serviceName") String serviceName, @PathVariable(value="methodName") String methodName) throws Exception{
		
		CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
		StringBuffer paramString = new StringBuffer();
		if(commonsMultipartResolver.isMultipart(request)){
			//表明是form-data格式的入参
			MultipartHttpServletRequest multipartHttpServletRequest =  commonsMultipartResolver.resolveMultipart(request);
			Map<String,Object[]> paramMap = multipartHttpServletRequest.getParameterMap();
			//取得文件对象
			MultipartFile multipartFile = multipartHttpServletRequest.getFile("file");
			System.out.println(multipartFile.getContentType());
			multipartFile.transferTo(new File("E:/test.jpg"));
			
			//处理form-data 数据
			Map<String,Object> tempMap = new HashMap<>();
			for(String str:paramMap.keySet()){
				if(paramMap.get(str).length>1){
					tempMap.put(str, paramMap.get(str));
				}else{
					tempMap.put(str, paramMap.get(str)[0]);
				}
			}
			paramString.append(JSONObject.toJSONString(tempMap));
			
		}else{
			BufferedReader bufferedReader = request.getReader();
			String str = null;
			while((str = bufferedReader.readLine())!=null){
				paramString.append(str);
			}
			bufferedReader.close();
		}
		
		//根据服务名称拿到具体的服务类的全名（接口service的全名）
		ServiceDao serviceDao = (ServiceDao) SpringBeanUtils.getBean("serviceDao");
		String service = serviceDao.selectServiceByServiceName(serviceName);
		//根据接口类型取到具体的服务实现类
		Object obj = SpringBeanUtils.getBeanByType(service);
		//根据方法名称去调用相应的方法得到结果
		for(Class<?> inte : obj.getClass().getInterfaces()){
			Method[] methods = inte.getMethods();
			for(Method method:methods){
				Class<?> parameterType = method.getParameterTypes()[0];
				if(method.getName().equals(methodName)){
					Object output =  method.invoke(obj, JSON.parse(paramString.toString(),parameterType));
					String json = JSON.json(output);
					response.getWriter().write(json);
				}
			}
		}
	}
	
	private void handleFile(HttpServletRequest request){
		
	}
}
