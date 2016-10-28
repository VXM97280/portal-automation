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
public class IntegrationMethods extends Base {

    @Test
    public void IntegrationMethods() {
        //Checking for heading Integration Methods
        List<WebElement> heading = driver.findElements(By.xpath("//div[@class='page']//h2[contains(text(),'Integration Methods')]"));
        Assert.assertEquals(1, heading.size());

         /* Clicking New Integration Method */

        driver.findElement(By.xpath("//div[@class='page']//btn[@text='New Integration Method']")).click();

        /*Verifying the page header 'New Integration Method' */

        WebElement pageName5 = driver.findElement(By.xpath("//ul[@class='breadcrumb-list']//li[contains(text(),'New Integration Method')]"));
        System.out.println(pageName5.getText());
        Assert.assertEquals("New Integration Method", pageName5.getText());
        System.out.println("Heading New Integration Method is verified");

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

        driver.findElement(By.xpath("//div[@class='page-edit']//text-box[1]//input[@type='text']")).sendKeys("TestName_New Integration Method");
        System.out.println("Text is entered in Name field");


        /* Verifying field name 'Configuration Type' drop down */

        WebElement fieldname3 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][3]"));
        System.out.println(fieldname3.getText());
        Assert.assertEquals("Configuration Type", fieldname3.getText());
        System.out.println("Heading 'Configuration Type' is verified");

        /* Verifying the dropdown */

        driver.findElement(By.xpath("//div[@class='page-edit']//drop-down//div[contains(text(),'Select')]")).click();
        driver.findElement(By.xpath("//div[@class='page-edit']//drop-down//div[contains(text(),'AG')]")).click();
        //driver.findElement(By.xpath("//div[@class='page-edit']//drop-down//div[contains(text(),'SDK')]")).click();

        System.out.println("Dropdown value is selected");

        /* Verifying field name 'Configuration Type' drop down */

        WebElement fieldname4 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][4]"));
        System.out.println(fieldname4.getText());
        Assert.assertEquals("Cluster", fieldname4.getText());
        System.out.println("Heading 'Cluster' is verified");

        /* Verifying the dropdown */

        driver.findElement(By.xpath("//div[@class='page-edit']//drop-down//div[contains(text(),'Select')]")).click();
        //driver.findElement(By.xpath("//div[@class='page-edit']//drop-down//div[contains(text(),'aws-s2s-7ul-one')]")).click();
        //driver.findElement(By.xpath("//div[@class='page-edit']//drop-down//div[contains(text(),'aws-s2s-mopub-one')]")).click();
        //driver.findElement(By.xpath("//div[@class='page-edit']//drop-down//div[contains(text(),'adgateway-ag')]")).click();
        driver.findElement(By.xpath("//div[@class='page-edit']//drop-down//div[contains(text(),'adgateway-vas')]")).click();

        System.out.println("Dropdown value is selected");


        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        /* Cancelling the New Integration Method */

        driver.findElement(By.xpath("//div[@class='page-edit']//btn[@text='Cancel']")).click();
        System.out.println("Your New Integration Method has not been saved");


    }
}
