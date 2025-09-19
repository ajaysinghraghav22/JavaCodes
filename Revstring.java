
public class Revstring {

    public static void main(String[] args) {
        String str = "ajaysingh";
        int strlen = str.length() - 1;
        String rev = " ";
        System.out.println("length od syring is: " + strlen+1);
        for (int i = strlen; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed: " + rev);

    }
}  
