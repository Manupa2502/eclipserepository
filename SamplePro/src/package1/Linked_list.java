package package1;
import java.util.LinkedList;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class Linked_list {
    public static void main(String[] args) {
        //---------------------------------------LINKEDLIST--------------------------------
        var list=new LinkedList<>();
        list.add(10);//add element to list
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);
        list.get(0);//retieve the value of index 0
        list.set(3,100);//modify the value of list
        System.out.println(list.contains(10));//search for the element in the list
        System.out.println(list.isEmpty());//checks list is empty or not
        System.out.println(list.size());//get the size of the list
        System.out.println(list.getFirst());//get first element of list
        System.out.println(list.getLast());//get last element of list
        System.out.println(list.indexOf(10));//index of list
        System.out.println(list.lastIndexOf(10));//last index of list
        System.out.println(list.peekFirst());//retrieve first elemnet of list
        System.out.println(list.peekLast());//retrieve last elemnet of list
        System.out.println(list.pollFirst());//retrieve and remove first element of list
        System.out.println(list.pollLast());//retrieve and remove last element of list
        System.out.println(list.remove(0));//remove element from index 0
        System.out.println(list.remove(1));//remove element from index 1
        System.out.println(list.toArray());//convert linled list to array
       // list.clear();
       //enhanced for loop for linked list
       for(var a:list){
        System.out.println(a);
       }
       //iterator for linked list
       java.util.Iterator<Object> it1=list.iterator();
       while(it1.hasNext()){
        System.out.println(it1.next());
       }
    }
    
}
