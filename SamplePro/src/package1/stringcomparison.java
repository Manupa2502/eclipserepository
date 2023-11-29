package package1;
public class stringcomparison {
    public static void main(String[] args) {
        String str1="ABCD";
        String str2="abcd";
        String str3="ABCDEFG";
        String pattern="[A-Z]{1,}";
        //compare case sensitive two string are equal or not
        System.out.println("value of str1= "+str1+"\nvalue of str2= "+str2);
        System.out.println("str1.equals(str2) "+str1.equals(str2));
        //compare two strings ignoring case 
        System.out.println("str1.equalsIgnoreCase(str2) "+str1.equalsIgnoreCase(str2));
        //compare two string and get camel case value
        System.out.println("str1.compareTo(str2) "+str1.compareTo(str2));
        //compare two string and get camel case value ignoring case senitive
        System.out.println("str1.compareToIgnoreCase(str2) "+str1.compareToIgnoreCase(str2));
        //comapring the string based on pattern
        System.out.println("value of str3= "+str3+"\nvalue of pattern"+pattern);
        System.out.println("str3.matches(pattern) "+str3.matches(pattern));

    }
    
}
