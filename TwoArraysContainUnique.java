import java.util.*;

public class TwoArraysContainUnique {
    public static void main(String[] args) {
      // Example arrays
        Integer arr1[] = {1, 3, 5, 77, 8};
        Integer arr2[] = {8, 77, 5, 3, 1};  // same unique elements, different order
        Integer arr3[] = {1, 3, 25, 77, 8};
        Set<Integer>set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
           Set<Integer> set3 = new HashSet<>(Arrays.asList(arr3));
        boolean issame = set1.equals(set2);
         System.out.println("Arrays contain same unique elements: " + issame);
          System.out.println("arr1 vs arr3: " + set1.equals(set3)); // false
    }
}
