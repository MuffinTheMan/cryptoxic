import java.io.*;
/*
 * Main Application file.
 */
public class App {
    public static void main (String[] args) throws IOException {
        // ===== Begin CaesarCipher ===== //
        File f = new File(args[0]);
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

        String c = ssbc.encrypt(m,e);

        System.out.println("Encrypted message: " + c);
        System.out.println("Plain text message: " + ssbc.decrypt(c,e));
        // ===== End CaesarCipher ===== //
    }
}