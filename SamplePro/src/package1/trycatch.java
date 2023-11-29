package package1;

public class trycatch {
    //exception is the runtime errors where you dont get error while compiling
    //we need to handle the exceptions using try catch
    //if exception occured inside try catch the program will not fail
    //possible exceptions we need specify on the multiple ctaches
    //the precedence or order on the ctach block should be child, child,child,parent
    //try{}catch(exception e){}
    //we can use throws as well in the methods for exception handling
    //either exception occured or not occured finally block will execute 
    
    //throwing exception
    void abc() throws Exception {
          int a=10/0;
        }
    public static void main(String[] args) {
        //try ctach block
        try{
            trycatch tc=new trycatch();
            tc.abc();
            System.out.println(100/10);
        }
        catch(Exception e ){
            System.out.println(e);

        }
    }
    
}
