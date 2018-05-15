/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertexceltodb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ghost
 */
public class FileOperations {
    XSSFWorkbook workbook;
    
    public FileOperations() throws FileNotFoundException, IOException {
        this.workbook = new XSSFWorkbook(new FileInputStream("Dataset Tugas 3 AI 1718.xlsx"));
    }
    
    public ArrayList<News> getData (int sheetIndex) {
        XSSFSheet sheet = workbook.getSheetAt(sheetIndex);
        XSSFRow row = sheet.getRow(0);
        ArrayList<News> list = new ArrayList<>();
        
        for (Row rowTemp : sheet) {
            if (rowTemp.getRowNum() == 0 ) {
                continue;
            } else {
                String idNews       = rowTemp.getCell(0).getStringCellValue();
                int like         = (int) Math.round(rowTemp.getCell(1).getNumericCellValue());
                int provocation  = (int) Math.round(rowTemp.getCell(2).getNumericCellValue());
                int comment      = (int) Math.round(rowTemp.getCell(3).getNumericCellValue());
                int emotion      = (int) Math.round(rowTemp.getCell(4).getNumericCellValue());
                int hoax         = (int) Math.round(rowTemp.getCell(5).getNumericCellValue());

                News news = new News(idNews, like, provocation, comment, emotion, hoax);
                list.add(news);
            }
        }
        
        return list;
    }    
}
