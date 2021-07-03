package WorkSiteLabs.WSL;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcelData2 {
	static XSSFSheet sheet;
	private static String getCellValue(int r,int c)
	{
		XSSFRow rows=sheet.getRow(r);
		XSSFCell cell=rows.getCell(c);
		DataFormatter formatter=new DataFormatter();
		
		String text=formatter.formatCellValue(sheet.getRow(r).getCell(c));
		return text;
		
	}
	public String[][] getDataFromSheet() throws IOException
	{
		
		FileInputStream file=new FileInputStream("D:\\WSLXLSHEETS\\Two_Minors_Four_Symtoms\\Two_minor -Four Symptoms.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		sheet=book.getSheetAt(0);
		int noOfRows=sheet.getPhysicalNumberOfRows();
		int noOfCells=sheet.getRow(0).getPhysicalNumberOfCells();
		String[][] data_cells=new String[noOfRows][noOfCells];
		System.out.println(noOfRows);
		System.out.println(noOfCells);
		for(int i=1;i<noOfRows;i++)
		{
			for(int j=0;j<noOfCells;j++)
			{
				
				
				data_cells[i][j]=getCellValue(i,j);
			}
		}
		return data_cells;
		
	}

}

