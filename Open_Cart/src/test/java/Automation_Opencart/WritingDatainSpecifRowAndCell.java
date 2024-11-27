package Automation_Opencart;

// Import necessary packages for handling files and Excel sheets
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDatainSpecifRowAndCell {

    public static void main(String[] args) throws IOException {
        // Main method to execute the program

        // Define the output file path and name using FileOutputStream
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myfileRandom.xlsx");

        // Create a new Excel workbook
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create a new sheet within the workbook named "Data"
        XSSFSheet sheet = workbook.createSheet("Data");

        // Create a specific row (row index starts from 0, so row 3 is the 4th row)
        XSSFRow row = sheet.createRow(3);

        // Create a specific cell within the above-created row (column index starts from 0, so cell 4 is the 5th cell)
        XSSFCell cell = row.createCell(4);

        // Write data into the specific cell
        cell.setCellValue("WELCOME");

        // Write the workbook content to the file
        workbook.write(file);

        // Close the workbook to release resources
        workbook.close();

        // Close the FileOutputStream
        file.close();

        // Notify the user that the file has been created successfully
        System.out.println("File is created.....");
    }
}
