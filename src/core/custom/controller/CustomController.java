package core.custom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomController {
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView ModelAndView = new ModelAndView("index");
		ModelAndView.addObject("welcome", "Hello Depak");
		return ModelAndView;
	}

}
