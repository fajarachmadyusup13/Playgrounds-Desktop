/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbmysql;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;



/**
 *
 * @author ghost
 */
public class Write {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("FirstExelSheet");
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = row.createCell(0);
        cell.setCellValue("1. Cell");
        
        cell = row.createCell(1);
        DataFormat format = workbook.createDataFormat();
        CellStyle dateStyle = workbook.createCellStyle();
        
        dateStyle.setDataFormat(format.getFormat("dd.mm.yyyy"));
        cell.setCellStyle(dateStyle);
        cell.setCellValue(new Date());
        
        row.createCell(2).setCellValue("3. Cell");
        sheet.autoSizeColumn(1);
        
        
        try {
            workbook.write(new FileOutputStream("exel.xls"));
            workbook.close();   
        } catch (IOException ex) {
            Logger.getLogger(Write.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
