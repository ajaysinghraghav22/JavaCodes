import java.util.Scanner;

public class Stringispalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isbool =true;
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        int len = str.length();
        if(len==1){
             System.out.println(" String is not a palindrome (only one character)");
            return;

        }
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len -1-i)) {

            isbool =false;
            break;
            }
        }
        if(isbool){
            System.out.println("string is palindrom ");
        }
        else{
            System.out.println("string is not a palindrom ");
        }

    }
}
