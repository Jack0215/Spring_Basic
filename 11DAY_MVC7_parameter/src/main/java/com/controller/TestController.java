package com.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dto.LoginDTO;

@Controller
public class TestController {

		@RequestMapping(value= "/login", method = RequestMethod.GET)
		public String loginForm() {
			System.out.println("loginForm()실행");
			return "loginForm";
		}
		@RequestMapping(value= "/login", method = RequestMethod.POST)
		public String login1(LoginDTO dto) { //LoginDTO로 자동 생성 저장됨
			System.out.println("/login() post data dto" + dto);
			return "loginForm";
		}
		
		@RequestMapping("/main")
		public String main() {
			return "main";
		}
		@RequestMapping(value="/login1") 	//form에서 넘어오는 key값
								//request.getparameter와 같음 이걸 string형태의 id에 저장하겠다.
								//하나의 값을 직접 뽑아내는  @RequestParam
		public String login2(@RequestParam("userid")String id,
				@RequestParam("passwd") String pw) {
			System.out.println("login2 @RequestParam passion\n"+id+"\r"+pw);
			return "login";
		}
		//데이터 파싱
		//파싱한 data를 이용 ModelAndView에 저장
		//뷰페이지를 logined.jsp로 지정
		//logined.jsp에서 id, passwd 출력
		//String id = request.getParameter("userid");와 동일
		@RequestMapping("/aa")
		public ModelAndView loginMaV(LoginDTO dto) {
			ModelAndView mav = new ModelAndView();
			mav.addObject("userid", dto.getUserid());
			mav.addObject("passwd", dto.getPasswd());
			mav.setViewName("logined");
		return mav;
		}
		
		@RequestMapping(value="/login2")
		public String login3(HttpServletRequest request) {
			String id = request.getParameter("userid");
			String pw = request.getParameter("passwd");
			System.out.println("login2 @RequestParam\n"+id+"\n"+pw);
			
			return "login";
		}
		
		@RequestMapping(value="/login3")
		public String login3(@RequestParam String userid, @RequestParam String passwd) {
			System.out.println("login3 @RequestParam"+userid+"\r"+passwd);
			return "login";
		}
		
		@RequestMapping(value="/login4", method = RequestMethod.POST)
		public String login4(String userid, String passwd)
							//loginForm의 name과 다르면 null이 된다.
		{
			System.out.println("login4 @RequestParam"+userid+"\r"+passwd);
			return "login";   
		}
		
		@RequestMapping(value="/login5")
		public String login5(@RequestParam(required=false, defaultValue = "홍길동") String userid, String passwd) {
				//required=false 데이터가 없으면 파싱하지 않겠다. 기본값을 홍길동으로 설정
				//아이디를 입력하지않고 실행 해볼 경우 기본값은 홍길동이 된다.
			System.out.println("login5 @RequestParam"+"\r"+userid+"\r"+passwd);
			return "login";   
		}
		
		@RequestMapping(value="/login6")
		public String login6(@RequestParam Map<String, String> m) {
				//입력받은 값을 map으로 변환해서 저장시킨다.
				//key는 폼에서 넘어오는 name이 된다. value는 넣어준 값	
			System.out.println("login6 map"+"\r"+m); 
			return "login";   
		}
}
