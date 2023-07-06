package class27;

import Utils.Constants;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(Constants.EXCEL_FILE_PATH);
        // that special call which knows how to read the data from exel files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");

        int rowSize=sheet.getPhysicalNumberOfRows(); // method for how many row 4
        for (int rows = 0; rows <rowSize ; rows++) { // for all row
            Row row=sheet.getRow(rows);

            //int colSize=row.getPhysicalNumberOfCells(); // method for how many col
            for (int col = 0; col <row.getPhysicalNumberOfCells(); col++) { // for all colm 5 from row
                System.out.print(row.getCell(col)+" ");
        }
            System.out.println();
        }


        //Row row=sheet.getRow(1);//? row i want

        /*System.out.print(row.getCell(0)+" ");
        System.out.print(row.getCell(1)+" ");
        System.out.print(row.getCell(2)+" ");
        System.out.print(row.getCell(3)+" ");
        System.out.print(row.getCell(4)+" ");*/

        //for (int col = 0; col < 5; col++) {
            //System.out.print(row.getCell(col)+" ");


    }
}
