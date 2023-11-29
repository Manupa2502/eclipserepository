package package1;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class linkedhash_set {
    //------------------------------------LINKED HASHSET-----------------------------
    public static void main(String[] args) {
        LinkedHashSet<String> lhset=new LinkedHashSet<>();
        lhset.add("a");        
        lhset.add("d");
        lhset.add("b");
        lhset.add("e");
        lhset.add("c");
        lhset.add("f");
        lhset.add("g");
        System.out.println(lhset);
        System.out.println(lhset.contains("a"));
        System.out.println(lhset.isEmpty());
        System.out.println(lhset.size());
        System.out.println(lhset.remove("d"));
        System.out.println(lhset.toArray());
        System.out.println();

        List<String> list1=new LinkedList();
        list1.addAll(lhset);
        System.out.println(list1);

        Set<String> set1=new HashSet<>();
        set1.addAll(lhset);
        System.out.println(set1);

        for(String a:lhset){
            System.out.println(a);
        }
        java.util.Iterator<String> it1=set1.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

        
    }
    
}
