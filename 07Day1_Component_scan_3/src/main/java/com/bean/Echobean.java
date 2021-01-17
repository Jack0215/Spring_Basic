package com.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.OneService;
import com.service.TwoService;

@Service("aaa")
public class Echobean {
	
	//one, two를 쓰려면 autowired 혹은 주입이 되어야함.
	@Autowired
	OneService one;
	
	@Autowired
	TwoService two;
	public Echobean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Echobean(OneService one, TwoService two) {
		super();
		this.one = one;
		this.two = two;
	}
	public OneService getOne() {
		return one;
	}
	public void setOne(OneService one) {
		this.one = one;
	}
	public TwoService getTwo() {
		return two;
	}
	public void setTwo(TwoService two) {
		this.two = two;
	} 
	
	
}
