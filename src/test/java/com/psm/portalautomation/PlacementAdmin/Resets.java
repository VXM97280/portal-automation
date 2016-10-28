package com.psm.portalautomation.PlacementAdmin;

//import org.apache.xpath.operations.String;

import com.psm.portalautomation.Base.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by vmalladi on 10/18/16.
 */
public class Resets extends Base {

    @Test
    public void Resets() {

        //Checking for heading Resets
        List<WebElement> heading = driver.findElements(By.xpath("//div[@class='page']//h2[contains(text(),'Resets')]"));
        Assert.assertEquals(1, heading.size());

         /* Clicking New Dynamic Field button */

        driver.findElement(By.xpath("//div[@class='page']//btn[@text='New Reset']")).click();

        /* Verifying the page header 'New Dynamic Field' */

        WebElement pageName9 = driver.findElement(By.xpath("//ul[@class='breadcrumb-list']//li[contains(text(),'New Reset')]"));
        System.out.println(pageName9.getText());
        Assert.assertEquals("New Reset", pageName9.getText());
        System.out.println("Heading New Reset is verified");

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

        driver.findElement(By.xpath("//div[@class='page-edit']//text-box[1]//input[@type='text']")).sendKeys("TestName_New Dynamic Field0");
        System.out.println("Text is entered in Name field");


        /* Verifying the heading 'Config Name' */

        WebElement fieldname3 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][3]"));
        System.out.println(fieldname3.getText());
        Assert.assertEquals("Config Name", fieldname3.getText());
        System.out.println("Heading 'Config Name' is verified");


        /* Verifying the 'Config Name' text field */

        driver.findElement(By.xpath("//div[@class='page-edit']//text-box[2]//input[@type='text']")).sendKeys("Test Config Name _New Dynamic Field");
        System.out.println("Text is entered in 'Config Name' field");


        /* Verifying the heading 'Description' */

        WebElement fieldname4 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][4]"));
        System.out.println(fieldname4.getText());
        Assert.assertEquals("Description", fieldname4.getText());
        System.out.println("Heading 'Description' is verified");


        /* Verifying the 'Description' text field */

        driver.findElement(By.xpath("//div[@class='page-edit']//text-box[3]//input[@type='text']")).sendKeys("Test Description _New Dynamic Field");
        System.out.println("Text is entered in 'Description' field");

        /* Cancelling the New Resets */

        driver.findElement(By.xpath("//div[@class='page-edit']//btn[@text='Cancel']")).click();
        System.out.println("Your New Resets has not been saved");


    }

}
