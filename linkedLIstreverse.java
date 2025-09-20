
//import java.util.LinkedList;
import java.util.*;

public class linkedLIstreverse {

    
    public static void main(String[] args) {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(3);
        li.add(183);
        li.add(33);
        li.add(323);
        System.out.println(li);
        // LinkedList<Integer> li2 = new LinkedList<>();
        // li.descendingIterator().forEachRemaining(li2::add);
        LinkedList<Integer> li2 = new LinkedList<>(li);
        Collections.reverse(li2);
System.out.println(li2);
    }
}
