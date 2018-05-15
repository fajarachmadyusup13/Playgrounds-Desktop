/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmysql;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author ghost
 */
public class Read {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream("exel.xls"));
//        XSSFSheet sheet = workbook.getSheetAt(0);
//        XSSFRow row = sheet.getRow(0);
//        
//        if (row.getCell(0).getCellTypeEnum().equals(CellType.STRING)) {
//            System.out.println(row.getCell(0).getStringCellValue());
//        }
//        if (row.getCell(1).getCellTypeEnum().equals(CellType.NUMERIC)) {
//            System.out.println(row.getCell(1).getDateCellValue());
//        }
    }
}
