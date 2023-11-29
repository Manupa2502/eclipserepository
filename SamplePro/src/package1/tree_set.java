package package1;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class tree_set {
    //------------------------------------------TREESET---------------------------
    public static void main(String[] args) {
        TreeSet<String> tset=new TreeSet<>();//cretae a TREESET
        tset.add("a");//add new elemne t0 to treeset
        tset.add("c"); 
        tset.add("b"); 
        tset.add("e"); 
        tset.add("d");  
        tset.add("f"); 
        System.out.println(tset);//print treeset
        System.out.println(tset.size());//find the size of treeset
        System.out.println(tset.isEmpty());//checks the TREESET is empty
        System.out.println(tset.subSet("a", false, "c", false));//creates a subset
        System.out.println(tset.first());//retrieves first element of list
        System.out.println(tset.last());//retrieves last element of treeset
        System.out.println(tset.remove("a"));//remove "a" from set
        System.out.println(tset.contains("d"));//search for "d" in the SET
        System.out.println(tset.pollFirst());//retrieves and removes first element of set
        System.out.println(tset.pollLast());//retrieves last element of the set
         TreeSet<String> tset1=new TreeSet<>();
         tset.add("a");
        tset.add("x"); 
        tset.add("b"); 
        tset.add("y"); 
        tset.add("z"); 
        System.out.println(tset.addAll(tset1));//union of two sets
        System.out.println(tset.retainAll(tset1));//intersection of two sets
        //converting into list
        List<String> list=new LinkedList<>();
        list.addAll(tset1);
        System.out.println(list);
        //enhanced for loop for SET
        for(String a:tset1){
            System.out.println(a);
        }
        //inbuilt Iterator for the set
        java.util.Iterator<String> it1=tset.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }


    }
    
}
