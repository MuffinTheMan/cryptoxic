/*
    This is perhaps the simpliest block cipher. Each block is of length (t) '1' meaning each character is
    shifted 'e' (user supplied) characters to the right
*/

import java.io.*;

public class ShiftBlockCipher {

    public static void main (String[] args) throws IOException {
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

        String c = encrypt(m,e);

        System.out.println("Encrypted message: " + c);
        System.out.println("Plain text message: " + decrypt(c,e));
    }

    public static String encrypt(String m, int e) {
        char[] chars = m.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] += e;
        }

        return String.valueOf(chars);
    }

    public static String decrypt(String c, int e) {
        char[] chars = c.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] -= e;
        }

        return String.valueOf(chars);
    }
}