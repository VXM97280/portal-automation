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
public class DynamicFields extends Base {

    @Test
    public void DynamicFields() {

        //Checking for heading Dynamic Fields
        List<WebElement> heading = driver.findElements(By.xpath("//div[@class='page']//h2[contains(text(),'Dynamic Fields')]"));
        Assert.assertEquals(1, heading.size());

        /* Clicking New Dynamic Field button */

        driver.findElement(By.xpath("//div[@class='page']//btn[@text='New Dynamic Field']")).click();

        /*Verifying the page header 'New Dynamic Field' */

        WebElement pageName4 = driver.findElement(By.xpath("//ul[@class='breadcrumb-list']//li[contains(text(),'New Dynamic Field')]"));
        System.out.println(pageName4.getText());
        Assert.assertEquals("New Dynamic Field", pageName4.getText());
        System.out.println("Heading New Dynamic Field is verified");

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

        /* Verifying the heading 'Default Setting' */

        WebElement fieldname5 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][5]"));
        System.out.println(fieldname5.getText());
        Assert.assertEquals("Default Setting", fieldname5.getText());
        System.out.println("Heading 'Default Setting' is verified");


        /* Verifying the 'Default Setting' text field */

        driver.findElement(By.xpath("//div[@class='page-edit']//text-box[4]//input[@type='text']")).sendKeys("Test Default setting _New Dynamic Field");
        System.out.println("Text is entered in 'Default Setting' field");

        /* Verifying field name 'Is For Interstitial' check box */

        WebElement fieldname6 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='label-text']"));
        System.out.println(fieldname6.getText());
        Assert.assertEquals("Is For Interstitial", fieldname6.getText());
        System.out.println("Check box label text is verified");

        /* Clicking the check box */

        driver.findElement(By.xpath("//div[@class='page-edit']//check-box//div[@class='custom-checkbox']")).click();
        System.out.println("Check box is clicked");

        /* Verifying field name 'Field Type' drop down */

        WebElement fieldname7 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][6]"));
        System.out.println(fieldname7.getText());
        Assert.assertEquals("Field Type", fieldname7.getText());
        System.out.println("Heading 'Field Type' is verified");

        /* Verifying the dropdown */

        driver.findElement(By.xpath("//div[@class='page-edit']//drop-down//div[contains(text(),'Select')]")).click();
        driver.findElement(By.xpath("//div[@class='page-edit']//drop-down//div[contains(text(),'Date')]")).click();

        // dropdown.selectByVisibleText("Boolean");
        System.out.println("Dropdown value is selected");


        /* Verifying the heading 'Platforms' */

        WebElement fieldname8 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][7]"));
        System.out.println(fieldname8.getText());
        Assert.assertEquals("Platforms", fieldname8.getText());
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
