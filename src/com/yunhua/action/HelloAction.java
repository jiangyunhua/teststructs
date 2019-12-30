package com.yunhua.action;
import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	public String execute() {
		System.out.println("进入了hello模块");
		return "ho";
	}
	
	public String test() {
		System.out.println("进入了hello模块test方法");
		return "ho";
	}
	
	public String test2() {
		System.out.println("进入了hello模块test2方法");
		return "ho1";
	}
	

}
