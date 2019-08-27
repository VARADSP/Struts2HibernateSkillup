package com.uks.varad.struts.day1.assignment1.action;

import com.opensymphony.xwork2.ActionSupport;


public class WelcomeAction extends ActionSupport {
	private String userName = "Welcome To Struts 2 Application From Action Class";

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}	
	
	public String execute(){
		return "success";
	}
	
}
