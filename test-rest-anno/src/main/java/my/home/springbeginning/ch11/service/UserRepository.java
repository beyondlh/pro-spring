package my.home.springbeginning.ch11.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import my.home.springbeginning.ch11.domain.User;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stikkas<stikkas@yandex.ru>
 */
@Repository
public class UserRepository {

	private final Map<Integer, User> users = new HashMap<>();

	@PostConstruct
	public void setup() {
		users.put(1, new User(1, "Mert Caliskan"));
		users.put(2, new User(2, "Kenan Sevindik"));
	}

	public void save(User user) {
		users.put(user.getId(), user);
	}

	public List<User> findAll() {
		return new ArrayList<>(users.values());
	}

	public User find(int id) {
		return users.get(id);
	}

	public void update(int id, User user) {
		users.put(id, user);
	}

	public void delete(int id) {
		users.remove(id);
	}

}
