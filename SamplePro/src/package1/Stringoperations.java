package package1;
public class Stringoperations {
    public static void main(String[] args) {
        String str1="ABCD";
        String str2="efgh";
        int a=20;
        String str3="    abcderf         ";
        String str4="";
        System.out.println("value of str1 ="+str1+"\nvalue of str2 ="+str2+"\nvalue of str3 ="+str3+"\nvalue of str4 ="+str4+"\nvalue of a ="+a);
        //concatenate two strings
        System.out.println("str1+str2 "+str1+str2);
        //concatenate string and int
        System.out.println("a+str1 "+a+str1);
        //cancatenate using function
        System.out.println("str1.concat(str2) "+str1.concat(str2));
        //removing leading and trailing spaces
        System.out.println("str3.trim() "+str3.trim());
        //converting to upper
        System.out.println("str2.toUpperCase() "+str2.toUpperCase());
        //converting to lower
        System.out.println("str1.toLowerCase() "+str1.toLowerCase());
        System.out.println("str4.isEmpty() "+str4.isEmpty());

    }
}
