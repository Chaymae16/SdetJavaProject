package class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E2ExcelFile {
    public static void main(String[] args) throws IOException {
        // we don't need to lose the data copy the path this file read or creat the data
        String path="Files/Employees (1).xlsx"; //relative path
        // this line will return data in the sheet before
        FileInputStream fileInputStream=new FileInputStream(path);
        //class
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet =xssfWorkbook.getSheet("Sheet1");
        Row row=sheet.createRow(5);
        row.createCell(0).setCellValue("Moncef");
        row.createCell(1).setCellValue("M");
        row.createCell(2).setCellValue("Belgas");
        //creates an empty File OU
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        //data is written to that file.
        xssfWorkbook.write(fileOutputStream);

    }
}
