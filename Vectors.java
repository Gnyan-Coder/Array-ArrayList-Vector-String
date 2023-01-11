import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();
        // added the element in the vector
        vector.add(15);
        vector.add(20);
        System.out.println(vector);
        // accessing the element from the vector
       int ele= vector.get(0);
       System.out.println(ele);

       Iterator<Integer> iterate=vector.iterator();
       while(iterate.hasNext()){
        System.out.println(iterate.next());

        // remove the element from the vector
        vector.remove(0);
        System.out.println(vector);
        
       }
    }
}
