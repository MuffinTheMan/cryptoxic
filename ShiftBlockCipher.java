/*
    This is perhaps the simpliest block cipher. Each block is of length (t) '1' meaning each character is
    shifted 'e' (user supplied) characters to the right
*/

import java.util.Scanner;

public class ShiftBlockCipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your shift value? ");
        int e = scanner.nextInt();

        System.out.print("Enter your plain text message: ");
        String m = scanner.next();

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