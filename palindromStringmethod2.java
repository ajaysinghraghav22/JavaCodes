
/*import java.util.Scanner;

public class palindromStringmethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ispal = true;
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        int strlen = 0;
        int end = str.length() - 1;
        while (strlen < end) {
            if (str.charAt(strlen) != str.charAt(end)) {
                ispal = false;
            }
            strlen++;
            end--;
        }
        if (ispal) {
            System.out.println("it is a palindrom string :");
        } else {
            System.out.println("it is not a palindrom string :");
        }
    }
} method 1*/
import java.util.Scanner;

public class palindromStringmethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ispal = false;
        
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        if (str.equals(rev)) {
            ispal = true;
        }
        if(ispal){
            System.out.println("it is a palindrom ");
        }
        else{
            System.out.println("not a palindrom :");
        }
    }
}