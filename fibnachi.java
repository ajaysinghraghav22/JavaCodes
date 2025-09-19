import java.util.Scanner;

public class fibnachi {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number\n");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;

        }
    }

}
