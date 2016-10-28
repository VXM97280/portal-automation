package com.psm.portalautomation.Base;

import org.apache.commons.collections.set.ListOrderedSet;
//import org.apache.xpath.operations.String;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.jetty.html.Element;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by vmalladi on 10/12/16.
 */
public class Base {

    public WebDriver driver;


    @Before
    public void setUp() {

        //System.setProperty("webdriver.chrome.driver", "/Users/vmalladi/Downloads/webdrivers/firefox/gecko");
        //driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "/Users/vmalladi/Downloads/webdrivers/chrome/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.navigate().to("https://sta-portal.pinsightmedia.com/");

        // maximize the browser window
        driver.manage().window().maximize();

        //Enter email and password
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("tgunasekaran@pinsightmedia.com");
        //driver.findElement(By.id("user_email")).clear();
        //driver.findElement(By.id("user_email")).sendKeys("tgunasekaran@pinsightmedia.com");
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys("12345678");
        //driver.findElement(By.id("user_password")).clear();
        //driver.findElement(By.id("user_password")).sendKeys("12345678");
        driver.findElement(By.id("btn-login-submit")).click();

        //waiting for page to load
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        //Clicking publisher in side navigation bar and then Placement Admin
        driver.findElement(By.linkText("Publishers")).click();
        driver.findElement(By.linkText("Placement Admin")).click();
        System.out.println(driver.getTitle());

        //waiting for page to load
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
    }



}


