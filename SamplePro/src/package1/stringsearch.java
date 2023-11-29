package package1;
public class stringsearch {
    public static void main(String[] args) {
        String str1="I love java";
        String str2="java";
        //search the ssubstring in string
        System.out.println("valueof str1= "+str1+"\nvalueof str2= "+str2);
        System.out.println("str1.contains(str2) "+str1.contains(str2));
        //see if the string starts with the substring
        System.out.println("str1.startsWith(str2) "+str1.startsWith(str2));
        //see if the string endswith the substring
        System.out.println("str1.endsWith(str2) "+str1.endsWith(str2));
        //see the index of letter you want
        System.out.println("str1.indexOf(\"j\") "+str1.indexOf("j"));
        //see the index of letter after the offset
        System.out.println("str1.indexOf(\"a\",9) "+str1.indexOf("a",9));
        //see the last indewx of the substring
        System.out.println("str1.lastIndexOf(\"a\") "+str1.lastIndexOf("a"));
    }
}
