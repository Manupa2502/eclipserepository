package package1;
public class conditionalstatements {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("value of a= "+a+" b= "+b);
        //if condition
        if(a<=b){ //execute only if condition is true dont have false execution
            System.out.println("a<=b "+ (a<=b));
        }
        //
        //if-else condition
        if (a==b){  //if condition evaluates the condition for true or false based on result it will act further
            System.out.println("a==b "+(a==b)); //condition1 
        }
        else { //if condition is false it will execute else
            System.out.println("a==b "+(a==b)); //defualt-condition
        }    
        //
        //else if condition
        if(a==b){ //elseif condition will execute only one part based on condition is true if all condion is false it will execute the else 
            System.out.println("a==b "+(a==b)); //condition1;
        }else if(a>b){
            System.out.println("a>=b "+(a>b));//condition2;
        }else if(a>b){
            System.out.println("a!=b "+(a!=b));//condition2;
        }else{
            System.out.println("b>=a "+(b>a));//default-condition3;
        }

        //
    }
}
