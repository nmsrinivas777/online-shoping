package net.app.OnlineShoping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	
@RequestMapping(value= {"/", "/home", "/index"})

public ModelAndView index() {
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title","Home");
	mv.addObject("UserClickHome", true);
	return mv;
}

@RequestMapping(value= "/about")

public ModelAndView about() {
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title","About");
	mv.addObject("UserClickAbout", true);
	return mv;
}

@RequestMapping(value= "/contact")

public ModelAndView contact() {
	ModelAndView mv=new ModelAndView("page");
	mv.addObject("title","Contact");
	mv.addObject("UserClickContact", true);
	return mv;
}
//@RequestMapping(value= "/test")
//public  ModelAndView test(@RequestParam(value="greeting" , required=false) String great) {
//	if(great==null) {
//		great="i am here";
//	}
//	ModelAndView mv=new ModelAndView("page");
//	mv.addObject("greetings",great);
//	return mv;
//}
	/*
	 * @RequestMapping(value= "/test/{greeting}") public ModelAndView
	 * test(@PathVariable(value="greeting" ) String great) { if(great==null) {
	 * great="i am here"; } ModelAndView mv=new ModelAndView("page");
	 * mv.addObject("greetings",great); return mv; }
	 */
}
 