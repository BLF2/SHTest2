package net.blf2.service;

import net.blf2.DAO.DbDelete;
import net.blf2.DAO.DbQuery;
import net.blf2.DAO.DbUpdate;
import net.blf2.info.LoginInfo;
import net.blf2.info.LoginInfoFactory;
import net.blf2.staticfile.ILoginInfo;

public class LoginService {
	public boolean cheackLogin(String loginName,String loginPswd){
		ILoginInfo ili = new DbQuery().queryLoginInfoByName(loginName);
		if(loginName.equals(ili.getLoginName()) && loginPswd.equals(ili.getLoginPswd()))
			return true;
		return false;
	}
	public boolean changeLogin(LoginInfo li){
		new DbUpdate().updateLoginInfo(li);
		return true;
	}
}