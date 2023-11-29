package package1;
public class stringreplace {
    public static void main(String[] args) {
        String str1="I1234 Love1234 java1234";
        String str2="1234";
        System.out.println("valueof str1= "+str1+"\nvalueof str2= "+str2);
        //replace all character in a String with substring
        System.out.println(str1.replace(str2, ""));

        //replace matching characters using pattern
        String str3="I*@#&$(*#@&$@#(&$(*#@))) Love#$**@#^$*&#^@$ java937459843";
        String pattern="[^A-Za-z\\s]";
        System.out.println("valueof str3= "+str3+"\nvalueof pattern= "+pattern);
        System.out.println("str3.replaceAll(pattern, \"\" "+str3.replaceAll(pattern, ""));
    }
}
