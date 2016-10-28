package com.psm.portalautomation.Utilities.dataSetter;

import java.util.ArrayList;

/**
 * Created by vmalladi on 10/26/16.
 */
public class TestData {

    private ArrayList<String> browser = null;
    private ArrayList<String> loginUser = null;
    private ArrayList<String> password = null;


    /**
     * Return Browser
     */

    public ArrayList<String> getBrowser() {
        return browser;

    }
    /**
     * @param browser
     */
    public void setBrowser(ArrayList<String> browser) {
        this.browser = browser;
    }
    /**
     * Return login user
     */

    public ArrayList<String> getLoginUser() {
        return loginUser;
    }
    /**
     * @param loginUser
     */
    public void setLoginUser(ArrayList<String> loginUser) {
        this.loginUser = loginUser;
    }
    /**
     * Return Password
     */

    public ArrayList<String> getPassword() {
        return password;
    }
    /**
     * @param password
     */
    public void setPassword(ArrayList<String> password) {
        this.password = password;
    }

  /*  *//**
     * Return element1
     *//*

    public ArrayList<String> getElement1() {
        return element1;
    }

    *//**
     * //@param element1
     *//*
    public void setElement1(ArrayList<String> element1) {
        this.element1 = element1;
    }*/

}
