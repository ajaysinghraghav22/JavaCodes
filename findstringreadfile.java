
    import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class findstringreadfile {
    public static void main(String[] args) {
        String filename = "ajay.txt";
        String req = "thakur";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            boolean found = false;

            // Read file line by line
            while ((line = br.readLine()) != null) {
                if (line.contains(req)) {
                    found = true;
                    System.out.println("Found: " + line);
                }
            }

            // Print if not found
            if (!found) {
                System.out.println(req + " not found in the file.");
            }

        } catch (IOException e) {
            System.out.println("File not found or error reading file.");
        }
    }
}


