import java.util.*;
public class removetrailingspace {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       str = str.strip();
       System.out.println(str); 
    }
    
}
