public class SimpleShiftBlockCipher {

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