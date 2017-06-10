public class CaesarCipher {

    public static String encrypt(String m, int e) {
        char[] chars = m.toCharArray();

        char c;

        for (int i = 0; i < chars.length; i++) {
            c = chars[i];
            if (c >= 65 && c <= 90) {
                // capital letter
                c += (e % 26);
                if (c > 90) {
                    c -= 26;
                }
            } else if (c >= 97 && c <= 122) {
                // lowercase letter
                c += (e % 26);
                if (c > 122) {
                    c -= 26;
                }
            } else if (c != 32) {
                // Unless it's a space, throw exception
                throw new InvalidInputException("Invalid character: '" + c + "' - Must be [A-Z a-z].");
            }

            chars[i] = c;
        }

        return String.valueOf(chars);
    }

    public static String decrypt(String c, int e) {
        char[] chars = c.toCharArray();

        char ch;

        for (int i = 0; i < chars.length; i++) {
            ch = chars[i];
            if (ch >= 65 && ch <= 90) {
                // capital letter
                ch -= (e % 26);
                if (ch < 65) {
                    ch += 26;
                }
            } else if (ch >= 97 && ch <= 122) {
                // lowercase letter
                ch -= (e % 26);
                if (ch < 97) {
                    ch += 26;
                }
            } else if (ch != 32) {
                // Unless it's a space, throw exception
                throw new InvalidInputException("Invalid character: '" + ch + "' - Must be [A-Z a-z].");
            }

            chars[i] = ch;
        }

        return String.valueOf(chars);
    }
}