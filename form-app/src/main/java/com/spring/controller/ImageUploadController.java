package com.spring.controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class ImageUploadController {
	
	@RequestMapping("/imageupload")
	public String imageUploadView() {
		return "imageupload";
	}
	
	@RequestMapping(path="/imageuploadsuccess",method=RequestMethod.POST)
	public String imageUploadSuccessView(@RequestParam("file") CommonsMultipartFile file,Model model,HttpSession s) {

		System.out.println(file.getName());
		System.out.println(file.getBytes());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getContentType());
		
		String path=s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator+file.getOriginalFilename();
		System.out.println(path);
		try {
			FileOutputStream fos = new FileOutputStream(path);
			byte[] data=file.getBytes();
			fos.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("path",path);
		model.addAttribute("fileName",file.getOriginalFilename());
		return "imageuploadsuccess";
	}
	
}
