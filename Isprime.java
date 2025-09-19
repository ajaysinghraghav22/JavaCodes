import java.util.Scanner;

public class Isprime {
    public static void main(String[] args) {
        System.out.println("Enter the Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime=true;
        if (n <= 1) {
            isprime = false;
        }
        if (n % 2 == 0) {
            isprime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isprime = false;
                    break;
                }
            }
        }
        if (isprime) {
            System.out.println(" is a prime number.");
        } else {
            System.out.println(" is not a prime number.");
        }
    }

}
