package package1;
public class regex1 {
    //* =zero or more occureneces of preceding character
    //+ = one or more occurence of preceding chratcter
    //. dot = any one charater
    //$ = end of the String
    //? = 0 or 1 occurences of the preceding character 
    //() = used to group more one character 
    //{} = used to specify the ocurences
    //{max} = used to specify maximun number of occurence
    //{min,max} used to specify the minimum and maximum number of occureneces
    //(){min,} used to specify minimum occurences without maximum limit
    // \\d = matches single digit number
    // \\w = matches single word character 
    // \\s = matches single space
    // \\D = matches single non-digit character
    // \\W = matches single non-word character
    //[] - used to pick the single character within the set 
    //A-Z,a-z,0-9 using hiphen(-) for using ranges
    //  A-Z =A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,,X,Y,Z
    //  a-z = a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z 
    //  0-9 = 0,1,2,3,4,5,6,7,8,9
    // | is used as OR condition for if you have multiple options
    
    public static void main(String[] args) {

        String pattern="abc*";//{ab,abc,abcc,abccc,abccccc}* means zero or more occureneces of preceding character
        String str1="ab";
        System.out.println(str1.matches(pattern));

        pattern="abc+";//{abc,abcc,abccc,abcccc} + means one or more occurence of preceding chratcter
        str1="abc";
        System.out.println(str1.matches(pattern));

        pattern="abc.";//{abc,abcd,abca,abce,abc$,abc%,abc&.......} dot means any one charater
        str1="abc%";
        System.out.println(str1.matches(pattern));
        
        pattern="abc?";//{ab,abc} ? means 0 or 1 occurences of the preceding character 
        str1="ab";
        System.out.println(str1.matches(pattern));

        pattern="(ab){2}";//{abab} () used to group more one character and {} is used to specify the ocurences
        str1="abab";
        System.out.println(str1.matches(pattern));

        pattern="(ab){2,4}";//{abab,ababab,abababab} (){min,max} used to specify the minimum and maximum number of occureneces 
        str1="abababab";
        System.out.println(str1.matches(pattern));

        pattern="(ab){2,}";//{ab,abab,abab,ababab,abababab,ababababab........}(){min,} used to specify minimum occurences without maximum limit
        str1="abababababababab";
        System.out.println(str1.matches(pattern));
        System.out.println("------------------");
        pattern="\\d{2}";// {0-9} maches single digit character
        str1="11";
        System.out.println(str1.matches(pattern));

        pattern="\\w";//{A-Za-z}matches single word character
        str1="a";
        System.out.println(str1.matches(pattern));

        pattern="\\s";//{A-Za-z}matches single space
        str1=" ";
        System.out.println(str1.matches(pattern));

        pattern="\\W";//{^A-Za-z};matches single non-word character
        str1="%";
        System.out.println(str1.matches(pattern));

        pattern="\\D";//{^0-9} single non-digit character
        str1="a";
        System.out.println(str1.matches(pattern));

        pattern="[crbms]at";//{cat,rat,bat,mat,sat} []selecting only one character inside the brackets
        str1="cat";
        System.out.println(str1.matches(pattern));

        pattern="[A-Za-z0-9]";//A-Z from A to Z a-z from a to z 0-9 from 0 to 9 
        str1="A";
        System.out.println(str1.matches(pattern));

        pattern="[^A-Za-z0-9]";// {not (A-Za-z0-9)} ^ used for not condition  
        str1="(";
        System.out.println(str1.matches(pattern));

        pattern="(ABCD|abcd|1234)";//{ABCD,abcd,1234} | is used for or condition
        str1="ABCD";
        System.out.println(str1.matches(pattern));
    }
}
