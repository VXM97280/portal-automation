package com.psm.portalautomation.pageObjects;

import com.psm.portalautomation.Utilities.ExcelReader;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


/**
 * Created by vmalladi on 10/27/16.
 */

public class LoginPage {

    @Test

    public static void Execute(WebDriver driver) throws Exception {

        /**6
         *  Getting values from Excel
         */

        String pUserName = ExcelReader.getCellData(2, 2);
        String pPassword = ExcelReader.getCellData(2, 3);



    }


}
