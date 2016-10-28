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
public class Platforms extends Base {

    @Test
    public void Platforms() {
        //Checking for heading Platforms
        List<WebElement> heading = driver.findElements(By.xpath("//div[@class='page']//h2[contains(text(),'Platforms')]"));
        Assert.assertEquals(1, heading.size());

        /* Clicking New Platform button */

        driver.findElement(By.xpath("//div[@class='page']//btn[@text='New Platform']")).click();

        /* Verifying the main heading New Platform */

        WebElement pagename8 = driver.findElement(By.xpath("//ul[@class='breadcrumb-list']//li[contains(text(),'New Platform')]"));
        System.out.println(pagename8.getText());
        Assert.assertEquals("New Platform", pagename8.getText());
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

        driver.findElement(By.xpath("//div[@class='page-edit']//text-box[1]//input[@type='text']")).sendKeys("TestName_New Platform");
        System.out.println("Text is entered Name field");

        /* Verifying the heading 'Placement Devices' */

        WebElement fieldname3 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][3]"));
        System.out.println(fieldname3.getText());
        Assert.assertEquals("Placement Devices", fieldname3.getText());
        System.out.println("Heading 'Placement Devices' is verified");

        /* Clicking checkbox for 'Placement Devices'*/

        //WebElement Select = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select//check-box[1]//div[.//div[@class='custom-checkbox'] AND .//div[contains(text(),'Android')]]"));
        String checkBox1 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[1]//check-box[1]//div[@class='label-text']")).getText();
        if (checkBox1.equals("All")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[1]//check-box[1]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

        String checkBox2 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[1]//check-box[2]//div[@class='label-text']")).getText();
        if (checkBox2.equals("iPad")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[1]//check-box[2]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

        String checkBox3 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[1]//check-box[3]//div[@class='label-text']")).getText();
        if (checkBox3.equals("iPhone")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[1]//check-box[3]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

        String checkBox4 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[1]//check-box[4]//div[@class='label-text']")).getText();
        if (checkBox4.equals("Large")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[1]//check-box[4]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

        String checkBox5 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[1]//check-box[5]//div[@class='label-text']")).getText();
        if (checkBox5.equals("Normal")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[1]//check-box[5]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }
        String checkBox6 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[1]//check-box[6]//div[@class='label-text']")).getText();
        if (checkBox6.equals("X-Large")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[1]//check-box[6]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

        /* Verifying the heading 'Placement Field Names' */

        WebElement fieldname4 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][4]"));
        System.out.println(fieldname4.getText());
        Assert.assertEquals("Placement Field Names", fieldname4.getText());
        System.out.println("Heading 'Placement Field Names' is verified");

        /* Clicking checkbox for 'Placement Field Names'*/

        //WebElement Select = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select//check-box[1]//div[.//div[@class='custom-checkbox'] AND .//div[contains(text(),'Android')]]"));
        String checkBox21 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[2]//check-box[1]//div[@class='label-text']")).getText();
        if (checkBox21.equals("Clone")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[2]//check-box[1]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

        String checkBox22 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[2]//check-box[2]//div[@class='label-text']")).getText();
        if (checkBox22.equals("Refresh Rate")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[2]//check-box[2]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

        String checkBox23 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[2]//check-box[3]//div[@class='label-text']")).getText();
        if (checkBox23.equals("One Time")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[2]//check-box[3]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

        String checkBox24 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[2]//check-box[4]//div[@class='label-text']")).getText();
        if (checkBox24.equals("Screen Change")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[2]//check-box[4]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }
        String checkBox25 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[2]//check-box[5]//div[@class='label-text']")).getText();
        if (checkBox25.equals("Frequency")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[2]//check-box[5]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

        String checkBox26 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[2]//check-box[6]//div[@class='label-text']")).getText();
        if (checkBox26.equals("Reset on Cancel")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[2]//check-box[6]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

        String checkBox27 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[2]//check-box[7]//div[@class='label-text']")).getText();
        if (checkBox27.equals("Comment")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[2]//check-box[7]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

        String checkBox28 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[2]//check-box[8]//div[@class='label-text']")).getText();
        if (checkBox28.equals("Close Button")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[2]//check-box[8]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }
        String checkBox29 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[2]//check-box[9]//div[@class='label-text']")).getText();
        if (checkBox29.equals("Ad Network")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[2]//check-box[9]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

         /* Verifying the heading 'Placement Interstitial Types' */

        WebElement fieldname5 = driver.findElement(By.xpath("//div[@class='page-edit']//div[@class='block'][5]"));
        System.out.println(fieldname5.getText());
        Assert.assertEquals("Placement Interstitial Types", fieldname5.getText());
        System.out.println("Heading 'Placement Interstitial Types' is verified");

        /* Clicking checkbox for 'Placement Interstitial Types'*/

        //WebElement Select = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select//check-box[1]//div[.//div[@class='custom-checkbox'] AND .//div[contains(text(),'Android')]]"));
        String checkBox31 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[3]//check-box[1]//div[@class='label-text']")).getText();
        if (checkBox31.equals("Clone")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[3]//check-box[1]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

        String checkBox32 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[3]//check-box[2]//div[@class='label-text']")).getText();
        if (checkBox32.equals("Refresh Rate")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[3]//check-box[2]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

        String checkBox33 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[3]//check-box[3]//div[@class='label-text']")).getText();
        if (checkBox33.equals("One Time")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[3]//check-box[3]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

        String checkBox34 = driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[3]//check-box[4]//div[@class='label-text']")).getText();
        if (checkBox34.equals("Screen Change")) {

            driver.findElement(By.xpath("//div[@class='page-edit']//multi-select[3]//check-box[4]//div[@class='custom-checkbox']")).click();
            System.out.println("Check box is clicked");
            //driver.findElement(By.xpath("//div[@class='page-edit']//check-box                //div[@class='custom-checkbox']")).click();

        }

        /* Cancelling the New Platforms */

        driver.findElement(By.xpath("//div[@class='page-edit']//btn[@text='Cancel']")).click();
        System.out.println("Your New Platforms has not been saved");


    }
}
