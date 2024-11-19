package Automation_Opencart;

// Importing required classes for working with Excel files
import java.io.FileInputStream; // For reading files
import java.io.IOException; // For handling exceptions
import org.apache.poi.xssf.usermodel.XSSFCell; // For accessing cells in an Excel file
import org.apache.poi.xssf.usermodel.XSSFRow; // For accessing rows in an Excel file
import org.apache.poi.xssf.usermodel.XSSFSheet; // For accessing sheets in an Excel workbook
import org.apache.poi.xssf.usermodel.XSSFWorkbook; // For accessing the workbook itself

public class ReadingDataFromExcel {

    public static void main(String[] args) throws IOException {
        // Load the Excel file into a FileInputStream
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\data.xlsx");

        // Create a workbook instance for the Excel file
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        // Access the desired sheet by name (Sheet1) or by index (e.g., 0 for the first
        // sheet)
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        // Alternative: XSSFSheet sheet = workbook.getSheetAt(0);

        // Get the total number of rows (last row index) in the sheet
        int totalRows = sheet.getLastRowNum();

        // Get the total number of cells (columns) in the first row
        int totalCells = sheet.getRow(0).getLastCellNum();

        // Print the number of rows and cells
        System.out.println("Number of rows: " + totalRows); // Output row count (zero-based index)
        System.out.println("Number of cells: " + totalCells); // Output column count

        // Iterate over each row
        for (int r = 0; r <= totalRows; r++) {
            // Get the current row
            XSSFRow currentRow = sheet.getRow(r);

            // Iterate over each cell in the current row
            for (int c = 0; c < totalCells; c++) {
                // Get the cell value
                XSSFCell cell = currentRow.getCell(c);

                // Print the cell value as a string
                System.out.print(cell.toString() + "\t");
            }
            // Print a newline after each row
            System.out.println();
        }

        // Close the workbook and file input stream to release resources
        workbook.close();
        file.close();

    }
}
