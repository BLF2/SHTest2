package net.blf2.info;

import net.blf2.DAO.DbInsert;

public class LoginInfoFactory {
	private String loginName;
    private String loginPswd;

    public LoginInfoFactory() {
    }

    public LoginInfoFactory(String loginName, String loginPswd) {
        this.setLoginName(loginName);
        this.setLoginPswd(loginPswd);
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        //添加限制条件
        this.loginName = loginName;
    }

    public String getLoginPswd() {
        return loginPswd;
    }

    public void setLoginPswd(String loginPswd) {
        //添加限制条件
        this.loginPswd = loginPswd;
    }
    public LoginInfo getLoginInfo(){
        return new DbInsert().insertLoginInfo(new LoginInfo(this.loginName,this.loginPswd));
    }
}