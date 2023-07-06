package class29;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E13Excel {
    public static void main(String[] args) {

        //absolute is the whole path always work but I can't shar with some don't work in other computer ,relative shorter
        String path=System.getProperty("user.dir")+"\\Files\\Employees (1).xlsx";//System.getProperty("user.dir")+ help to work other computer
        try {

            FileInputStream fileInputStream = new FileInputStream(path);// bring the data
            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
            Sheet sheet =xssfWorkbook.getSheet("Sheet1");// create variable sheet
            List<Map<String,String>> allExcelData=new ArrayList<>();//print from Map
            Row row0= sheet.getRow(0);
            int noOfRow=sheet.getLastRowNum();//sheet.getPhysicalNumberOfRows();not the better
            for (int i = 1; i <=noOfRow ; i++) {
                Row row= sheet.getRow(i);
                int noOfCells=row.getLastCellNum();
                LinkedHashMap<String,String> linkedHashMap=new LinkedHashMap<>();
                for (int j = 0; j <noOfCells ; j++) {
                    String key=row0.getCell(j).toString();
                    String value=row.getCell(j).toString();
                    linkedHashMap.put(key,value);
                }
                allExcelData.add(linkedHashMap);
            }
            System.out.println(allExcelData);



        } catch (IOException e){// we go with parent class
           e.printStackTrace();//it will give you the complete reason about the error, package, class and line of code

         }/*catch (IOException io){
            io.printStackTrace();*/
        }
    }

