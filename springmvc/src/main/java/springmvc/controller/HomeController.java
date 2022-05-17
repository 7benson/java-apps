package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String showHomePage(Model model) {
		System.out.println("home controller");
		
		model.addAttribute("name", "JK");
		
		List<String> friends = new ArrayList<String>();
		friends.add("srinivas");
		friends.add("friends");
		
		model.addAttribute("friends",friends);
		
		return "home";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("help");
		modelAndView.addObject("name", "jk");
		
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("now",now);
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		
		modelAndView.addObject("num", num);
		
		return modelAndView;
	}
	
}
