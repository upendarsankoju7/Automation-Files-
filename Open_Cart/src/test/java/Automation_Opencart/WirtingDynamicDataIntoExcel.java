package Automation_Opencart;

// Import necessary packages for file handling and working with Excel
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WirtingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		// Main method to execute the program
		
		// Create a FileOutputStream to define the location and name of the Excel file
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myfile_dynamic_2.xlsx");
		
		// Create a new Excel workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		// Create a new sheet within the workbook named "DynamicData"
		XSSFSheet sheet = workbook.createSheet("DynamicData");
		
		// Create a Scanner object to take user input for dynamic data
		Scanner sc = new Scanner(System.in);
		
		// Prompt user to enter the number of rows
		System.out.println("Enter how many rows?");
		int noOfrows = sc.nextInt();
		
		// Prompt user to enter the number of cells (columns)
		System.out.println("Enter how many cells?");
		int noOfcells = sc.nextInt();
		
		// Loop to create rows and cells dynamically based on user input
		for (int r = 0; r <= noOfrows; r++) {
			// Create a new row in the sheet
			XSSFRow currentRow = sheet.createRow(r);
			
			// Nested loop to create cells within the current row
			for (int c = 0; c < noOfcells; c++) {
				// Create a new cell in the current row
				XSSFCell cell = currentRow.createCell(c);
				
				// Prompt user to enter data for each cell
				cell.setCellValue(sc.next());
			}
		}
		
		// Write the workbook content into the file
		workbook.write(file);
		
		// Close the workbook to release resources
		workbook.close();
		
		// Close the FileOutputStream
		file.close();
		
		// Notify the user that the file has been created successfully
		System.out.println("File is created.....");
	}
}
