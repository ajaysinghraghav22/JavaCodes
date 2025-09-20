import java.util.*;
public class ArrayShuffle {
    public static void main(String[] args) {
        Integer arr[] = {32,42,94,34,22,13};
       /*  List<Integer>s1 = Arrays.asList(arr);
        System.out.println(s1);
        Collections.shuffle(s1);//this is by collections
        System.out.println(Arrays.toString(arr));*/
        Random rand = new Random();
        for(int i = 0 ;i<arr.length;i++){
            int randomnum = rand.nextInt(arr.length);// random index
            int temp= arr[i];
            arr[i] =arr[randomnum];
            arr[randomnum] = temp;

        }
 System.out.println("Shuffled array: " + Arrays.toString(arr));

    }
    
}
