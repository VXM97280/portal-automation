package com.psm.portalautomation.PlacementAdmin;

//import org.apache.xpath.operations.String;

import com.psm.portalautomation.Base.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by vmalladi on 10/18/16.
 */
public class InterstitialTypes extends Base {

    @Test

    public void InterstitialTypes() {
        //Checking for heading Interstitial Types
        List<WebElement> heading = driver.findElements(By.xpath("//div[@class='page']//h2[contains(text(),'Interstitial Types')]"));
        Assert.assertEquals(1, heading.size());

        /* Clicking New Interstitial Type button */

        driver.findElement(By.xpath("//div[@class='page']//btn[@text='New Interstitial Type']")).click();

        /*Verifying the page header 'New Interstitial type' */

        WebElement pageName6 = driver.findElement(By.xpath("//ul[@class='breadcrumb-list']//li[contains(text(),'New Interstitial Type')]"));
        System.out.println(pageName6.getText());
        Assert.assertEquals("New Interstitial Type", pageName6.getText());
        System.out.println("Heading New Interstitial Type is verified");

        /* Verifying the heading 'Status' */

        WebElement fieldname1 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][1]"));
        System.out.println(fieldname1.getText());
        Assert.assertEquals("Status", fieldname1.getText());
        System.out.println("Heading 'Status' is verified");

        /* Clicking the knob */

        driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='knob']")).click();
        System.out.println("Knob is clicked");

        /* Verifying the heading 'Name' */

        WebElement fieldname2 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][2]"));
        System.out.println(fieldname2.getText());
        Assert.assertEquals("Name", fieldname2.getText());
        System.out.println("Heading 'Name' is verified");


        /* Verifying the 'Name' text field */

        driver.findElement(By.xpath("//div[@class='page-edit']//text-box[1]//input[@type='text']")).sendKeys("TestName_New Interstitial Type");
        System.out.println("Text is entered in Name field");


        /* Verifying the heading 'Config Name' */

        WebElement fieldname3 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][3]"));
        System.out.println(fieldname3.getText());
        Assert.assertEquals("Config Name", fieldname3.getText());
        System.out.println("Heading 'Config Name' is verified");


        /* Verifying the 'Config Name' text field */

        driver.findElement(By.xpath("//div[@class='page-edit']//text-box[2]//input[@type='text']")).sendKeys("Test Config Name _New Interstitial Type");
        System.out.println("Text is entered in 'Config Name' field");


        /* Verifying the heading 'Description' */

        WebElement fieldname4 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][4]"));
        System.out.println(fieldname4.getText());
        Assert.assertEquals("Description", fieldname4.getText());
        System.out.println("Heading 'Description' is verified");


        /* Verifying the 'Description' text field */

        driver.findElement(By.xpath("//div[@class='page-edit']//text-box[3]//input[@type='text']")).sendKeys("Test Description _New Interstitial Type");
        System.out.println("Text is entered in 'Description' field");

        /* Verifying the heading 'Platforms' */

        WebElement fieldname5 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][5]"));
        System.out.println(fieldname5.getText());
        Assert.assertEquals("Platforms", fieldname5.getText());
        System.out.println("Heading 'Platform' is verified");

        /* Clicking checkbox for 'Platforms'*/

        //WebElement Select = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select//check-box[1]//div[.//div[@class='custom-checkbox'] AND .//div[contains(text(),'Android')]]"));
        String checkBox1 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select//check-box[1]//div[@class='label-text']")).getText();
        if (checkBox1.equals("Android")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select//check-box[1]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

        String checkBox2 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select//check-box[2]//div[@class='label-text']")).getText();
        if (checkBox2.equals("iOS")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select//check-box[2]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

        String checkBox3 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select//check-box[3]//div[@class='label-text']")).getText();
        if (checkBox3.equals("Mobile Web")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select//check-box[3]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

        String checkBox4 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select//check-box[4]//div[@class='label-text']")).getText();
        if (checkBox4.equals("Web")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select//check-box[4]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);



        /* Cancelling the 'New Dynamic Field'  */

        driver.findElement(By.xpath("//div[@class='page-edit']//btn[@text='Cancel']")).click();
        System.out.println("Your New Dynamic Field' was not been saved");

    }
}
