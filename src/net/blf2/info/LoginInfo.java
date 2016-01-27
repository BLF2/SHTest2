package net.blf2.info;

import net.blf2.staticfile.ILoginInfo;

public class LoginInfo implements ILoginInfo{
	private Integer LoginId;//只是为了Hibernate的映射
    private String loginName;
    private String loginPswd;

    public LoginInfo() {
    }

    public LoginInfo(Integer loginId, String loginName, String loginPswd) {
        LoginId = loginId;
        this.loginName = loginName;
        this.loginPswd = loginPswd;
    }

    public LoginInfo(String loginName, String loginPswd) {
        this.loginName = loginName;
        this.loginPswd = loginPswd;
    }

    public Integer getLoginId() {
        return LoginId;
    }

    public void setLoginId(Integer loginId) {
        LoginId = loginId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPswd() {
        return loginPswd;
    }

    public void setLoginPswd(String loginPswd) {
        this.loginPswd = loginPswd;
    }
}