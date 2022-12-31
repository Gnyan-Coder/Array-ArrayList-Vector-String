import java.util.*;

public class ArrayLists{
   public static void main(String[] args) {
     ArrayList<Integer> list=new ArrayList<Integer>();

    //  add elements
     list.add(2);
     list.add(3);
     list.add(2);
     System.out.println(list);

    //  get elements
    int ele=list.get(0);
    System.out.println(ele);

    // add element in between
    list.add(1,10);
    System.out.println(list);

    // set element
    list.set(0, 5);
    System.out.println(list);

    // delete element
    list.remove(2);
    System.out.println(list);

    // get size
    int size=list.size();
    System.out.println(size);

    // iterator or loops
    for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
    }

    // sorting
    Collections.sort(list);
    System.out.println(list);
   }
}