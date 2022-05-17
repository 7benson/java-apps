package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/search")
	public String search() {
		String s=null;
		System.out.println(s.charAt(0));
		return "search";
	}
	@RequestMapping(path="/gsearch",method=RequestMethod.POST)
	public RedirectView gSearch(@RequestParam String query) {
		String url="https://www.google.com/search?q="+query;
		RedirectView r=new RedirectView();
		r.setUrl(url);
		return r;
	}
}
