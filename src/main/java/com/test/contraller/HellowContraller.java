package com.test.contraller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HellowContraller {

	@RequestMapping(value="/hellowMvc")
	public ModelAndView hellowMvc(){
		ModelAndView view = new ModelAndView();
		view.setViewName("hellow");
		return view;
	}
}
