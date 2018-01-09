package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.Service.VariousRegistDto;
import com.example.demo.Service.VariousRegistService;

@Controller
public class VariousRegistController {

	@Autowired
	VariousRegistService variousRegistService;
	
	@RequestMapping(value="/regist", method=RequestMethod.POST)
	public ModelAndView Hello(RedirectAttributes redirectAttributes, VariousRegistModel model) {
		
		VariousRegistDto dto = new VariousRegistDto();
		//variousRegistService.regist(dto);
		
		ModelAndView view  = new ModelAndView();
		view.setViewName("/VariousRegist");
		return view;
	}
}
