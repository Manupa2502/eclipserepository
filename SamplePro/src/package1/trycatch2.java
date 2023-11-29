package package1;
import java.io.File;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;
//import java.util.logging.FileHandler;

public class trycatch2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try{
         File f=new File("C:\\Users\\SVYOVW744\\Desktop\\javausage.txt");
         Scanner sc=new Scanner(f);
         while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
         }
        }
        catch(FileSystemNotFoundException e){
            System.out.println(e);
        }
        catch(NullPointerException e){
            System.out.println(e);
        } 
        catch(Exception e){
            System.out.println(e);
        }
        //finally block will execute without any interwnsion from try or catch 
        finally{
            System.out.println("end of read");
        }
    }
    
}
