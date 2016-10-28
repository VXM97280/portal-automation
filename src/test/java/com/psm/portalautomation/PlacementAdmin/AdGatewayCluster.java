package com.psm.portalautomation.PlacementAdmin;

//import org.apache.xpath.operations.String;

import com.psm.portalautomation.Base.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by vmalladi on 10/18/16.
 */
public class AdGatewayCluster extends Base {

    @Test
    public void NewCluster() {


        //Getting the page element

        WebElement header1 = driver.findElement(By.className("page"));
        System.out.println(header1.findElement(By.tagName("h2")).getText());

        //Comparing header 1 value to string  -- Test

        Assert.assertEquals("AdGateway Clusters", header1.findElement(By.tagName("h2")).getText());

        /* Clicking New cluster button */

        driver.findElement(By.xpath("//div[@class='page']//btn[@text='New Cluster']")).click();

        /* Verifying the main heading New Cluster */

        WebElement pagename1 = driver.findElement(By.xpath("//ul[@class='breadcrumb-list']//li[contains(text(),'New Cluster')]"));
        System.out.println(pagename1.getText());
        Assert.assertEquals("New Cluster", pagename1.getText());
        System.out.println("Mainheader is verified");

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


        /* Verifying the Name text field */

        driver.findElement(By.xpath("//div[@class='page-edit']//text-box[1]//input[@type='text']")).sendKeys("TestName");
        System.out.println("Text is entered Name field");


        /* Verifying the heading 'Identifier' */

        WebElement fieldname3 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][3]"));
        System.out.println(fieldname3.getText());
        Assert.assertEquals("Identifier", fieldname3.getText());
        System.out.println("Heading 'Identifier' is verified");


        /* Verifying the Identifier text field */

        driver.findElement(By.xpath("//div[@class='page-edit']//text-box[2]//input[@type='text']")).sendKeys("Test Identifier");
        System.out.println("Text Identifier is entered identifier field");

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        /* Cancelling the newly created cluster */

        driver.findElement(By.xpath("//div[@class='page-edit']//btn[@text='Cancel']")).click();
        System.out.println("Your cluster has not been saved");


    }

}
