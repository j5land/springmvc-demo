package com.test.contraller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HellowContraller {

	@RequestMapping(method=RequestMethod.POST,value="/hellowMvc")
	public ModelAndView hellowMvc(String username){
		System.out.println("username:"+username);
		ModelAndView view = new ModelAndView();
		view.addObject("username", username);
		view.setViewName("hellow");
		return view;
	}
}
