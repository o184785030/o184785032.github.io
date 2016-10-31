package dao.user;

import dal.DalUtils;
import entity.User;
import serviceimpl.query.UserQuery;

public class UserDao {
	DalUtils dalUtils;

	public void setDalUtils(DalUtils dalUtils) {
		this.dalUtils = dalUtils;
	}
	
	public User selectUser(UserQuery userQuery){
		return dalUtils.selectOne("selectUser",userQuery);
	}
	public Integer insertUser(User user){
		return dalUtils.insert("insertUser",user);
	}
}
