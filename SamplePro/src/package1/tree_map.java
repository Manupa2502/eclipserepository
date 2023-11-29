package package1;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class tree_map {
    //----------------------------------------------TREEMAP------------------------
    public static void main(String[] args) {
        TreeMap<Integer,String> tmap=new TreeMap<>();//createb tree map
        tmap.put(1, "a");//add element to map
        tmap.put(2, "e");
        tmap.put(3, "d");
        tmap.put(4, "b");
        tmap.put(5, "c");
        tmap.put(6, "f");
        System.out.println(tmap);//display all elemenets of map
        System.out.println(tmap.get(1));//retrieve element of map
        System.out.println(tmap.isEmpty());//check map is empty
        System.out.println(tmap.remove(2));//remove a key 2
        System.out.println(tmap.remove(3, "d"));//remove key 3
        System.err.println(tmap.replace(5, "c", "z"));//update "c" to "z" for key 5
        System.out.println(tmap.containsKey(4));//search for key 4
        System.out.println(tmap.containsValue("c"));//search for value "c"
        System.out.println(tmap.firstKey());//return first key
        System.out.println(tmap.lastKey());//return last key
        System.out.println(tmap.lowerKey(2));//return lowest key
        System.out.println(tmap.higherKey(2));//return highest key
        System.out.println(tmap.subMap(1, false, 4, false));//create submap from key 1,4

        //convert the Map to List

        List<Integer> list1=new LinkedList<>();
        List<String> list2=new LinkedList<>();
        var list3=new LinkedList<>();
        list1.addAll(tmap.keySet());
        list2.addAll(tmap.values());
        list3.addAll(tmap.entrySet());
        System.out.println(list1+"\n "+list2+"\n "+list3);

//convert Map to Set
        Set<Integer> set1=new HashSet<>();
        Set<String> set2=new HashSet<>();
        var set3=new HashSet<>();
        set1.addAll(tmap.keySet());
        set2.addAll(tmap.values());
        set3.addAll(tmap.entrySet());
        System.out.println(set1+"\n "+set2+"\n "+set3);

   //enhanced for loop
   for(Entry a:tmap.entrySet())   {
    System.out.println(a);
   }  
//inbuilt iterator

java.util.Iterator<Entry<Integer, String>> it1=tmap.entrySet().iterator();
while(it1.hasNext()){
    System.out.println(it1.next());
}

    }
    
}
