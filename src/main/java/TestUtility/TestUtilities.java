package TestUtility;

import TestBase.TestBase;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestUtilities extends TestBase {

    public static String excelSheetPath="C:\\AutonationOpenCart\\src\\main\\resources\\ExcelOpenCart.xlsx";

   public static String productName;

    public static String megaTitle;




    public static void readingExcelFile() throws IOException {

     FileInputStream fileInputStream= new FileInputStream(excelSheetPath);

        XSSFWorkbook    workbook = new XSSFWorkbook(fileInputStream);

       productName=workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();

     megaTitle=workbook.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();


    }
}
