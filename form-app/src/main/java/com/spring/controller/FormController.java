package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.entity.FormEntity;

@Controller
public class FormController {

	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	
	@RequestMapping(path="/success",method=RequestMethod.POST)
	public String successPage(@ModelAttribute("formEntity") FormEntity formEntity,Model model,BindingResult bindingResult,Errors errors) {
		System.out.println(bindingResult.hasErrors() || errors.hasErrors());
		if(bindingResult.hasErrors() || errors.hasErrors()) {
			return "form";
		}
		System.out.println(formEntity);
		return "success";
	}
	
}
