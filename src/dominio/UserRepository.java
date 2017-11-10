package dominio;

import java.util.List;

public class UserRepository implements IUserRepository {

	List<User> users ;
	
	public UserRepository(List<User> _users) {
		users = _users;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
