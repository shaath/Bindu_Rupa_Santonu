package xlops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import method.OrgMaster;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmpregXlOps 
{
	public static void main(String[] args) throws IOException 
	{
		OrgMaster om=new OrgMaster();
		String xlpath="F:\\Evening930PM\\Selenium\\src\\testdata\\EmpReg.xlsx";
		String xlout="F:\\Evening930PM\\Selenium\\src\\results\\Fontcolours.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("EmpRegData");
//		XSSFRow r=ws.getRow(6);
//		XSSFCell c=r.getCell(0);
//		
//		System.out.println(c.getStringCellValue());
		
		
		
		int Rc=ws.getLastRowNum();
		System.out.println(Rc);
		om.org_Launch("http://opensource.demo.orangehrmlive.com");
		om.org_Login("Admin", "admin");
		
		CellStyle style=wb.createCellStyle();
		Font font=wb.createFont();
		
		
		for (int i = 1; i <= Rc; i++) 
		{
			XSSFRow r=ws.getRow(i);
			XSSFCell c=r.getCell(0);
			XSSFCell c1=r.getCell(1);
			XSSFCell c2=r.getCell(2);
			XSSFCell c3=r.createCell(3);
						
			String f=c.getStringCellValue();
			String l=c1.getStringCellValue();
			String eId=c2.getStringCellValue();
			
			System.out.println(f+"----"+l+"-------"+eId);
			
			String res=om.org_EmpReg(f, l, eId);
			
			
			c3.setCellValue(res);
			
//			style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
//			style.setFillPattern(CellStyle.SOLID_FOREGROUND);
			if (res.equalsIgnoreCase("Pass"))
			{
				font.setColor(IndexedColors.GREEN.getIndex());
			}
			else
			{
				font.setColor(IndexedColors.RED.getIndex());
			}
			
			style.setFont(font);
			
			c3.setCellStyle(style);
			
		}
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		om.org_Logout();
		om.org_Close();

	}

}
