package package1;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class OnlineExcelHandling {
    /**
     *
     */
    
    //static File file=new File("https:////ibm.ent.box.com//integrations//officeonline//openOfficeOnline?fileId=1288772031607&sharedAccessCode=javaexcel.xlsx");
    static Workbook wkbook;
    static org.apache.poi.ss.usermodel.Sheet sheet;

     /**
     * @return
     */
    

    void read_excel(){
        try{
            URL url=new URL("https://docs.google.com/spreadsheets/d/1SEd3S3OY4tu9MsDsi6juTDogwMm4J_Kt/export?format=xlsx");
            //https://docs.google.com/spreadsheets/d/1SEd3S3OY4tu9MsDsi6juTDogwMm4J_Kt/edit#gid=1147749101 - we need to change the edit to export?format=xlsx

            System.out.println(url);
          //  FileInputStream excel=new FileInputStream(file);
            InputStream in=url.openStream();
            wkbook=WorkbookFactory.create(in);
            sheet=wkbook.getSheetAt(0);
            int start=sheet.getFirstRowNum();
            int end=sheet.getLastRowNum();
            for(int i=start;i<end;i++){
                System.out.print(sheet.getRow(i).getCell(0).getStringCellValue()+"\t");
                System.out.print(sheet.getRow(i).getCell(1).getNumericCellValue()+"\t");
                System.out.print(sheet.getRow(i).getCell(2).getNumericCellValue()+"\t");
                System.out.print(sheet.getRow(i).getCell(3).getStringCellValue()+"\t");
                System.out.println(sheet.getRow(i).getCell(4).getDateCellValue());
                wkbook.close();
                in.close();
            }
    }
     catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    void read_excel_store_2darray(){
        Object[][] arr=new Object[0][0];
        try{
        URL url=new URL("https://docs.google.com/spreadsheets/d/1SEd3S3OY4tu9MsDsi6juTDogwMm4J_Kt/export?format=xlsx");
        System.out.println(url);
        //  FileInputStream excel=new FileInputStream(file);
        InputStream in=url.openStream();
        wkbook=WorkbookFactory.create(in);
        sheet=wkbook.getSheetAt(0);
        //wkbook=new XSSFWorkbook(in);
        //sheet=wkbook.getSheet("sheet1");
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
        wkbook.close();
        in.close();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    public void write_excel() {
            try{
                URL url=new URL("https://docs.google.com/spreadsheets/d/1SEd3S3OY4tu9MsDsi6juTDogwMm4J_Kt/export?format=xlsx");

                System.out.println(url);
                //  FileInputStream excel=new FileInputStream(file);
                InputStream in=url.openStream();
                wkbook=WorkbookFactory.create(in);
                sheet=wkbook.createSheet("sheet2");
                Row row=sheet.createRow(0);
                org.apache.poi.ss.usermodel.Cell cell=row.createCell(0);
                cell.setCellValue("Manu");
                cell=row.createCell(1);
                cell.setCellValue(2000.5);
              //  wkbook=new XSSFWorkbook();
              //OutputStream out=url.;
               // FileOutputStream out=new FileOutputStream(file);
                //wkbook1.write(out);
                // wkbook.close();
                //out.close();
                wkbook.close();
                in.close();
               
                
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        public static void main(String[] args) {
        
        OnlineExcelHandling eh=new OnlineExcelHandling();
        eh.read_excel();
        eh.read_excel_store_2darray();
       // eh.write_excel();
        
        }

    
}
