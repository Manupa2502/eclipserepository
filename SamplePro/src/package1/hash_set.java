package package1;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class hash_set {
    public static void main(String[] args) {
        //---------------------------------------HASHSET-----------------------------
        var set=new HashSet<>();
        HashSet<Integer> set1=new HashSet<>();
        set.add(10);//add element to set
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(70);
        set.add(80);
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(90);
        set1.add(100);
        set1.add(110);
        System.out.println(set);//print the set
        System.out.println(set.size());//size of the set
        System.out.println(set.isEmpty());//checks the size is empty
        System.out.println(set.contains(10));//search for the element in the set
        System.out.println(set.remove(10));//remove the element from the set
        System.out.println(set.toArray());//convert set into a array
        System.out.println(set.addAll(set1));//it is like set union set1,it will retain all elements and remove the duplicates
        System.out.println(set.retainAll(set1));//it is like set intersection set1 retains only the common elements
        //convert from Hashset to LIST
        List<Integer> list=new LinkedList<>();
        list.addAll(set1);
        System.out.println(list);

        //set.clear()
    }
    
}
