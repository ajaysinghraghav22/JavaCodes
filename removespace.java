import java.util.Scanner;

public class removespace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int len = str.length() - 1;
        String RemString = " ";

        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                RemString = RemString + ch;
            }
        }
        System.out.println(RemString);

    }
}
