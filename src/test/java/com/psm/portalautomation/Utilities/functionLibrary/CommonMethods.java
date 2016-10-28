package com.psm.portalautomation.Utilities.functionLibrary;

import com.psm.portalautomation.Utilities.ExcelReader;
import com.psm.portalautomation.Utilities.dataSetter.TestData;
//import org.apache.xpath.operations.String;

import java.util.ArrayList;

/**
 * Created by vmalladi on 10/26/16.
 */
public class CommonMethods {

 /*   *//**
     * Read the test dat from Excel file
     *
     * @param data The TestData data object

     *//*

    public void readExcelData(TestData data) {

        ArrayList<String> browser = new ArrayList<String>();
        ArrayList<String> username = new ArrayList<String>();
        ArrayList<String> password = new ArrayList<String>();
//        ArrayList<String> element1 = new ArrayList<String>();

        //Get data from Excel file

        for (int rowCnt = 1;rowCnt< ExcelReader.RowCount();rowCnt++)
        {
            browser.add(ExcelReader.ReadCell(ExcelReader.GetCell("Browser"), rowCnt));
            username.add(ExcelReader.ReadCell(ExcelReader.GetCell("Username"), rowCnt));
            password.add(ExcelReader.ReadCell(ExcelReader.GetCell("Password"), rowCnt));
//            element1.add(ExcelReader.ReadCell(ExcelReader.GetCell("element1"), rowCnt));

        }
        data.setBrowser(browser);
        data.setLoginUser(username);
        data.setPassword(password);
//        data.setElement1(element1);




    }*/

}
