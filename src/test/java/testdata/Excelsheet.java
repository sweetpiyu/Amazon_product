package testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet {
	public static Workbook b;
	public static 	Sheet sh;
	public static Object[][] getdata(String sheetname)
	{
		FileInputStream file=null;
		try {
			file=new FileInputStream("C:\\\\Users\\\\prash\\\\eclipse-workspace\\\\Amazon_project\\\\src\\\\test\\\\java\\\\testdata\\\\AmazonTestdata.xlsx");
			
		}
		
		catch(FileNotFoundException e){
			
			e.printStackTrace();
		}
		try {
		 b= WorkbookFactory.create(file);
		}
		catch(IOException a) {
			a.printStackTrace();
		}
		 sh=b.getSheet(sheetname);
		 Object [][] data=new Object[sh.getLastRowNum()][sh.getRow(0).getLastCellNum()];
		 for(int i=0;i<sh.getLastRowNum();i++) {
			 for(int j=0;j<sh.getRow(0).getLastCellNum();j++) {
				 data[i][j]=sh.getRow(i+1).getCell(j).toString();
			 }
		 }
		 return data;
	}
	

}
