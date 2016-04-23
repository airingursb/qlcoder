package com.train.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.train.dao.UserDao;
import com.train.dao.UserDaoImpl;
import com.train.entity.User;

public class RegisterAction {
	
	private String registerusername;
	
	public String execute() throws IOException {
		ActionContext ctx = ActionContext.getContext();
		HttpServletResponse response = (HttpServletResponse)ctx.get(ServletActionContext.HTTP_RESPONSE);  
		response.setContentType("text/json"); 
		response.setCharacterEncoding("UTF-8"); 
		PrintWriter out = response.getWriter();
		
		UserDao dao = new UserDaoImpl();
		if (dao.searchUser(registerusername) == null) {
			User user = new User();
			user.setUsername(registerusername);
			dao.saveUser(user);
			out.print("register success");		
		} else {
			out.print("already used");
		}
		return null;
	}

	public String getRegisterusername() {
		return registerusername;
	}

	public void setRegisterusername(String registerusername) {
		this.registerusername = registerusername;
	}


}
