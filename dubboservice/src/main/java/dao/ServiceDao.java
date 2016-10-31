package dao;

import dal.DalUtils;

public class ServiceDao {
	DalUtils dalUtils;

	public void setDalUtils(DalUtils dalUtils) {
		this.dalUtils = dalUtils;
	}
	
	public String selectServiceByServiceName(String serviceName){
		return dalUtils.selectOne("selectServiceByServiceName",serviceName);
	}
}
