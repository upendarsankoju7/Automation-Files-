package Automation_Opencart;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * This program demonstrates how to write data into an Excel file using Apache POI library.
 */
public class WritingDataIntoExcel {
	
    public static void main(String[] args) throws IOException {
        // Create a FileOutputStream to specify the file path where the Excel file will be created
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myfile.xlsx");

        // Create a new workbook in .xlsx format
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Create a new sheet in the workbook with the name "Data"
        XSSFSheet sheet = workbook.createSheet("Data");

        // Create the first row and add data to it
        XSSFRow row1 = sheet.createRow(0); // Row index starts from 0
        row1.createCell(0).setCellValue("Java"); // Create cell at index 0 and set value "Java"
        row1.createCell(1).setCellValue(19);    // Create cell at index 1 and set value 19
        row1.createCell(2).setCellValue("Automation"); // Create cell at index 2 and set value "Automation"

        // Create the second row and add data to it
        XSSFRow row2 = sheet.createRow(1); // Row index 1
        row2.createCell(0).setCellValue("Python"); // Set value "Python" at cell 0
        row2.createCell(1).setCellValue(3);       // Set value 3 at cell 1
        row2.createCell(2).setCellValue("Automation"); // Set value "Automation" at cell 2

        // Create the third row and add data to it
        XSSFRow row3 = sheet.createRow(2); // Row index 2
        row3.createCell(0).setCellValue("C#"); // Set value "C#" at cell 0
        row3.createCell(1).setCellValue(5);   // Set value 5 at cell 1
        row3.createCell(2).setCellValue("Automation"); // Set value "Automation" at cell 2

        // Create the Fourth row and add data to it
        XSSFRow row4 = sheet.createRow(2); // Row index 2
        row4.createCell(0).setCellValue("DevOps"); // Set value "C#" at cell 0
        row4.createCell(1).setCellValue(5);   // Set value 5 at cell 1
        row4.createCell(2).setCellValue("Azure Cloud"); // Set value "Automation" at cell 2

        
        
        // Write the workbook data into the file
        workbook.write(file);

        // Close the workbook to release resources
        workbook.close();

        // Close the FileOutputStream
        file.close();

        // Print a confirmation message to indicate the file creation
        System.out.println("File is created.....");
    }
}
