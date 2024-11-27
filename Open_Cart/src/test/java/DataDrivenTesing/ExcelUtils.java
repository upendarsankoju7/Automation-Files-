package DataDrivenTesing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    // FileInputStream and FileOutputStream for handling file operations
    public static FileInputStream fi;
    public static FileOutputStream fo;

    // Apache POI classes for Excel workbook, sheet, row, and cell
    public static XSSFWorkbook wb;
    public static XSSFSheet ws;
    public static XSSFRow row;
    public static XSSFCell cell;

    // CellStyle to handle cell formatting
    public static CellStyle style;  
    
    // Method to get the total row count of a sheet
    public static int getRowCount(String xlfile, String xlsheet) throws IOException {
        fi = new FileInputStream(xlfile); // Open the Excel file
        wb = new XSSFWorkbook(fi); // Load the workbook
        ws = wb.getSheet(xlsheet); // Get the sheet by name
        int rowcount = ws.getLastRowNum(); // Get the last row number
        wb.close(); // Close the workbook
        fi.close(); // Close the file stream
        return rowcount;        
    }
    
    // Method to get the total cell count in a specified row
    public static int getCellCount(String xlfile, String xlsheet, int rownum) throws IOException {
        fi = new FileInputStream(xlfile); // Open the Excel file
        wb = new XSSFWorkbook(fi); // Load the workbook
        ws = wb.getSheet(xlsheet); // Get the sheet by name
        row = ws.getRow(rownum); // Get the specified row
        int cellcount = row.getLastCellNum(); // Get the total number of cells in the row
        wb.close(); // Close the workbook
        fi.close(); // Close the file stream
        return cellcount;
    }
    
    // Method to get the data from a specific cell
    public static String getCellData(String xlfile, String xlsheet, int rownum, int colnum) throws IOException {
        fi = new FileInputStream(xlfile); // Open the Excel file
        wb = new XSSFWorkbook(fi); // Load the workbook
        ws = wb.getSheet(xlsheet); // Get the sheet by name
        row = ws.getRow(rownum); // Get the specified row
        cell = row.getCell(colnum); // Get the specified cell
        
        String data;
        try {
            // Use DataFormatter to get formatted cell data as a String
            DataFormatter formatter = new DataFormatter();
            data = formatter.formatCellValue(cell); 
        } catch (Exception e) {
            data = ""; // Return an empty string in case of exceptions
        }
        
        wb.close(); // Close the workbook
        fi.close(); // Close the file stream
        return data;
    }
    
    // Method to set data in a specific cell
    public static void setCellData(String xlfile, String xlsheet, int rownum, int colnum, String data) throws IOException {
        fi = new FileInputStream(xlfile); // Open the Excel file
        wb = new XSSFWorkbook(fi); // Load the workbook
        ws = wb.getSheet(xlsheet); // Get the sheet by name
        row = ws.getRow(rownum); // Get the specified row
        
        cell = row.createCell(colnum); // Create a cell at the specified position
        cell.setCellValue(data); // Set the value in the cell
        fo = new FileOutputStream(xlfile); // Open a FileOutputStream for saving changes
        wb.write(fo); // Write changes to the workbook
        wb.close(); // Close the workbook
        fi.close(); // Close the FileInputStream
        fo.close(); // Close the FileOutputStream
    }
    
    // Method to fill a cell with green color
    public static void fillGreenColor(String xlfile, String xlsheet, int rownum, int colnum) throws IOException {
        fi = new FileInputStream(xlfile); // Open the Excel file
        wb = new XSSFWorkbook(fi); // Load the workbook
        ws = wb.getSheet(xlsheet); // Get the sheet by name
        row = ws.getRow(rownum); // Get the specified row
        cell = row.getCell(colnum); // Get the specified cell
        
        style = wb.createCellStyle(); // Create a new CellStyle
        
        // Set the fill color to green and fill pattern
        style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND); 
                
        cell.setCellStyle(style); // Apply the style to the cell
        fo = new FileOutputStream(xlfile); // Open a FileOutputStream for saving changes
        wb.write(fo); // Write changes to the workbook
        wb.close(); // Close the workbook
        fi.close(); // Close the FileInputStream
        fo.close(); // Close the FileOutputStream
    }
    
    // Method to fill a cell with red color
    public static void fillRedColor(String xlfile, String xlsheet, int rownum, int colnum) throws IOException {
        fi = new FileInputStream(xlfile); // Open the Excel file
        wb = new XSSFWorkbook(fi); // Load the workbook
        ws = wb.getSheet(xlsheet); // Get the sheet by name
        row = ws.getRow(rownum); // Get the specified row
        cell = row.getCell(colnum); // Get the specified cell
        
        style = wb.createCellStyle(); // Create a new CellStyle
        
        // Set the fill color to red and fill pattern
        style.setFillForegroundColor(IndexedColors.RED.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);  
        
        cell.setCellStyle(style); // Apply the style to the cell
        fo = new FileOutputStream(xlfile); // Open a FileOutputStream for saving changes
        wb.write(fo); // Write changes to the workbook
        wb.close(); // Close the workbook
        fi.close(); // Close the FileInputStream
        fo.close(); // Close the FileOutputStream
    }
}
