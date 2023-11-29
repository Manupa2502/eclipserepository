package package1;
import java.security.KeyStore.Entry;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class linkedhash_map {
    //----------------------------------------------------------LINKEDHASHMAP-----------------------------------
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhmap=new LinkedHashMap<>();
        lhmap.put(1,"a");
        lhmap.put(2,"e");
        lhmap.put(3,"b");
        lhmap.put(6,"f");
        lhmap.put(5,"c");
        lhmap.put(4,"g");
        lhmap.put(7,"d");
        lhmap.put(8,"h");
        System.out.println(lhmap);
        System.out.println(lhmap.get(1));
        System.out.println(lhmap.isEmpty());
        System.out.println(lhmap.size());
        System.out.println(lhmap.remove(4));
        System.out.println(lhmap.remove(3, "z"));
        System.out.println(lhmap.replace(5, "z"));
        System.out.println(lhmap.replace(8, "h", "x"));
        //hmap.clear();

        List<Integer> list1=new LinkedList<>();
        List<String> list2=new LinkedList<>();
        var list3=new LinkedList<>();
          list1.addAll(lhmap.keySet());
          list2.addAll(lhmap.values());
          list3.addAll(lhmap.entrySet());  
          System.out.println(list1+" \n"+list2+" \n"+list3);

         Set<Integer> set1=new HashSet<>();
        Set<String> set2=new HashSet<>();
        var set3=new HashSet<>();
          set1.addAll(lhmap.keySet());
          set2.addAll(lhmap.values());
          set3.addAll(lhmap.entrySet());  
          System.out.println(list1+" \n"+list2+" \n"+list3);
 
          for (java.util.Map.Entry<Integer, String> a:lhmap.entrySet()){
                System.out.println(a);
          }

          java.util.Iterator<java.util.Map.Entry<Integer, String>> it1=lhmap.entrySet().iterator();
          while(it1.hasNext()){
            System.out.println(it1.next());
          }
    }
    
}
