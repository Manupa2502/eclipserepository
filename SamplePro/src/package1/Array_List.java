package package1;
import java.util.ArrayList;

//*import javax.swing.text.html.HTMLDocument.Iterator;
public class Array_List {
    /**
     * @param args
     */
    //---------------------------ARRAYLIST--------------------------------
    public static void main(String[] args) {
        ArrayList<Integer> arraylist=new ArrayList();
        arraylist.add(10);//used to insert a value to a list
        arraylist.add(20);
        arraylist.add(30);
        arraylist.add(40);
        arraylist.add(50);
        arraylist.add(60);
        System.out.println(arraylist);//display the all elements of the list
        System.out.println(arraylist.size());//used to find the size of list number of elements
        System.out.println(arraylist.isEmpty());//checks whether list is empty or not
      //  arraylist.clear(); used to delete all the elements in the list
        System.out.println(arraylist.contains(10));//checks whether the list contains the element or not
        System.out.println(arraylist.indexOf(10));//gives the index of element
        System.out.println(arraylist.lastIndexOf(30));
        System.out.println(arraylist.remove(2));//deletes specified element in the list using index
        System.out.println(arraylist.toArray());//converts list to Array
        //enhanced for loop to display list elements
        for(int a:arraylist){
            System.out.println(a);
        }
        //using Iterator in built function iterating list
        java.util.Iterator<Integer> it1=arraylist.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
    }
    
}
