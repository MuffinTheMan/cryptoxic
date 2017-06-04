import java.io.*;
/*
 * Main Application file.
 */
public class App {
    public static void main (String[] args) throws IOException {
        // ===== Begin SimpleShiftBlockCipher ===== //
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

        SimpleShiftBlockCipher ssbc = new SimpleShiftBlockCipher();

        String c = ssbc.encrypt(m,e);

        System.out.println("Encrypted message: " + c);
        System.out.println("Plain text message: " + ssbc.decrypt(c,e));
        // ===== End SimpleShiftBlockCipher ===== //
    }
}