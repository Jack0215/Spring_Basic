package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

		@RequestMapping("/main")
		public String main() {
			return "main";
		}
		
		@RequestMapping("/member")
		public String member() {
			return "member";
		}
		
		
}
