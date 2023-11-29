package package1;
import java.util.Scanner;

public class scannerclass {
    public static void main(String[] args) {
        
    Scanner st=new Scanner(System.in);
    System.out.println("enter a string");
    String str1=st.nextLine();
    System.out.println("enter a int");
    int a=st.nextInt();
    String temp="";
    for(int i=0;i<str1.length();i++){
      temp=str1.charAt(i)+temp;  
    }
    System.out.println("reversed string "+temp);
    st.close();
    }
}
