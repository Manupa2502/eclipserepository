package package1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javafx.scene.control.Cell;


public class Excelhandling {
    //in java we can use multiple apache plugins for different services
    //apache plugin pio we can use for editing excel sheets
    //you can edit excel sheet and you can modify the reports as per the need
    //read the excel
    //write the excel
    //convert excel into 2d array and pass for some computations
    //

    private static File file=new File("C:\\Users\\SVYOVW744\\Desktop\\javausage.xlsx");
    private static XSSFWorkbook wkbook;
    private static XSSFSheet sheet;

    void read_excel(){
        try{
            FileInputStream excel=new FileInputStream(file);
            wkbook=new XSSFWorkbook(excel);
            sheet=wkbook.getSheet("sheet1");
            int start=sheet.getFirstRowNum();
            int end=sheet.getLastRowNum();
            for(int i=start;i<end;i++){
                System.out.print(sheet.getRow(i).getCell(0).getStringCellValue()+"\t");
                System.out.print(sheet.getRow(i).getCell(1).getNumericCellValue()+"\t");
                System.out.print(sheet.getRow(i).getCell(2).getNumericCellValue()+"\t");
                System.out.print(sheet.getRow(i).getCell(3).getStringCellValue()+"\t");
                System.out.println(sheet.getRow(i).getCell(4).getDateCellValue());
            }
    }
     catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    void read_excel_store_2darray(){
        Object[][] arr=new Object[0][0];
        try{
        FileInputStream excel=new FileInputStream(file);
        wkbook=new XSSFWorkbook(excel);
        sheet=wkbook.getSheet("sheet1");
        int start=sheet.getFirstRowNum();
        int end=sheet.getLastRowNum();
        arr=new Object[end+1][5];
        for(int i=start;i<=end;i++)
        {
            arr[i][0]=sheet.getRow(i).getCell(0).getStringCellValue();
            arr[i][1]=sheet.getRow(i).getCell(1).getNumericCellValue();
            arr[i][2]=sheet.getRow(i).getCell(2).getNumericCellValue();
            arr[i][3]=sheet.getRow(i).getCell(3).getStringCellValue();
            arr[i][4]=sheet.getRow(i).getCell(4).getDateCellValue();
        }
        for(Object[] x:arr){
            for(Object y:x){
                System.out.print(y+"\t");
            }
            System.out.println();
        }

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    public void write_excel() {
            try{
                FileInputStream in=new FileInputStream(file);
                Workbook wkbook1=WorkbookFactory.create(in);
                org.apache.poi.ss.usermodel.Sheet sheet1=wkbook1.createSheet("sheet2");
                Row row=sheet1.createRow(0);
                org.apache.poi.ss.usermodel.Cell cell=row.createCell(0);
                cell.setCellValue("Manu");
                cell=row.createCell(1);
                cell.setCellValue(2000.5);
              //  wkbook=new XSSFWorkbook();
                FileOutputStream out=new FileOutputStream(file);
                wkbook1.write(out);
                 wkbook.close();
                out.close();
               
                
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        public static void main(String[] args) {
        
        Excelhandling eh=new Excelhandling();
        eh.read_excel();
        eh.read_excel_store_2darray();
        eh.write_excel();
        
        }

    }
    
