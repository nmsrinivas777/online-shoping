package net.app.OnlineShoping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.app.OnlineShopingBackend.dao.CategoryDao;
import net.app.OnlineShopingBackend.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDao categorydao;

	@RequestMapping(value = { "/", "/home", "/index" })

	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("categories", categorydao.list());
		mv.addObject("UserClickHome", true);
		return mv;
	}

	@RequestMapping(value = "/about")

	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About");
		mv.addObject("UserClickAbout", true);
		return mv;
	}

	@RequestMapping(value = "/contact")

	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact");
		 
		mv.addObject("UserClickContact", true);
		return mv;
	}
	
	@RequestMapping(value = "/list/all/products")

	public ModelAndView listProducts() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "producutlist");
		mv.addObject("categories", categorydao.list());
		mv.addObject("UserClicklistProducts", true);
		return mv;
	}
	
	@RequestMapping(value = "/list/category/{id}/products")

	public ModelAndView category(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		
		Category category=null;
		
		category=categorydao.getId(id);
		
		mv.addObject("title",category.getName());
		mv.addObject("categories", categorydao.list());
		mv.addObject("category",category);
		mv.addObject("UserClickCategory", true);
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
