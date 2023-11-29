package package1;
import java.util.Scanner;

public class App {
    public void Qame()
    {
        System.out.println("displaying using inheritence");
    }
    /**
     * @param args
     */

     public static void main(String[] args) {

        Scanner st =new Scanner(System.in);
        Integer Name=st.nextInt();
        if(Name==1)
        {
        switch(Name)
        {
            case 1:
            {
               System.out.println("entered 1");
               break;
            }
               case 2:
             {
               System.out.println("enetred 2");
               break;
             }
               default:
               {
                System.out.println("not there on list"); 
                break;   
               }
        }
        st.close();
    }

        System.out.println("myname is "+Name);
        App ap1=new App();
        ap1.Qame();
    }
    
}
 

