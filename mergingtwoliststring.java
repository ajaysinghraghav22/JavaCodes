import java.util.*;
public class mergingtwoliststring {
    public static void main(String[] args) {
        List<Integer>li = new ArrayList<>();
        li.add(4);
        li.add(7);
        List<Integer>l2 = new ArrayList<>();
        li.add(43);
        List<Integer>l3 = new ArrayList<>(li);
        l3.addAll(l2);
System.out.println(l3);
    }
}
