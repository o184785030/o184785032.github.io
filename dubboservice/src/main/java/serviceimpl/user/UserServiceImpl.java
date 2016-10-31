package serviceimpl.user;

import dao.user.UserDao;
import entity.User;
import service.user.UserService;
import serviceimpl.query.UserQuery;

public class UserServiceImpl implements UserService{

	UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public Boolean login(UserQuery userQuery) {
		
		User user =  userDao.selectUser(userQuery);
		if(user!=null){
			return true;
		}
		return false;
	}

	@Override
	public Integer regdit(User user) {
		return userDao.insertUser(user);
	}

}
