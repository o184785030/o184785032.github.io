package service.user;

import entity.User;
import serviceimpl.query.UserQuery;

public interface UserService {
	Boolean login(UserQuery userQuery);
	Integer regdit(User user);
}
