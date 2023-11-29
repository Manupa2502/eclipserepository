package package1;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class hash_map {
    public static void main(String[] args) {
        //----------------------------------------------------HASHMAP--------------------------
        Map<Integer,String> hmap=new HashMap<>();//craete A Hash Map has <index,value>
        hmap.put(1,  "a");//add elemnt to map as <index,value>
        hmap.put(2,  "f");
        hmap.put(3,  "b");
        hmap.put(4,  "c");
        hmap.put(5,  "e");
        hmap.put(6,  "d");
        System.out.println(hmap); //dispaly the Hash map
        System.out.println(hmap.get(1));//retrieve hashmap value
        System.out.println(hmap.size());//get the total size of map
        System.out.println(hmap.containsKey(3));//search for key int he map
        System.out.println(hmap.containsValue("a"));//search for value in map
        System.out.println(hmap.isEmpty());//checks whether empty or not
        System.out.println(hmap.remove(2));//delete the value where key is 2
        System.out.println(hmap.replace(3, "b", "z"));//replace oldvalue with new for key 3
        System.out.println(hmap.replace(6, "e"));//replace key 6 value to "e"
        System.out.println();
        //hmap.clear();
        //convert the Map to List

        List<Integer> list1=new LinkedList<>();
        List<String> list2=new LinkedList<>();
        var list3=new LinkedList<>();
        list1.addAll(hmap.keySet());
        list2.addAll(hmap.values());
        list3.addAll(hmap.entrySet());
        System.out.println(list1+"\n "+list2+"\n "+list3);

//convert Map to Set
        Set<Integer> set1=new HashSet<>();
        Set<String> set2=new HashSet<>();
        var set3=new HashSet<>();
        set1.addAll(hmap.keySet());
        set2.addAll(hmap.values());
        set3.addAll(hmap.entrySet());
        System.out.println(set1+"\n "+set2+"\n "+set3);

//For loop to iterate the Map
        for(java.util.Map.Entry<Integer, String> a:hmap.entrySet() ){
            System.out.println(a);
        }
//Inbuilt iterator to iterate map        
        java.util.Iterator<java.util.Map.Entry<Integer, String>> it1=hmap.entrySet().iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

    }


}
