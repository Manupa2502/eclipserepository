package package1;
public class stringbiulder {
    public static void main(String[] args) {
        StringBuilder b1=new StringBuilder("I love java");
        
        System.out.println("b1.append(\" but not a..\") "+b1.append(" but not a.."));
        System.out.println("b1.insert(7,\"everthing except \") "+b1.insert(7,"everthing except "));
        System.out.println("b1.delete(14, 22)"+b1.delete(14, 22));
        System.out.println("b1.reverse()"+b1.reverse());

    }
    
}
