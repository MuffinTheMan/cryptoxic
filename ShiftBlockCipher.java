/*
    This is perhaps the simpliest block cipher. Each block is of length (t) '1' meaning each character is
    shifted 'e' characters to the right
*/

import java.util.Scanner;

public class ShiftBlockCipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your shift value? ");
        Integer e = scanner.nextInt();

        System.out.print("Enter your plain text message: ");
        String s = scanner.next();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            chars[i] += e;
        }

        System.out.println("Encrypted message: " + String.valueOf(chars));

        for (int i = 0; i < chars.length; i++) {
            chars[i] -= e;
        }

        System.out.println("Plain text message: " + String.valueOf(chars));
    }

}