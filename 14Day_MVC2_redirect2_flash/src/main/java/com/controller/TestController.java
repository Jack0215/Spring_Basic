package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TestController {

	
	
	  @RequestMapping(value="/redirect", method = RequestMethod.GET)
	  //modelAttribute와 비슷한데 redirect시에만 쓴다. 즉, 리다이렉트 전용 객체
	  public String redirect(RedirectAttributes r) {
	  		System.out.println("redirect 호출");
	  		r.addFlashAttribute("userid", "홍길동");
	  		return "redirect:main"; //도메인 /main을찾아감
	   }
	 
	
	/*
	 * @RequestMapping(value="/redirect", method = RequestMethod.GET)
	 * //modelAttribute와 비슷한데 redirect시에만 쓴다. 즉, 리다이렉트 전용 객체 public ModelAndView
	 * redirect(ModelAndView r) { //ModelAndView r = new ModelAndView();
	 * System.out.println("redirect 호출"); r.addObject("userid", "홍길동");
	 * r.setViewName("redirect:main"); //redirect 없이 실행하면 값이 넘어간다. return r; //도메인
	 * /main을 찾아감 }
	 */
	
	@RequestMapping(value ="/main", method = RequestMethod.GET)
	public String main() {
		System.out.println("main 호출");
		return "main";
	} 
	
}	
 