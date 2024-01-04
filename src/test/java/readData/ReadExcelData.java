package readData;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelData {

public static String dataReadTest(int RowNumber,int ColumnNumber) throws IOException {
    File src= new File("C:\\Users\\Vinay Mishra\\Desktop\\Book1.xlsx");
    FileInputStream fis = new FileInputStream(src);
    XSSFWorkbook xsf= new XSSFWorkbook(fis);
    //for .xls file
//    HSSFWorkbook xsf= new HSSFWorkbook(fis);
    XSSFSheet sheet= xsf.getSheet("Sheet1");
    String entry1=sheet.getRow(RowNumber).getCell(ColumnNumber).getStringCellValue();
    System.out.println("output is "+entry1);

    xsf.close();
    return entry1;
}

}
