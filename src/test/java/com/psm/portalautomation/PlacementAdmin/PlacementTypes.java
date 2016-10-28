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
public class PlacementTypes  extends Base {

    @Test
    public void PlacementTypes() {
        //Checking for heading Placement Types
        List<WebElement> heading = driver.findElements(By.xpath("//div[@class='page']//h2[contains(text(),'Placement Types')]"));
        Assert.assertEquals(1, heading.size());

        /* Clicking New Density button */

        driver.findElement(By.xpath("//div[@class='page']//btn[@text='New Placement Type']")).click();

        /* Verifying the main heading New Placement Type */

        WebElement pagename7 = driver.findElement(By.xpath("//ul[@class='breadcrumb-list']//li[contains(text(),'New Type')]"));
        System.out.println(pagename7.getText());
        Assert.assertEquals("New Type", pagename7.getText());
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

        driver.findElement(By.xpath("//div[@class='page-edit']//text-box[1]//input[@type='text']")).sendKeys("TestName_New Placement Type");
        System.out.println("Text is entered Name field");


        /* Verifying the heading 'Config Name' */

        WebElement fieldname3 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][3]"));
        System.out.println(fieldname3.getText());
        Assert.assertEquals("Config Name", fieldname3.getText());
        System.out.println("Heading 'Config Name' is verified");


        /* Verifying the 'Config Name' text field */

        driver.findElement(By.xpath("//div[@class='page-edit']//text-box[2]//input[@type='text']")).sendKeys("TestConfigName_New Placement type");
        System.out.println("Text is entered 'Config Name' field");

        /* Verifying the heading 'Description' */

        WebElement fieldname4 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][4]"));
        System.out.println(fieldname4.getText());
        Assert.assertEquals("Description", fieldname4.getText());
        System.out.println("Heading 'Description' is verified");


        /* Verifying the 'Description text field */

        driver.findElement(By.xpath("//div[@class='page-edit']//text-box[3]//input[@type='text']")).sendKeys("TestDescription_New Placement Type");
        System.out.println("Text is entered 'Description' field");

        /* Verifying the heading 'Size' */

        WebElement fieldname5 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][5]"));
        System.out.println(fieldname5.getText());
        Assert.assertEquals("Size", fieldname5.getText());
        System.out.println("Heading 'Size' is verified");


        /* Verifying the 'Description text field */

        driver.findElement(By.xpath("//div[@class='page-edit']//text-box[3]//input[@type='text']")).sendKeys("TestSize_New Placement Type");
        System.out.println("Text is entered 'Size' field");

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        /* Cancelling the new Density */

        driver.findElement(By.xpath("//div[@class='page-edit']//btn[@text='Cancel']")).click();
        System.out.println("Your Density has not been saved");


    }
}
