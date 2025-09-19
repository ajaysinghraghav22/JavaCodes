import java.util.Arrays;
import java.util.List;

public class ListConatinOdd {
    public static void main(String[] args) {
        List <Integer> num = Arrays.asList(41,51,61,455,61);
        boolean iscontain = true;
        for(int n :num){
            if(n % 2 == 0){
                iscontain = false;//this for complete list not having single odd value
                break;
            }
        }
        if(iscontain){
            System.out.println("List Contain odd number ");
        }
        else{
            System.out.println("List does not contain any odd number");
        }

    }
}
//   if (n % 2 != 0) {   // check if odd
//                 iscontain = true; for for single value check is odd or not
//                 break;