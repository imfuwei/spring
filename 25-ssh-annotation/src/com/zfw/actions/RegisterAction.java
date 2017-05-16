package com.zfw.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.zfw.beans.User;
import com.zfw.service.IUserService;

@Controller
@Scope("prototype")
@ParentPackage(value="struts-default")
@Namespace(value="/test")
public class RegisterAction{
	public IUserService getUserServiceImpl() {
		return userServiceImpl;
	}

	public void setUserServiceImpl(IUserService userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String username;
	private String password;
	
	@Autowired
	@Qualifier(value="service")
	private IUserService userServiceImpl;
	
	@Action(value="register",results=@Result(location="/success.jsp"))
	public String execute() throws Exception {
		User user=new User(username, password);
		userServiceImpl.addUser(user);
		return "success";
	}
}
