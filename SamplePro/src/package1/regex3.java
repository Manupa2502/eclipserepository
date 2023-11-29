package package1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex3 {
    public static void main(String[] args) {
        
    //get all the amounts in the string mrp $123.55 and discount is $10.55 total need to paid is $113.55
    String str1="get all the amounts in the string mrp $1256646543.5556575 and discount is $15765650.5567657 total need to paid is $0.55";
    String pattern="\\$\\d{1,}\\.\\d{2,}";
    Pattern p=Pattern.compile(pattern);
    Matcher m=p.matcher(str1);
    System.out.println("count :"+m.results().count());
    m.reset();
    while(m.find()){
        System.out.println("starts from : "+ m.start());
        System.out.println(m.group());
    }
    }
    
}
