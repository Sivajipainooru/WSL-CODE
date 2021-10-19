package Multitenancy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriverSheet {
	public void trail() throws IOException
	{
		//File file = new File("D:/Data/");
		FileInputStream fis=new FileInputStream("D:/Data/");
		
		XSSFWorkbook worksheet=new XSSFWorkbook(fis);
		int sheets=worksheet.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(worksheet.getSheetName(i).equalsIgnoreCase("TestingDataExcelSheet"))
			{
				XSSFSheet xis=worksheet.getSheetAt(i);
				Iterator<Row> rows= xis.iterator();
				Row firstrow=rows.next();
				Iterator<Cell> ce=firstrow.cellIterator();
				int k=0;
				int column=0;
				while(ce.hasNext())
				{
					Cell value=ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("TestData"))
					{
						column=k;
					}
					k++;
				}
				System.out.println(column);
				//once column is identified then scan entire testcase column to identify purchase test case row
				while(rows.hasNext())
				{
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase("2"))
					{
						//after you grab the purchase test case row==pull all the data of that row and feed into test
						Iterator<Cell> c=r.cellIterator();
						while(c.hasNext())
						{
							System.out.println(c.next().getStringCellValue());
						
						}
					}
				}
				
			}
			
		}
	}

}
