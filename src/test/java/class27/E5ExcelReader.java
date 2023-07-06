package class27;

import Utils.Constants;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E5ExcelReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(Constants.EXCEL_FILE_PATH);
        // that special call which knows how to read the data from exel files
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        List<Map<String,String>> excelData=new ArrayList<>();
        Row headerRow= sheet.getRow(0);// my keys store header part
        int rowSize=sheet.getPhysicalNumberOfRows(); // method for how many row 4
        for (int rows = 1; rows <rowSize ; rows++) { // for all row 1 actual data store
            Row row=sheet.getRow(rows);// row now it 1 not 0 actual information

            Map<String,String> rowMap=new HashMap<>();//should create Map before inner loop
            //int colSize=row.getPhysicalNumberOfCells(); // method for how many col
            for (int col = 0; col <row.getPhysicalNumberOfCells(); col++) {
                String key=headerRow.getCell(col).toString();//headerRow Leandro Data return obj convert to String the map is String,String so we have to put String objects as parameters
                String value=row.getCell(col).toString();
                rowMap.put(key,value);
           }
            excelData.add(rowMap);//List of Maps

           }
        System.out.println(excelData);




    }
}
