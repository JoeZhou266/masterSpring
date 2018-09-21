package me.laiyijie.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    private String accountAccess;
    private String loginLogAccess;

    public String getAccountAccess() {
        return accountAccess;
    }

    public void setAccountAccess(String accountAccess) {
        this.accountAccess = accountAccess;
    }

    public String getLoginLogAccess() {
        return loginLogAccess;
    }

    public void setLoginLogAccess(String loginLogAccess) {
        this.loginLogAccess = loginLogAccess;
    }

    public boolean login(String username) {
        System.out.println("UserServiceImpl login()");
       return true;
    }


}
