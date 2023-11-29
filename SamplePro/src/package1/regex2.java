package package1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex2 {
    //greedy and lazy match
    public static void main(String[] args) {
        // use the ? for nongreedy method when you using count() multiple computations on string
    
        String str1="XXhjghjghjghjghYYvnvXXnvnbvnvvvYYjghgXXghjghghffgfgfgfgfgfgfYYhhgh";
       //--------------------------------------NO PROPER RESULT-------------------- 
        String pattern="XX.*YY";
        System.out.println("no proper result for pattern "+pattern);
        Pattern p=Pattern.compile(pattern);   
        Matcher m=p.matcher(str1);
        System.out.println("count:"+m.results().count());
        m.reset();
        
        while(m.find()){
            
            System.out.println("startsat "+m.start());
            System.out.println(m.group());
        }

        //-----------------------------------PROPER RESULT----------------------------
        pattern="XX.*?YY";
        System.out.println("proper result for pattern "+pattern);
        Pattern p1=Pattern.compile(pattern);   
        Matcher m1=p1.matcher(str1);
        System.out.println("count:"+m1.results().count());
        m1.reset();
        
        while(m1.find()){
            
            System.out.println("startsat "+m1.start());
            System.out.println(m1.group());
        }
}
}