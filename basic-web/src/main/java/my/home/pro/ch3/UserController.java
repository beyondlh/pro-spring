package my.home.pro.ch3;

import java.text.SimpleDateFormat;
import java.util.Date;
import my.home.pro.ch3.model.Gender;
import my.home.pro.ch3.model.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Благодатских С.
 */
@Controller
public class UserController {

	private static final String[] countries = {"Turkey", "Unated States", "Germany"};

	@RequestMapping(value = "/form")
	public ModelAndView user() {
		ModelAndView mav = new ModelAndView("userForm", "user", new User());
		mav.addObject("genders", Gender.values());
		mav.addObject("countries", countries);
		return mav;
	}

	@RequestMapping(value = "/result")
	public ModelAndView processUser(User user) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userResult");
		modelAndView.addObject("u", user);
		return modelAndView;
	}

	@ExceptionHandler
	public ModelAndView handleException(Exception e) {
		e.printStackTrace();
		return null;
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		CustomDateEditor editor = new CustomDateEditor(new SimpleDateFormat("dd.MM.yyyy"), true);
		binder.registerCustomEditor(Date.class, editor);
	}
}
