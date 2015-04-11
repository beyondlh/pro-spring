package my.home.pro.ch3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Благодатских С.
 */
@Controller
public class HelloReaderController {

	@RequestMapping(value = "/hello")
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Hello Reader!");
		mv.setViewName("helloReader");
		return mv;
	}

	@RequestMapping(value = "/goodbye")
	public ModelAndView sayGoodby() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Goodby ");
		mv.addObject("name", "Asshole");
		mv.setViewName("goodbye");
		return mv;
	}

}
