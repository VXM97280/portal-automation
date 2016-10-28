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
public class Densities extends Base {

    @Test
    public void Densities() {
        //Checking for heading Densities
        List<WebElement> heading = driver.findElements(By.xpath("//div[@class='page']//h2[contains(text(),'Densities')]"));
        Assert.assertEquals(1, heading.size());

        /* Clicking New Density button */

        driver.findElement(By.xpath("//div[@class='page']//btn[@text='New Density']")).click();

        /* Verifying the main heading New Density */

        WebElement pagename2 = driver.findElement(By.xpath("//ul[@class='breadcrumb-list']//li[contains(text(),'New Density')]"));
        System.out.println(pagename2.getText());
        Assert.assertEquals("New Density", pagename2.getText());
        System.out.println("Main header is verified");

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

        driver.findElement(By.xpath("//div[@class='page-edit']//text-box[1]//input[@type='text']")).sendKeys("TestName_New Density");
        System.out.println("Text is entered Name field");


        /* Verifying the heading 'Config Name' */

        WebElement fieldname3 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][3]"));
        System.out.println(fieldname3.getText());
        Assert.assertEquals("Config Name", fieldname3.getText());
        System.out.println("Heading 'Config Name' is verified");


        /* Verifying the 'Config Name' text field */

        driver.findElement(By.xpath("//div[@class='page-edit']//text-box[2]//input[@type='text']")).sendKeys("TestConfigName_New Density");
        System.out.println("Text is entered 'Config Name' field");

        /* Verifying the heading 'Description' */

        WebElement fieldname4 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][4]"));
        System.out.println(fieldname4.getText());
        Assert.assertEquals("Description", fieldname4.getText());
        System.out.println("Heading 'Description' is verified");


        /* Verifying the 'Description text field */

        driver.findElement(By.xpath("//div[@class='page-edit']//text-box[3]//input[@type='text']")).sendKeys("TestDescription_New Density");
        System.out.println("Text is entered 'Description' field");

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        /* Cancelling the new Density */

        driver.findElement(By.xpath("//div[@class='page-edit']//btn[@text='Cancel']")).click();
        System.out.println("Your Density has not been saved");


    }
}
