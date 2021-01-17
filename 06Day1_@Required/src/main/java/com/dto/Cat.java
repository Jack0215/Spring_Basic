package com.dto;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;

import java.util.Properties;

public class Cat {
					
	private String catName;
	private int catAge;
	
	
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public void setCatAge(int catAge) {
		this.catAge = catAge;
	}
	@Override
	public String toString() {
		return "Cat [catName=" + catName + ", catAge=" + catAge + "]";
	}
	public String getCatInfo() {
		return catName+"\t"+catAge;
	}
	
}
