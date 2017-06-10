import java.io.*;
import java.util.*;
import java.lang.*;

/*
 * Main Application file.
 */
public class App {
    public static void main(String[] args) throws IOException {
        switch (args[0]) {
            case "cs":
                caesarCipher(args[1]);
                break;
            default:
                System.out.println("Please provide a valid program option as your first argument from the following: 'cs' (Caesar Cipher)");
        }
    }

    public static void caesarCipher(String fName) throws IOException {
        File f = new File(fName);
        BufferedReader buffer = new BufferedReader(new FileReader(f));
        String line;

        int e = 0;
        String m = "";

        while ((line = buffer.readLine()) != null) {
            if (e == 0) {
                e = Integer.parseInt(line);
            } else {
                m = line;
            }
        }

        CaesarCipher ssbc = new CaesarCipher();

        try {
            String c = ssbc.encrypt(m,e);
            System.out.println("Encrypted message: " + c);
            System.out.println("Plain text message: " + ssbc.decrypt(c,e));
        } catch (InvalidInputException excep) {
            System.out.println(excep);
        }
    }
}