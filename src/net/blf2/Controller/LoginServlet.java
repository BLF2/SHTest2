package net.blf2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import net.blf2.info.LoginInfo;
import net.blf2.service.LoginService;

@Controller
public class LoginServlet {
	@RequestMapping("/login.action")
	public String checkLoginInfo(String loginName,String loginPswd){
		if(new LoginService().cheackLogin(loginName, loginPswd)){
			return "success";
		}
		return "login";
	}
	@RequestMapping("/change.action")
	public String changeLoginInfo(LoginInfo nli){
		if(new LoginService().changeLogin(nli)){
			return "success";
		}
		return "change";
	}
	@RequestMapping("/sublogin.action")
	public String deal(){
		return "login";
	}
}