package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}

	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String processForm(@ModelAttribute User user, Model model) {
		System.out.println(user);
		int id=this.userService.saveUser(user);
		model.addAttribute("id", id);
		return "success";
	}
}

/*
 * @RequestMapping(path="/processform",method=RequestMethod.POST)
	public ModelAndView processForm(@RequestParam("email") String userEmail,
			@RequestParam("userName") String userName,
			@RequestParam("userPassword") String userPassword) {
		
		ModelAndView model=new ModelAndView();
		model.setViewName("success");
		model.addObject("userName", userName);
		model.addObject("userEmail", userEmail);
		model.addObject("userPassword", userPassword);
		return model;
	}
 */

