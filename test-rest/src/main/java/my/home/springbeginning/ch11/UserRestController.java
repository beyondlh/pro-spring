package my.home.springbeginning.ch11;

import java.util.List;
import my.home.springbeginning.ch11.domain.User;
import my.home.springbeginning.ch11.service.UserRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class UserRestController {

	@Autowired
	Logger logger;

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public void save(@RequestBody User user) {
		userRepository.save(user);
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> list() {
		logger.info("This is info");
		logger.warn("This is warn");
		logger.debug("This is debug");
		logger.error("This is error");
		return userRepository.findAll();
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
	public User get(@PathVariable("id") int id) {
		return userRepository.find(id);
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable("id") int id, @RequestBody User user) {
		userRepository.update(id, user);
	}

	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> delete(@PathVariable("id") int id) {
		userRepository.delete(id);
		return new ResponseEntity<>(Boolean.TRUE, HttpStatus.OK);
	}

}
