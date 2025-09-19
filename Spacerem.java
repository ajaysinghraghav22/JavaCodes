import javax.security.auth.kerberos.KerberosKey;

public class Spacerem {
    public static void main(String[] args) {
        String rev = "ajay Singh ta";

        String result = rev.replace(" ", "");

        System.out.println("Original: " + rev);
        System.out.println("Without spaces: " + result);
    }
}
