package com.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dto.Login;

@Controller
public class TestController {
	
	@RequestMapping(value="/ddd")
	@ResponseBody //함수의 리턴이 클라이언트에게 보내지는 응답내용이 됨
	public String  ddd(String mesg) {
		System.out.println("[TestController] ddd() :" + mesg);
		return "hello!!!"; //hello!!!글씨가 사용자한테 응답으로 간다.
	}
	
	//로그인 객체 생성, 이름 패스워드 담아줌, 리턴로그인(@RsponseBody)하면
	//데이터가 객체에 제이슨 형태로 저장된다.
	//클라이언트쪽에서 데이터 타입이 제이슨이라는 것을 설정해줘야한다.
	@RequestMapping("/aaa")
	//@ResponseBody 삭제//success하는 부분에서 코드를 찍어볼것
	public Login aaa() {
		Login login = new Login();
		login.setUseid("홍길동");
		login.setPasswd("1234");
		return login;
	}
	
	//접근을 배열로 한다.
	@RequestMapping("/bbb")
	//@ResponseBody 삭제
	public ArrayList<Login> bbb(){
		ArrayList<Login> list = new ArrayList<Login>();
		list.add(new Login("홍길동1", "10"));
		list.add(new Login("홍길동2", "20"));
		list.add(new Login("홍길동3", "30"));
		list.add(new Login("홍길동4", "40"));
		return list;
		//Json 배열로 전송한다. 
	}
	   @RequestMapping("/ccc")
	   //@ResponseBody 삭제 //jsp로 리턴시켜준다.
	   public HashMap<String, ArrayList<Login>> ccc() {
	      HashMap<String, ArrayList<Login>> map=new HashMap<String, ArrayList<Login>>();
	      ArrayList<Login> list1=new ArrayList<Login>();
	      list1.add(new Login("홍길동1","10")); 
	      list1.add(new Login("홍길동2","20"));
	      list1.add(new Login("홍길동3","30"));
	      ArrayList<Login> list2=new ArrayList<Login>();
	      list2.add(new Login("유관순1","10"));
	      list2.add(new Login("유관순2","20"));
	      list2.add(new Login("유관순3","30"));
	      map.put("one",list1);
	      map.put("two",list2);
	      return map;
	   }
}	
 